package com.example.Universite.Service;
import java.util.Optional;

import com.example.Universite.Entities.departement;

import java.util.List;
public interface DepartementService {
	
	
	void saveDepartement(departement dep);
	void UpdateDepartement(departement det );
	List<departement>ListDepartement();
	void removeDepartement(Long id);
	public Optional<departement> findDepartement(Long id);

}
