package com.thinkconstructive.annotationsdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
@EnableConfigurationProperties(DatabaseProperties.class)
@Profile("dev | prod")
public class AnnotationsDemoApplication {

	private static DatabaseProperties databaseProperties;

	public AnnotationsDemoApplication(DatabaseProperties databaseProperties)
	{
		this.databaseProperties = databaseProperties;
	}

	public static DatabaseProperties getDatabaseProperties()
	{
		return databaseProperties;
	}

	public static void main(String[] args) {
		ApplicationContext applicationContext =
				SpringApplication.run(AnnotationsDemoApplication.class, args);

		System.out.println();
		System.out.println(getDatabaseProperties().url());
		System.out.println(getDatabaseProperties().username());
		System.out.println(getDatabaseProperties().password());
		System.out.println(getDatabaseProperties().poolSize());
	}
}
