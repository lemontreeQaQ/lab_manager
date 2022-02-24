package com.lab.service.impl;

import com.lab.controller.utils.ReturnBean;
import com.lab.dao.PeopleMapper;
import com.lab.domain.People;
import com.lab.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeopleServiceImpl implements PeopleService {
    @Autowired
    PeopleMapper peopleMapper;

    @Override
    public Boolean save(People people) {
        return peopleMapper.save(people) > 0;
    }

    @Override
    public Boolean update(People people) {
        return peopleMapper.updateById(people) > 0;
    }

    @Override
    public Boolean delete(Integer id) {
        return peopleMapper.deleteById(id) > 0;
    }

    @Override
    public ReturnBean getById(Integer id) {
        People people = peopleMapper.getById(id);
        ReturnBean bean = new ReturnBean();
        bean.setStatus(true);
        bean.setData(people);
        return bean;
    }

    @Override
    public ReturnBean getAll() {
        List<People> list = peopleMapper.getAll();
        ReturnBean bean = new ReturnBean();
        bean.setStatus(true);
        bean.setData(list);
        return bean;
    }

    @Override
    public ReturnBean getByPage(int pageNum, int pageSize) {
        List<People> list = peopleMapper.getPage(pageNum,pageSize);
        ReturnBean bean = new ReturnBean();
        bean.setStatus(true);
        bean.setData(list);
        int total = peopleMapper.getTotal();
        bean.setTotal(total);
        return bean;
    }
}
