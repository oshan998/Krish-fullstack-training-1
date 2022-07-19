package com.oshan.rentcar.demoapplication.controller;

import com.oshan.rentcar.demoapplication.model.Student;
import com.oshan.rentcar.demoapplication.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

    @Autowired
    StudentService studentService;

    //map the request in to java method
    //this method capable to handle get and post both. with new modification in line 12 now it suppoert GET only.
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String greeting(){
        return "Hello Oshan Nanayakkara";
    }


    @RequestMapping(value = "/hello",method = RequestMethod.POST)
    public String greeting2(){
        return "Hello Oshan Nanayakkara POST";
    }


    @RequestMapping(value = "/student",method = RequestMethod.POST)
    public Student save(@RequestBody Student student){
        return studentService.save(student);
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ResponseEntity<Student> fetchStudent(@RequestParam int id){

        Student student= studentService.fetchStudentById(id);
        if(student==null){
          return   ResponseEntity.notFound().build();
        }else{
           return ResponseEntity.ok().body(student);
        }
    }
}
