package com.PHC.Service;

import com.PHC.Entity.Hospital;
import com.PHC.Repo.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepo hospitalRepo;


    public List<Hospital> getAllList() {
        return hospitalRepo.findAll();
    }
}
