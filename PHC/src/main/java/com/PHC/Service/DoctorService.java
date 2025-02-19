package com.PHC.Service;

import com.PHC.Entity.Doctor;
import com.PHC.Repo.DoctorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    private  DoctorRepo doctorRepo;


    public List<Doctor> getDoctorsByHospitalId(int hospitalId) {
        return doctorRepo.findByHospitalId(hospitalId);
    }
}
