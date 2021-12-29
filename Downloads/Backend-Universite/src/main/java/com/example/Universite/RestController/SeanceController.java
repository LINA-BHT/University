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


import com.example.Universite.Entities.seance;

import com.example.Universite.Repository.seanceRepository;
import com.example.Universite.Service.SeanceService;

	
	@RestController
	@RequestMapping("/Seances")
	public class SeanceController {
		@Autowired
		SeanceService SeanceService;
		
		@PostMapping("/createSeance")
		public seance createEtudiant(@Validated @RequestBody seance sc) {
			SeanceService.saveSeance(sc);
			return sc;	}
		
		@PutMapping("/UpdateSeance/{/id}")
		public String UpdateSeance(@PathVariable(value="id") Long medid,@Validated @RequestBody seance newSeance) {
	    if(newSeance==null) {
	    	return "impossible de faire la mise à jour!";
		}
	    else {
	    	newSeance.setIdSC(newSeance.getIdSC());
	    	
	    	
	    	SeanceService.UpdateSeance(newSeance);
	    	return "la mise à jour a été fait avec succés";
	    	}
	    }
		@GetMapping(value="/findSeance/{/id}")
	    public Optional<seance> findSeance(@PathVariable(value="id") String id)
		    {
	    	return SeanceService.findSeance(Long.parseLong(id));
	    	}
	    
	    
	    @DeleteMapping(value="/deleteSeance/{id}")
	    public String deleteSeance(@PathVariable String id)
	    	{SeanceService.removeSeance(Long.parseLong(id));
	    	return "Seance supprimé avec succées";
	    	}
	    @Autowired 
		private seanceRepository SR;
		@GetMapping("/seances")
		public List<seance> fetchSeances(){
			return SR.findAll();
			}

}
