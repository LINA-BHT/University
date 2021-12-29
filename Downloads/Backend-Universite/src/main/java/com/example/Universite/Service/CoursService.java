package com.example.Universite.Service;
import java.util.Optional;

import com.example.Universite.Entities.cours;

import java.util.List;

public interface CoursService {
	
		void saveCours(cours cr);
		void UpdateCours(cours cr );
		List<cours>ListCours();
		void removeCours(Long id);
		public Optional<cours> findCours(Long id);

	}


