package com.spring.javacontainer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Scope;

@Configuration
@EnableAspectJAutoProxy

public class StudentsJavaContainer {
	@Bean
	 @Scope("prototype")
	public StudentsData student() {
		
		return new StudentsData();
	}
	
}
