package com.example.Universite.Service;

import java.util.List;
import java.util.Optional;


import com.example.Universite.Entities.spécialité;

public interface SpécialitéService {

	void saveSpécialité(spécialité sp );
	void Updatespécialité(spécialité sp);
	List<spécialité>Listspécialité();
	void removespécialité(Long id);
	public Optional<spécialité> findspécialité(Long id);

}
