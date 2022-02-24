package com.lab.dao;

import com.lab.domain.People;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PeopleMapperTest {

    @Autowired
    private PeopleMapper peopleMapper;

    @Test
    void testGetById(){
        People people = peopleMapper.getById(1);
        System.out.println(people);
    }

    @Test
    void testGetAll(){
        System.out.println(peopleMapper.getAll());
    }

    @Test
    void testSave(){
        People people = new People();
        people.setSchoolId(10056);
        people.setName("兰博");
        people.setAge(22);
        people.setGender("男");
        people.setGrade("1");
        people.setTitle("硕士");
        System.out.println(peopleMapper.save(people));

    }

    @Test
    void testUpdateByid(){
        People people = new People();
        people.setId(7);
        people.setSchoolId(10056);
        people.setName("lanbao");
        people.setAge(22);
        people.setGender("男");
        people.setGrade("1");
        people.setTitle("硕士");
        peopleMapper.updateById(people);
    }

    @Test
    void testDeleteById(){
        peopleMapper.deleteById(7);
    }

    @Test
    void testGetPage(){
        System.out.println(peopleMapper.getPage(1,5));
    }
}
