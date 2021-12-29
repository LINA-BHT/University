package com.example.Universite.ServiceImp;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Universite.Entities.lieu;
import com.example.Universite.Repository.lieuRepository;
import com.example.Universite.Service.LieuService;




	@Service("LieuServiceImpl")
	public class LieuServiceImp  implements LieuService {
		@Autowired
		lieuRepository lieuRep;
		@Override
		public void saveLieu(lieu lieu) {
			lieuRep.save(lieu);
		}
		@Override
		public void UpdateLieu(lieu lieu) {
			lieuRep.save(lieu);
		}
		@Override
		public List<lieu> ListLieu() {
			return lieuRep.findAll();
		}
		@Override
		public void removeLieu(Long id) {
			lieuRep.deleteById(id);
		}
		@Override
		public Optional<lieu> findLieu(Long id) {
			return lieuRep.findById(id);
		}
		
		
		
		

	}


