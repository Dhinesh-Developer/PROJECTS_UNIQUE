package com.PHC.Service;

import com.PHC.Entity.Employee;
import com.PHC.Repo.EmployeeRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public List<Employee> findByHospitalId(int hospitalId) {
        return employeeRepo.findByHospitalId(hospitalId);
    }
}
