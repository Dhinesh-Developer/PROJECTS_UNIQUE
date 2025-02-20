package com.PHC.Repo;

import com.PHC.Entity.Employee;
import com.PHC.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@EnableJpaRepositories
public interface PatientRepo extends JpaRepository<Patient,Integer> {
    List<Patient> findByHospitalId(Integer hospitalId);
}
