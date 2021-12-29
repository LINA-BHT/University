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


import com.example.Universite.Entities.enseignants;

import com.example.Universite.Repository.enseignantsRepositoty;
import com.example.Universite.Service.EnseignantsService;



@CrossOrigin(origins = "http://localhost:8081/")
@RestController
@RequestMapping("/api")
public class  EnseignantsController {
	@Autowired
	EnseignantsService ensService;
	
	@PostMapping("/createEnseignants")
	public enseignants createEnseignants(@Validated @RequestBody enseignants ens) {
		ensService.saveEnseignants(ens);
		return ens;	}
	
	@PutMapping("/UpdateEnseignants/{/id}")
	public String UpdateEnseignants(@PathVariable(value="id") Long medid,@Validated @RequestBody enseignants newEnseignants) {
    if(newEnseignants==null) {
    	return "impossible de faire la mise à jour!";
	}
    else {
    	newEnseignants.setMatricule(newEnseignants.getMatricule());
    	newEnseignants.setNomENS(newEnseignants.getNomENS());
    	newEnseignants.setPrenomENS(newEnseignants.getPrenomENS());
    	newEnseignants.setAdresseENS(newEnseignants.getAdresseENS());
    	newEnseignants.setDiplome(newEnseignants.getDiplome());
    	ensService.UpdateEnseignants(newEnseignants);
    	return "la mise à jour a été fait avec succés";
    	}
    }
	@GetMapping(value="/findEnseignants/{/id}")
    public Optional<enseignants> findEnseignants(@PathVariable(value="id") String id)
	    {
    	return ensService.findEnseignants(Long.parseLong(id));
    	}
    
    
    @DeleteMapping(value="/deleteEnseignants/{id}")
    public String deleteEnseignants(@PathVariable String id)
    	{ ensService.removeEnseignants(Long.parseLong(id));
    	return "Enseignants supprimé avec succées";
    	}
    
    @Autowired 
   	private enseignantsRepositoty ER;
   	@GetMapping("/enseignants")
   	public List<enseignants> fetchEnseignants(){
   		return ER.findAll();
   		}
   }
	
	
	
	
	
	
	
	





