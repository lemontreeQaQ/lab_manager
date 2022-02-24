package com.lab.dao;

import com.lab.domain.People;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface PeopleMapper {

    @Select("select * from students where id = #{id}")
    People getById(Integer id);

    @Select("select * from students")
    List<People> getAll();

    @Insert("insert into students(id,school_id,name,age,gender,grade,title) values(#{id},#{schoolId},#{name},#{age},#{gender},#{grade},#{title})")
    int save(People people);

    @Update("update students set school_id=#{schoolId},name=#{name},age=#{age},gender=#{gender},grade=#{grade},title=#{title} where id=#{id}")
    int updateById(People people);

    @Delete("delete from students where id=#{id}")
    int deleteById(Integer id);

    @Select("select * from students limit #{pageNum},#{pageSize}")
    List<People> getPage(int pageNum,int pageSize);

    @Select("select count(*) from students")
    int getTotal();



}
