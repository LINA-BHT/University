package com.example.Universite.ServiceImp;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Universite.Entities.cours;
import com.example.Universite.Repository.coursRepository;
import com.example.Universite.Service.CoursService;


	
	@Service("CoursServiceImpl")
	public class CoursServiceImp  implements CoursService {
		@Autowired
		coursRepository coursRep;
		@Override
		public void saveCours(cours cr) {
			coursRep.save(cr);
		}
		@Override
		public void UpdateCours(cours cr) {
			coursRep.save(cr);
		}
		@Override
		public List<cours> ListCours() {
			return coursRep.findAll();
		}
		@Override
		public void removeCours(Long id) {
			coursRep.deleteById(id);
		}
		@Override
		public Optional<cours> findCours(Long id) {
			return coursRep.findById(id);
			
		} 
	}
	
		
		
		


