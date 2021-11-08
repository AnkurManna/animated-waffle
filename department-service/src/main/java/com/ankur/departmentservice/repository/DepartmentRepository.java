package com.ankur.departmentservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ankur.departmentservice.entity.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long>{

}
