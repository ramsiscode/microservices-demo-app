package com.ramsis.department.service;

import com.ramsis.department.entity.Department;

public interface DepartmentService{

	public Department saveDepartment(Department department);
	public Department findDepartmentById(Long departmentId);
}
