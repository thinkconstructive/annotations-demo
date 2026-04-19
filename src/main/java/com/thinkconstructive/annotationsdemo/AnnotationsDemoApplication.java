package com.thinkconstructive.annotationsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnnotationsDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(AnnotationsDemoApplication.class, args);
	}
}
