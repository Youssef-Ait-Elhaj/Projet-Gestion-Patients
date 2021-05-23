package emsi.ma.springmvc.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import emsi.ma.springmvc.entities.Patient;

public interface PatientRepository extends JpaRepository<Patient, Long> {

	public Page<Patient> findByNameContains(String mc, Pageable pageable);
	
}
