package com.lab.controller;

import com.lab.controller.utils.ReturnBean;
import com.lab.controller.utils.Token;
import com.lab.domain.User;
import com.lab.domain.People;
import com.lab.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/peoples")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @GetMapping
    public ReturnBean getAll(){
        return peopleService.getAll();
    }

    @GetMapping("/{id}")
    public ReturnBean getById(@PathVariable Integer id){
        return peopleService.getById(id);
    }

    @PostMapping
    public boolean save(@RequestBody People people){
        return peopleService.save(people);
    }

    @PutMapping
    public boolean update(@RequestBody People people){
        return peopleService.update(people);
    }

    @DeleteMapping("{id}")
    public boolean delete(@PathVariable Integer id){
        return peopleService.delete(id);
    }

    @GetMapping("/{pageNum}/{pageSize}")
    public ReturnBean getByPage(@PathVariable int pageNum, @PathVariable int pageSize){
        return peopleService.getByPage(pageNum,pageSize);
    }

}
