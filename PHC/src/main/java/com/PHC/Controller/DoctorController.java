package com.PHC.Controller;

import com.PHC.Entity.Doctor;
import com.PHC.Service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/phc/doctors")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public String getDoctorsByHospitalId(@RequestParam("id") int hospitalId, Model model) {
        List<Doctor> doctors = doctorService.getDoctorsByHospitalId(hospitalId);
        model.addAttribute("doctors", doctors);
        return "Doctors";
    }

}
