package emsi.ma.springmvc;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import emsi.ma.springmvc.dao.PatientRepository;
import emsi.ma.springmvc.entities.Patient;

@SpringBootApplication
public class SpringMvcApplication implements CommandLineRunner {
	
	@Autowired
	private PatientRepository patientRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		patientRepository.save(new Patient(null, "Hassan", new Date(), false, 4));
		patientRepository.save(new Patient(null, "Mohamed", new Date(), false, 5));
		patientRepository.save(new Patient(null, "Samira", new Date(), false, 98));
		patientRepository.save(new Patient(null, "Youssef", new Date(), true, 50));
		patientRepository.save(new Patient(null, "Yassine", new Date(), true, 78));
		patientRepository.save(new Patient(null, "Khalid", new Date(), false, 40));
		patientRepository.save(new Patient(null, "Imran", new Date(), true, 99));
		patientRepository.save(new Patient(null, "Ismail", new Date(), true, 45));
		
		patientRepository.findAll().forEach(p -> {
			System.out.println(p.getName());
		});
	}
}
