package com.thinkconstructive.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/courseEnroll")
public class CourseEnrollmentController {

    @Autowired
    EnrollmentService enrollmentService;

    @GetMapping("/")
    public List<Course> getCourse()
    {
        return enrollmentService.getCourse();
    }

    @PostMapping("/{courseId}")
    public void registerStudentToCourse(@RequestBody Student student, @PathVariable Long courseId)
    {
        enrollmentService.registerStudentToCourse(student, courseId);
    }
}
