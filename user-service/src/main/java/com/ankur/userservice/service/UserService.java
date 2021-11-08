package com.ankur.userservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ankur.userservice.VO.Department;
import com.ankur.userservice.VO.ResponseTemplateVO;
import com.ankur.userservice.entity.User;
import com.ankur.userservice.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	@Autowired
	private RestTemplate restTemplate;

	public User saveUser(User user) {
		// TODO Auto-generated method stub
		return repository.save(user);
	}

	public ResponseTemplateVO getUserWithDepartment(Long userId) {
		// TODO Auto-generated method stub
		ResponseTemplateVO vo = new ResponseTemplateVO();
		Optional<User> user  = repository.findById(userId);
		
		Department department = restTemplate.getForObject("http://localhost:9001/department/" + user.get().getDepartmentId(), Department.class);
		
		vo.setUser(user.get());
		vo.setDepartment(department);
		return vo;
	}
}
