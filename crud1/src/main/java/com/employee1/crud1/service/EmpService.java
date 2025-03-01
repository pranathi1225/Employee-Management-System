package com.employee1.crud1.service;

import com.employee1.crud1.entity.EmployeeC;
import java.util.List;

public interface EmpService {
	EmployeeC saveEmployee(EmployeeC employee);

	List<EmployeeC> fetchAllEmployees();

	EmployeeC getEmployeeById(Long id);

	EmployeeC updateEmployeeById(Long id, EmployeeC employee);
	

	String deleteEmployeeById(Long id);
}
