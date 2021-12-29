package com.example.Universite.ServiceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Universite.Entities.universite;
import com.example.Universite.Repository.universiteRepository;
import com.example.Universite.Service.UniversiteService;


	@Service("UniversiteServiceImpl")
	public class UniversiteServiceImp  implements UniversiteService {
		@Autowired
		universiteRepository univRep;
		@Override
		public void saveUniversite(universite univ) {
			univRep.save(univ);
		}
		@Override
		public void UpdateUniversite(universite univ) {
			univRep.save(univ);
		}
		@Override
		public List<universite> ListUniversite() {
			return univRep.findAll();
		}
		@Override
		public void removeUniversite(Long id) {
			univRep.deleteById(id);
		}
		@Override
		public Optional<universite> findUniversite(Long id) {
			return univRep.findById(id);
		}
		
		
		
		

	}



