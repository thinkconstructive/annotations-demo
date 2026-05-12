package com.thinkconstructive.annotationsdemo;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Student createStudent(Student student)
    {
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student student)
    {
        Optional<Student> existingStudent = studentRepository.findById(id);

        if(existingStudent.isPresent()) {
            return studentRepository.save(student);
        }
        return new Student();
    }

    public void deleteStudent(Long id)
    {
        studentRepository.deleteById(id);
    }

}
