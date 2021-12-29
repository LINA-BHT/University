package com.example.Universite;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import com.example.Universite.Repository.EtudiantRepository;
import com.example.Universite.Repository.coursRepository;
import com.example.Universite.Repository.lieuRepository;



@SpringBootApplication
public class UniversiteApplication implements CommandLineRunner {
	@Autowired
	coursRepository coursRep;
	@Autowired
	lieuRepository lieuRep;
	@Autowired
	EtudiantRepository etudiantRep;
	
    
	public static void main(String[] args) {

		SpringApplication.run(UniversiteApplication.class, args);
	}
   @Override 
   public void run(String... args) throws Exception{
	   
	   
	   //lieu e1=lieuRep.save(new lieu(0L,"A1",30));
	   //lieu e2=lieuRep.save(new lieu(0L,"A2",30));
	 
   }
 
   
}
