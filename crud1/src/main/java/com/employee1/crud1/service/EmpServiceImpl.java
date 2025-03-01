package com.employee1.crud1.service;

import com.employee1.crud1.entity.EmployeeC;
import com.employee1.crud1.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	private EmployeeRepo employeeRepo;

	@Override
	public EmployeeC saveEmployee(EmployeeC employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public List<EmployeeC> fetchAllEmployees() {
		List<EmployeeC> allEmployees = employeeRepo.findAll();
		return allEmployees;
	}

	@Override
	public EmployeeC getEmployeeById(Long id) {
		Optional<EmployeeC> employee = employeeRepo.findById(id);
		if (employee.isPresent()) {
			return employee.get();
		} else {
			return null;
		}
	}

//	@Override
//	public EmployeeC updateEmployeeById(Long id, EmployeeC employee) {
//		Optional<EmployeeC> employee1 = employeeRepo.findById(id);
//		if (employee1.isPresent()) {
//			EmployeeC originalEmp = employee1.get();
//			if (Objects.nonNull(employee.getName()) && !"".equalsIgnoreCase(employee.getName())) {
//				originalEmp.setName(employee.getName());
//			}
////			if(Objects.nonNull(employee.getDoj()) && !employee.getDoj().equals("")){
////				originalEmp.setDoj(employee.getDoj());
////			}
//			if (Objects.nonNull(employee.getSalary()) && employee.getSalary() != 0) {
//				originalEmp.setSalary(employee.getSalary());
//			}
//			if (Objects.nonNull(employee.getStatus()) && employee.getStatus() != -1) {
//				originalEmp.setStatus(employee.getStatus());
//			}
//			employeeRepo.save(originalEmp);
//			return originalEmp;
//		}
//		return null;
//	}

	@Override
	public EmployeeC updateEmployeeById(Long id, EmployeeC employee) {
	    Optional<EmployeeC> employee1 = employeeRepo.findById(id);
	    if (employee1.isPresent()) {
	        EmployeeC originalEmp = employee1.get();
	        
	        // Validate and update name
	        if (Objects.nonNull(employee.getName()) && !"".equalsIgnoreCase(employee.getName())) {
	            originalEmp.setName(employee.getName());
	        }
	        
	        // Validate and update doj (Date of Joining)
	        if (Objects.nonNull(employee.getDoj())) {
	            // You can add any specific validation logic for the date if necessary (e.g., checking the range or format).
	            originalEmp.setDoj(employee.getDoj());
	        }
	        
	        // Validate and update salary
	        if (Objects.nonNull(employee.getSalary()) && employee.getSalary() != 0) {
	            originalEmp.setSalary(employee.getSalary());
	        }
	        
	        // Validate and update status
	        if (Objects.nonNull(employee.getStatus()) && employee.getStatus() != -1) {
	            originalEmp.setStatus(employee.getStatus());
	        }
	        
	        // Save updated employee data
	        employeeRepo.save(originalEmp);
	        return originalEmp;
	    }
	    return null;
	}

	@Override
	public String deleteEmployeeById(Long id) {
		if (employeeRepo.findById(id).isPresent()) {
			employeeRepo.deleteById(id);
			return "Employee deleted successfully";
		}
		return "Employee doesn't exist";
	}

}
