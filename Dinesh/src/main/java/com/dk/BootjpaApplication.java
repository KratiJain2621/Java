package com.dk;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dk.model.Dummy;

@SpringBootApplication
@ComponentScan (basePackages = {"com.dk.model", "com.dk.bootjpa", "com.dk"} )
public class BootjpaApplication {
/*
spring.datasource.url=jdbc:mysql://localhost:3306/guardian22
spring.datasource.username=root
spring.datasource.password=password
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

3 methods for object creation:
1. Annotation component-scan : @Component, @Service @Repository
2. XML FILE : 
3. Configuration Class

 */
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(BootjpaApplication.class, args);
		

		//1. Annotation : object
		Separator separator = context.getBean(Separator.class);
		Map<String, Integer> map = separator.separateMarks("Krati=34, Rajan Gupta = 69, Sumit=59, Rajesh=88");
		System.out.println(map);
		
		//xml file : object
		ClassPathXmlApplicationContext ctx2 = new ClassPathXmlApplicationContext("beans.xml");
		ctx2.refresh();
		Dummy dum  = ctx2.getBean(Dummy.class);
		System.out.println(dum);
	
		//3. configuration class : object
		Object dirStrBean = context.getBean("dirStructureBean");
		System.out.println(dirStrBean);
		
//		Map map2 = context.getBean(Map.class); PRIMARY / SINGLE 
//		System.out.println(map2);
		
		
	}

}
