package com.employee1.crud1.controller;

import com.employee1.crud1.entity.EmployeeC;
import com.employee1.crud1.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4002")
@RestController
public class EmpController {

	@Autowired
	private EmpService empService;

	
	@PostMapping("/api/employee")
	public EmployeeC saveEmployee(@RequestBody EmployeeC employee) {
		return empService.saveEmployee(employee);
	}

	@GetMapping("/api/employee")
	public List<EmployeeC> getAllEmployees() {
		return empService.fetchAllEmployees();
	}

	@GetMapping("/api/employee/{id}")
	public EmployeeC getEmployeeById(@PathVariable("id") Long id) {
		return empService.getEmployeeById(id);
	}

	@PutMapping("/api/employee/{id}")
	public EmployeeC updateEmployeeId(@PathVariable("id") Long id, @RequestBody EmployeeC employee) {
		return empService.updateEmployeeById(id, employee);
	}

	@DeleteMapping("/api/employee/{id}")
	public String deleteEmployeeById(@PathVariable("id") Long id) {
		return empService.deleteEmployeeById(id);
	}

}
