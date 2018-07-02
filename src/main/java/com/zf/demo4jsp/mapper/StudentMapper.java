package com.zf.demo4jsp.mapper;

import com.zf.demo4jsp.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value ="studentMapper")
public interface StudentMapper {

//    @Select("select * from student")
    List<Student> findAll();
}
