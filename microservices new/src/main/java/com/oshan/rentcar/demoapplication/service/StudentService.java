package com.oshan.rentcar.demoapplication.service;

import com.oshan.rentcar.demoapplication.model.Student;

public interface StudentService {

    Student save(Student student);

    Student fetchStudentById(int id);
}
