package com.thinkconstructive.annotationsdemo;

import com.thinkconstructive.annotationsdemo.controller.CloudController;
import com.thinkconstructive.annotationsdemo.utility.value.ValueDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AnnotationsDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(AnnotationsDemoApplication.class, args);

		ValueDemo valueDemo = applicationContext.getBean(ValueDemo.class);
		System.out.println("Server Port = " + valueDemo.getServerPort());
		System.out.println("Welcome Message = " + valueDemo.getWelcomeMessage());
		System.out.println("DB Url = " + valueDemo.getDbUrl());
		System.out.println("User Name = " + valueDemo.getUserName());
		System.out.println("User Email = " + valueDemo.getUserEmail());

	}
}
