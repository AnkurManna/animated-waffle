package com.ankur.departmentservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ankur.departmentservice.entity.Department;
import com.ankur.departmentservice.repository.DepartmentRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DepartmentService {
	
	@Autowired
	private  DepartmentRepository repository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		log.info("Inside savedepartment method of DepartmentService");
		return repository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		// TODO Auto-generated method stub
		return repository.findById(departmentId).get();
	}

}
