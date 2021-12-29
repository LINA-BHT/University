package com.example.Universite.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.Universite.Entities.cours;
import com.example.Universite.Entities.spécialité;

public interface spécialitéRespository extends JpaRepository<spécialité,Long> {
	
}
