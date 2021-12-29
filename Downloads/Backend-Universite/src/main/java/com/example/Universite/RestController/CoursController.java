package com.example.Universite.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Universite.Entities.cours;
import com.example.Universite.Entities.enseignants;
import com.example.Universite.Repository.coursRepository;
import com.example.Universite.Service.CoursService;
@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/api")

public class CoursController {
	@Autowired
	CoursService CoursService;
	@Autowired 
	private coursRepository CR;
	@GetMapping("/cours")
	public List<cours> fetchCours(){
		return CR.findAll();
		}
	@PostMapping("/createCours")
	public cours createEnseignants(@Validated @RequestBody cours cr) {
		CoursService.saveCours(cr);
		return cr;	}
	
    @GetMapping("/Q1")
    public List<cours>q1(){
    	return CR.Q1();
    }
    @GetMapping("/Q2")
    public List<cours>q2(){
    	return CR.Q2();
    }
    @GetMapping("/Q3")
    public List<cours>q3(){
    	return CR.Q3();
    }
} 
