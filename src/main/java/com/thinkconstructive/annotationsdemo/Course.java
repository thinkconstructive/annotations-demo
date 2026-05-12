package com.thinkconstructive.annotationsdemo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Course {

    @Id
    private Long courseId;
    private String courseName;
    private int courseCapacity;
    private int enrolledCount;
}
