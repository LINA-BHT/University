package com.example.Universite.ServiceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Universite.Entities.enseignants;
import com.example.Universite.Repository.enseignantsRepositoty;
import com.example.Universite.Service.EnseignantsService;


	@Service("EnseignantsServiceImpl")
	public class EnseignantsServiceImp  implements EnseignantsService {
		@Autowired
		enseignantsRepositoty ensRep;
		@Override
		public void saveEnseignants(enseignants Ens) {
			ensRep.save(Ens);
		}
		@Override
		public void UpdateEnseignants(enseignants Ens) {
			ensRep.save(Ens);
		}
		@Override
		public List<enseignants> ListEnseignants() {
			return ensRep.findAll();
		}
		@Override
		public void removeEnseignants(Long id) {
			ensRep.deleteById(id);
		}
		@Override
		public Optional<enseignants> findEnseignants(Long id) {
			return ensRep.findById(id);
		}
		
		
		
		

	}


