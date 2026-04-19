package com.thinkconstructive.annotationsdemo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getStudent()
    {
        return studentRepository.findAll();
    }
}
