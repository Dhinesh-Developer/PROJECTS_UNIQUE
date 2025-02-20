package com.PHC.Controller;

import com.PHC.Entity.Employee;
import com.PHC.Entity.Patient;
import com.PHC.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/phc/patients")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @GetMapping
    public String getPatientsByHospital(@RequestParam("id") Integer hospitalId, Model model) {
        List<Patient> patients = patientService.findByHospitalId(hospitalId);
        model.addAttribute("patients", patients);
        return "Patient";
    }

}
