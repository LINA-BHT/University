package com.example.Universite.ServiceImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Universite.Entities.spécialité;
import com.example.Universite.Service.EtudiantService;
import com.example.Universite.Service.SpécialitéService;

import com.example.Universite.Repository.spécialitéRespository;

@Service("SpécialitéServiceImpl")
public class SpécialitéServiceImp implements SpécialitéService {
	@Autowired
	spécialitéRespository spRep;
	@Override
	public void saveSpécialité(spécialité sp) {
		spRep.save(sp);
	}
	@Override
	public void Updatespécialité(spécialité sp) {
		spRep.save(sp);
	}
	@Override
	public List<spécialité> Listspécialité() {
		return spRep.findAll();
	}
	@Override
	public void removespécialité(Long id) {
		spRep.deleteById(id);
	}
	@Override
	public Optional<spécialité> findspécialité(Long id) {
		return spRep.findById(id);
	}
	
	
	
	



}
