package com.example.Universite.Service;
import java.util.Optional;


import com.example.Universite.Entities.universite;

import java.util.List;

public interface UniversiteService {
	
	void saveUniversite(universite Et);
	void UpdateUniversite(universite ET);
	List<universite>ListUniversite();
	void removeUniversite(Long id);
	public Optional<universite> findUniversite(Long id);
	
}
