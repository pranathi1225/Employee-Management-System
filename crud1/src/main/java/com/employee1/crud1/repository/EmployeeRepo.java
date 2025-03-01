package com.employee1.crud1.repository;

import com.employee1.crud1.entity.EmployeeC;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends JpaRepository<EmployeeC, Long> {

}
