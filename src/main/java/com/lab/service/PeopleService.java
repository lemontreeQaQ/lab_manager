package com.lab.service;

import com.lab.controller.utils.ReturnBean;
import com.lab.domain.People;

import java.util.List;

public interface PeopleService {
    Boolean save(People people);
    Boolean update(People people);
    Boolean delete(Integer id);
    ReturnBean getById(Integer id);
    ReturnBean getAll();
    ReturnBean getByPage(int pageNum, int pageSize);
}
