package com.example.Universite.Service;
import java.util.Optional;

import com.example.Universite.Entities.etudiant;
import java.util.List;
public interface EtudiantService {
void saveEtudiant(etudiant Et);
void UpdateEtudiant(etudiant ET);
List<etudiant>ListEtudiant();
void removeEtudiant(Long id);
public Optional<etudiant> findEtudiant(Long id);
}
