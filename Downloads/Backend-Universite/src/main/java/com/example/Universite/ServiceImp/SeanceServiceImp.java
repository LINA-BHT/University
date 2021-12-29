package com.example.Universite.ServiceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Universite.Entities.seance;
import com.example.Universite.Repository.seanceRepository;
import com.example.Universite.Service.SeanceService;




	@Service("SeanceServiceImpl")
	public class SeanceServiceImp  implements SeanceService {
		@Autowired
	     seanceRepository scRep;
		@Override
		public void saveSeance(seance sc) {
			scRep.save(sc);
		}
		@Override
		public void UpdateSeance(seance sc) {
			scRep.save(sc);
		}
		@Override
		public List<seance> ListSeance() {
			return scRep.findAll();
		}
		@Override
		public void removeSeance(Long id) {
			scRep.deleteById(id);
		}
		@Override
		public Optional<seance> findSeance(Long id) {
			return scRep.findById(id);
		}
		
		
		
		

	}

	


