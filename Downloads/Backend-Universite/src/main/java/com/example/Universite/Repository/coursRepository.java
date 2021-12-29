package com.example.Universite.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.Universite.Entities.cours;


@RepositoryRestResource
public interface coursRepository extends JpaRepository<cours,Long>{
	
	@RestResource(path="Q1")
	@Query("select c from cours c where c.spécialité='informatique de gestion' and c.diplome='licence'")
	List<cours> Q1();
	
	@RestResource(path="Q12")
	@Query("select c from cours c where c.spécialité='gestion' and c.diplome='licence'")
	List<cours> Q2();
	
	@RestResource(path="Q3")
	@Query("select c from cours c where c.spécialité='economique' and c.diplome='licence'")
	List<cours> Q3();
	
	



}
