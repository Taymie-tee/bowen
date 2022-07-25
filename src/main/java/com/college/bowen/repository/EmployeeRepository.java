package com.college.bowen.repository;

import com.college.bowen.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    /*
    save();
    findById();
    deleteId();
    delete(); */

}
