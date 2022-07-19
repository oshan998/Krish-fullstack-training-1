package com.oshan.rentcar.demoapplication.repository;

import com.oshan.rentcar.demoapplication.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
