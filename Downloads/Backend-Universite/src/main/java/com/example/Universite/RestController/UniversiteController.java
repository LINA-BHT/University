package com.example.Universite.RestController;


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

import com.example.Universite.Entities.universite;
import com.example.Universite.Service.UniversiteService;

	
	@RestController
	@RequestMapping("/Universites")
	public class UniversiteController {
		@Autowired
		UniversiteService univService;
		
		@PostMapping("/createUniversite")
		public universite createUniversite(@Validated @RequestBody  universite univ) {
			univService.saveUniversite(univ);
			return univ;	}
		
		@PutMapping("/UpdateUniversite/{/id}")
		public String UpdateUniversite(@PathVariable(value="id") Long medid,@Validated @RequestBody universite newUniversite) {
	    if(newUniversite==null) {
	    	return "impossible de faire la mise à jour!";
		}
	    else {
	    	newUniversite.setCadeUNV(newUniversite.getCadeUNV());
	    	newUniversite.setNomUNV(newUniversite.getNomUNV());
	    	newUniversite.setAdresseSite(newUniversite.getAdresseSite());
	    	
	    	univService.UpdateUniversite(newUniversite);
	    	return "la mise à jour a été fait avec succés";
	    	}
	    }
		@GetMapping(value="/findUniversite/{/id}")
	    public Optional<universite> findUniversite(@PathVariable(value="id") String id)
		    {
	    	return univService.findUniversite(Long.parseLong(id));
	    	}
	    
	    
	    @DeleteMapping(value="/deleteUniversite/{id}")
	    public String deleteUniversite(@PathVariable String id)
	    	{ univService.removeUniversite(Long.parseLong(id));
	    	return "l'Universite supprimé avec succées";
	    	}

}
