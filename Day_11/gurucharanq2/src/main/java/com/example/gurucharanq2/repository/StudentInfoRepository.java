package com.example.gurucharanq2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.gurucharanq2.model.StudentInfo;

@Repository
public interface StudentInfoRepository extends JpaRepository<StudentInfo,Integer>{
    
}