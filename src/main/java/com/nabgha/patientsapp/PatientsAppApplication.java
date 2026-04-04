package com.nabgha.patientsapp;

import com.nabgha.patientsapp.entities.Patient;
import com.nabgha.patientsapp.repositories.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.Date;

@SpringBootApplication
@AllArgsConstructor
public class PatientsAppApplication {

    private final PatientRepository patientRepository;

    public static void main(String[] args) {
        SpringApplication.run(PatientsAppApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner() {
//        return args -> {
//            patientRepository.save(new Patient(null, "Youssef", new Date(), true, 12));
//            patientRepository.save(new Patient(null, "Youness", new Date(), false, 10));
//
//            patientRepository.findAll().forEach(p-> {
//                System.out.println(p.getNom());
//            });
//        };
//    }

}
