package com.employee.svc;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author thayn
 */
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    
}
