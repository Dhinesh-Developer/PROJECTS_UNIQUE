package com.PHC.Controller;

import com.PHC.Entity.Employee;
import com.PHC.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/phc/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public String getAllEmployees(@RequestParam(name = "id", required = false) Integer hospitalId, Model model) {
        List<Employee> employees;
        if (hospitalId != null) {
            employees = employeeService.findByHospitalId(hospitalId);
        } else {
            employees = List.of();
        }
        model.addAttribute("employees", employees);
        return "Employee";
    }
}
