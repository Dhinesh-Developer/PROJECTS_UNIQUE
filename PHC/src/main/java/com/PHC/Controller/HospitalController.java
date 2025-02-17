package com.PHC.Controller;

import com.PHC.Entity.Hospital;
import com.PHC.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/phc/hospitals")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @GetMapping
    public String showAllHospital(Model model) {
        List<Hospital> hospitals = hospitalService.getAllList();
        model.addAttribute("hospitals", hospitals);
        return "Hospital";
    }
}