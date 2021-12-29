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

import com.example.Universite.Entities.departement;

import com.example.Universite.Repository.departementRepository;
import com.example.Universite.Service.DepartementService;

@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/api")
public class DepartementController {
	@Autowired
	DepartementService depService;
	
	@PostMapping("/createDepartement")
	public departement createDepartement(@Validated @RequestBody departement dep) {
		depService.saveDepartement(dep);
		return dep;	}
	
	@PutMapping("/UpdateDepartement/{/id}")
	public String UpdateDepartement(@PathVariable(value="id") Long medid,@Validated @RequestBody departement newDepartement) {
    if(newDepartement==null) {
    	return "impossible de faire la mise à jour!";
	}
    else {
    	
    	
    	newDepartement.setCodeDEP(newDepartement.getCodeDEP());
    	newDepartement.setNomDEP(newDepartement.getNomDEP());
    	
    	depService.UpdateDepartement(newDepartement);
    	return "la mise à jour a été fait avec succés";
    	}
    }
	@GetMapping(value="/findDepartement/{/id}")
    public Optional<departement> findDepartement(@PathVariable(value="id") String id)
	    {
    	return depService.findDepartement(Long.parseLong(id));
    	}
    
    
    @DeleteMapping(value="/deleteDepartement/{id}")
    public String deleteDepartement(@PathVariable String id)
    	{ depService.removeDepartement(Long.parseLong(id));
    	return "Departement supprimé avec succées";
    	}
    @Autowired 
	private departementRepository DR;
	@GetMapping("/departements")
	public List<departement> fetchDepartements(){
		return DR.findAll();
		}
 
   }


