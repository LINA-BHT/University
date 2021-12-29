package com.example.Universite.Service;
import java.util.Optional;

import com.example.Universite.Entities.seance;

import java.util.List;

public interface SeanceService {
	
	void saveSeance(seance Et);
	void UpdateSeance(seance ET);
	List<seance>ListSeance();
	void removeSeance(Long id);
	public Optional<seance> findSeance(Long id);

}
