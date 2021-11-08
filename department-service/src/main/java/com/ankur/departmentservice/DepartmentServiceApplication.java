package com.ankur.departmentservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ankur.departmentservice.entity.Department;
import com.ankur.departmentservice.repository.DepartmentRepository;

@SpringBootApplication
public class DepartmentServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

	
	 @Bean
	  public CommandLineRunner dataLoader(DepartmentRepository repo) {
	    return new CommandLineRunner() {
	      @Override
	      public void run(String... args) throws Exception {
	        repo.save(new Department("Computer Science","JU,Prayukti Bhavan","CSE"));
	        
	      }
	    };
	  }
}
