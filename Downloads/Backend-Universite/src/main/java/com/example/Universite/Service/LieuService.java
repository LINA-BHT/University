package com.example.Universite.Service;
import java.util.Optional;

import com.example.Universite.Entities.lieu;

import java.util.List;

public interface LieuService {
	

	void saveLieu(lieu Et);
	void UpdateLieu(lieu ET);
	List<lieu>ListLieu();
	void removeLieu(Long id);
	public Optional<lieu> findLieu(Long id);

}
