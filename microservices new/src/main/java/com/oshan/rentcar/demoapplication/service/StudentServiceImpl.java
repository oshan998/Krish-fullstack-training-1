package com.oshan.rentcar.demoapplication.service;


import com.oshan.rentcar.demoapplication.model.Student;
import com.oshan.rentcar.demoapplication.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student save(Student student){
        return studentRepository.save(student);
    }

    public Student fetchStudentById(int id){
        Optional<Student> student= studentRepository.findById( id);
        if(student.isPresent()){
            return student.get();
        }
        return null;
    }
}
