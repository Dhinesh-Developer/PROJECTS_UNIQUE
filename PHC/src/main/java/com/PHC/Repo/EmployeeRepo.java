package com.PHC.Repo;

import com.PHC.Entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
    List<Employee> findByHospitalId(int hospitalId);
}
