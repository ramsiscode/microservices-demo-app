package com.ramsis.department.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramsis.department.entity.Department;
import com.ramsis.department.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class DepartmentServiceImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		log.info("Inside saveDepartment method of DepartmentServiceImpl.");
		return departmentRepository.save(department);
	}

	public Department findDepartmentById(Long departmentId) {
		log.info("Inside saveDepartmentById method of DepartmentServiceImpl.");
		return departmentRepository.findByDepartmentId(departmentId);
	}
}
