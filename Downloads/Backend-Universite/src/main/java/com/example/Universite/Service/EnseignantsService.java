package com.example.Universite.Service;
import java.util.Optional;

import com.example.Universite.Entities.enseignants;

import java.util.List;

public interface EnseignantsService {
	
	void saveEnseignants(enseignants Et);
	void UpdateEnseignants(enseignants ET);
	List<enseignants>ListEnseignants();
	void removeEnseignants(Long id);
	public Optional<enseignants> findEnseignants(Long id);

}
