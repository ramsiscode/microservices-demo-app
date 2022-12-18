package com.ramsis.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ramsis.user.dto.DepartmentDTO;
import com.ramsis.user.dto.ResponseTemplateDto;
import com.ramsis.user.entity.User;
import com.ramsis.user.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService{
 
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTamplate;
	
	public User saveUser(User user) {
		log.info("Inside saveUser method of UserServiceImpl.");
		return userRepository.save(user);
	}

	@Override
	public User findUserById(Long userId) {
		log.info("Inside saveUser method of UserServiceImpl.");
		return userRepository.findByUserId(userId);
	}

	public ResponseTemplateDto getUserWithDepartment(Long userId) {
		log.info("Inside getUserWithDepartment method of UserServiceImpl.");
		ResponseTemplateDto responseTemplateDto = new ResponseTemplateDto();
		User user = userRepository.findByUserId(userId);
		DepartmentDTO departmentDto = restTamplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getUserId(), DepartmentDTO.class);
		responseTemplateDto.setDepartmentDto(departmentDto);
		responseTemplateDto.setUser(user);
		return responseTemplateDto;
	}

}
