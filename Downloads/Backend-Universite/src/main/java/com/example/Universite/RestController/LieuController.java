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

import com.example.Universite.Entities.lieu;

import com.example.Universite.Repository.lieuRepository;
import com.example.Universite.Service.LieuService;



@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/api")
public class LieuController {
	@Autowired
	LieuService lieuService;
	
	@PostMapping("/createLieu")
	public lieu createLieu(@Validated @RequestBody lieu lieu) {
		lieuService.saveLieu(lieu);
		return lieu;	}
	
	@PutMapping("/UpdateLieu/{/id}")
	public String UpdateLieu(@PathVariable(value="id") Long medid,@Validated @RequestBody lieu newLieu) {
    if(newLieu==null) {
    	return "impossible de faire la mise à jour!";
	}
    else {
    	newLieu.setCodel(newLieu.getCodel());
    	newLieu.setNoml(newLieu.getNoml());
    	newLieu.setCapacite(newLieu.getCapacite());
    	
    	lieuService.UpdateLieu(newLieu);
    	return "la mise à jour a été fait avec succés";
    	}
    }
	@GetMapping(value="/findLieu/{/id}")
    public Optional<lieu> findLieu(@PathVariable(value="id") String id)
	    {
    	return lieuService.findLieu(Long.parseLong(id));
    	}
    
    
    @DeleteMapping(value="/deleteLieut/{id}")
    public String deleteLieu(@PathVariable String id)
    	{ lieuService.removeLieu(Long.parseLong(id));
    	return "salle supprimé avec succées";
    	}
    @Autowired 
	private lieuRepository LR;
	@GetMapping("/lieus")
	public List<lieu> fetchLieu(){
		return LR.findAll();}
    
    
 
   }
	
	
	
	
	
	
	
	


