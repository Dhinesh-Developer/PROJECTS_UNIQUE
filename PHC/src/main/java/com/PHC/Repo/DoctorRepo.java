package com.PHC.Repo;

import com.PHC.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DoctorRepo extends JpaRepository<Doctor,Integer> {


    List<Doctor> findByHospitalId(int hospitalId);
}
