package com.example.controle.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.controle.entities.Livre;
import com.example.controle.repos.LivreRepo;

@Service
@Transactional
public class LivreService {
	@Autowired
	private  LivreRepo livreRepository ;
	public LivreService(LivreRepo livreRepository) {
	    super();
	    this.livreRepository = livreRepository;
	}
	
	
		
	}

	
	   
        
 

