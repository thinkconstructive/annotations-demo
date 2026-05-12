package com.thinkconstructive.annotationsdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EnrollmentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getCourse()
    {
        return courseRepository.findAll();
    }

    @Transactional (rollbackFor = Exception.class)
    public void registerStudentToCourse(Student student, Long courseId)
    {
        studentRepository.save(student);

        Course course = courseRepository.findById(courseId)
                .orElseThrow(() -> new RuntimeException("Course not found"));

        if(isFull(courseId))
        {
            throw new RuntimeException("Enrollment failed, Course is full");
        }

        course.setEnrolledCount(course.getEnrolledCount() + 1);
        courseRepository.save(course);
    }

    private Boolean isFull(Long courseId)
    {
        Optional<Course> courseDetails = courseRepository.findById(courseId);

        if(courseDetails.isPresent())
        {
            if(courseDetails.get().getEnrolledCount() <
            courseDetails.get().getCourseCapacity())
            {
                return false;
            }
            else
                return true;
        }
        return true;
    }
}
