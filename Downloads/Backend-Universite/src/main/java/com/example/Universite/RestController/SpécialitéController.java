package com.example.Universite.RestController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Universite.Entities.cours;
import com.example.Universite.Entities.spécialité;
import com.example.Universite.Repository.coursRepository;
import com.example.Universite.Repository.spécialitéRespository;
import com.example.Universite.Service.SpécialitéService;

@RestController
@RequestMapping("/api")
public class SpécialitéController {
	@Autowired
	SpécialitéService SpécialitéService;
	
	@PostMapping("/createSpécialité")
	public spécialité createSpécialité(@Validated @RequestBody spécialité sp) {
		SpécialitéService.saveSpécialité(sp);
		return sp;	}
	
	@PutMapping("/UpdateSpécialité/{/id}")
	public String Updatespécialité(@PathVariable(value="id") Long medid,@Validated @RequestBody spécialité newSpécialité) {
    if(newSpécialité==null) {
    	return "impossible de faire la mise à jour!";
	}
    else {
    	newSpécialité.setId(newSpécialité.getId());
    	
    	
    	SpécialitéService.Updatespécialité(newSpécialité);
    	return "la mise à jour a été fait avec succés";
    	}
    }
	@GetMapping(value="/findSpécialité/{/id}")
    public Optional<spécialité> findSpécialité(@PathVariable(value="id") String id)
	    {
    	return SpécialitéService.findspécialité(Long.parseLong(id));
    	}
    
    
    @DeleteMapping(value="/deleteSpécialité/{id}")
    public String deleteSpécialité(@PathVariable String id)
    	{SpécialitéService.removespécialité(Long.parseLong(id));
    	return "Spécialité supprimé avec succées";
    	}
    @Autowired 
	private spécialitéRespository  SR;
	@GetMapping("/spécialité")
	public List<spécialité> fetchSpécialité(){
		return SR.findAll();
		}
	
	
	
}
