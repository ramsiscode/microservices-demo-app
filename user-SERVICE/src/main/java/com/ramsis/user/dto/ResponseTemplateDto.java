package com.ramsis.user.dto;

import com.ramsis.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseTemplateDto {
	private User user;
	private DepartmentDTO departmentDto;
	
}
