package com.example.Universite.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Universite.Entities.departement;


public interface departementRepository extends JpaRepository<departement,Long> {

}
