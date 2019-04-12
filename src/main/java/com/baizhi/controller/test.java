package com.baizhi.controller;

import com.baizhi.dao.UserMapper;
import com.baizhi.entity.Student;
import com.baizhi.entity.User;
import com.baizhi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class test {
    @Autowired
    private StudentService studentService;
    @Autowired
    UserMapper userMapper;
    @RequestMapping("/test")
    @ResponseBody
    public String test(){
       /* List<Student> list = studentService.select();
        for (Student student : list) {
            System.out.println(student);
        }*/
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
        return "jujingyi";
    }
}
