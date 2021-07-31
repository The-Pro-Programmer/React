package com.registrationsSystem_Spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registrationsSystem_Spring.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
