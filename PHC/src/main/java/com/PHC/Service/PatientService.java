package com.PHC.Service;

import com.PHC.Entity.Patient;
import com.PHC.Repo.PatientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    private PatientRepo patientRepo;

    public List<Patient> findByHospitalId(Integer hospitalId) {
        return patientRepo.findByHospitalId(hospitalId);
    }
}
