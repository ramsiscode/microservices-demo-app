package com.ramsis.user.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {

	private long departmentId;
	private String departmentName;
	private String departmentAddress;
	private String departmentCode;
}
