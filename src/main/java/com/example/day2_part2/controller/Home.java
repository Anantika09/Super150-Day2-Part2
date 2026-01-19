package com.example.day2_part2.controller;
import java.util.*;
import com.example.day2_part2.model.StudentModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
    @GetMapping("/")
    public List<StudentModel> getStudent(){
        List<StudentModel> students = new ArrayList<>();
        students.add(new StudentModel(1,"anantika","anantika@gmail.com"));
        students.add(new StudentModel(2,"khushi","khushi@gmail.com"));
        students.add(new StudentModel(3,"ananya","ananya@gmail.com"));
        students.add(new StudentModel(4,"ram","ram@gmail.com"));
        students.add(new StudentModel(5,"shyam","shyam@gmail.com"));

        return students;


    }
}
