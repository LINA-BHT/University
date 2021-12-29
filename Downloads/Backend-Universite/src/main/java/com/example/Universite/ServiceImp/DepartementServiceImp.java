package com.example.Universite.ServiceImp;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.Universite.Entities.departement;

import com.example.Universite.Repository.departementRepository;
import com.example.Universite.Service.DepartementService;


import java.util.List;
import java.util.Optional;
@Service("DepartementServiceImpl")


public class DepartementServiceImp implements DepartementService {

	
		@Autowired
		departementRepository depRep;
		@Override
		public void saveDepartement(departement dep) {
			depRep.save(dep);
		}
		@Override
		public void UpdateDepartement(departement dep) {
			depRep.save(dep);
		}
		@Override
		public List<departement> ListDepartement() {
			return depRep.findAll();
		}
		@Override
		public void removeDepartement(Long id) {
			depRep.deleteById(id);
		}
		@Override
		public Optional<departement> findDepartement(Long id) {
			return depRep.findById(id);
		}
		
		
		
		

	}


