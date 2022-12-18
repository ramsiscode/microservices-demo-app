package com.ramsis.user.service;

import com.ramsis.user.dto.ResponseTemplateDto;
import com.ramsis.user.entity.User;

public interface UserService {

	public User saveUser(User department);
	public User findUserById(Long userId);
	public ResponseTemplateDto getUserWithDepartment(Long userId);
}
