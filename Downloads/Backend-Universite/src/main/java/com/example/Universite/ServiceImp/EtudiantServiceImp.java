
package com.example.Universite.ServiceImp;

import org.springframework.beans.factory.annotation.Autowired;



import org.springframework.stereotype.Service;

import com.example.Universite.Entities.etudiant;
import com.example.Universite.Repository.EtudiantRepository;
import com.example.Universite.Service.EtudiantService;

import java.util.List;
import java.util.Optional;
@Service("EtudiantServiceImpl")
public class EtudiantServiceImp  implements EtudiantService {
	@Autowired
	EtudiantRepository etudRep;
	@Override
	public void saveEtudiant(etudiant Etu) {
		etudRep.save(Etu);
	}
	@Override
	public void UpdateEtudiant(etudiant Etu) {
		etudRep.save(Etu);
	}
	@Override
	public List<etudiant> ListEtudiant() {
		return etudRep.findAll();
	}
	@Override
	public void removeEtudiant(Long id) {
		etudRep.deleteById(id);
	}
	@Override
	public Optional<etudiant> findEtudiant(Long id) {
		return etudRep.findById(id);
	}
	
	
	
	

}
