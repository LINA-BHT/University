package com.example.Universite.RestController;

import java.util.List;
import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Universite.Entities.etudiant;
import com.example.Universite.Repository.EtudiantRepository;
import com.example.Universite.Service.EtudiantService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:8081/")
public class EtudiantController {
	
		
	
	@Autowired
	EtudiantService etuService;
	
	@PostMapping("/createEtudiant")
	public etudiant createEtudiant(@Validated @RequestBody etudiant et) {
		etuService.saveEtudiant(et);
		return et;	}
	
	@PutMapping("/UpdateEtudiant/{/id}")
	public String UpdateEtudiant(@PathVariable(value="id") Long medid,@Validated @RequestBody etudiant newEtudiant) {
    if(newEtudiant==null) {
    	return "impossible de faire la mise à jour!";
	}
    else {
    	newEtudiant.setNom(newEtudiant.getNom());
    	newEtudiant.setPrenom(newEtudiant.getPrenom());
    	newEtudiant.setAdresse(newEtudiant.getAdresse());
    	newEtudiant.setDateEntrée(newEtudiant.getDateEntrée());
    	newEtudiant.setEmail(newEtudiant.getEmail());
    	newEtudiant.setPassword(newEtudiant.getPassword());
    	etuService.UpdateEtudiant(newEtudiant);
    	return "la mise à jour a été fait avec succés";
    	}
    }
	@GetMapping(value="/findEtdudiant/{/id}")
    public Optional<etudiant> findEtudiant(@PathVariable(value="id") String id)
	    {
    	return etuService.findEtudiant(Long.parseLong(id));
    	}
    
    
    
    @DeleteMapping(value="/deleteEtudiant/{id}")
    public String deleteEtudiant(@PathVariable String id)
    	{ etuService.removeEtudiant(Long.parseLong(id));
    	return "Etudiant supprimé avec succées";
    	}
    @Autowired 
	private EtudiantRepository ER;
	@GetMapping("/etudiants")
	public List<etudiant> fetchEtudiants(){
		return ER.findAll();}
    
	
   }
	
	
	
	
	
	
	
	


