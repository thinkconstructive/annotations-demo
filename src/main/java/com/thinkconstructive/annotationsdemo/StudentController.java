package com.thinkconstructive.annotationsdemo;

import org.springframework.web.bind.annotation.*;

import java.util.List;

//@Controller
//@ResponseBody
@RestController
@RequestMapping("/student")
public class StudentController {

    StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public List<Student> getStudent()
    {
        return studentService.getStudent();
    }

    @PostMapping("/")
    public Student createStudent(@RequestBody Student student)
    {
        return studentService.createStudent(student);
    }

    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student student)
    {
        return studentService.updateStudent(id, student);
    }

    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id)
    {
        studentService.deleteStudent(id);
        return "Student deleted successfully";
    }
}
