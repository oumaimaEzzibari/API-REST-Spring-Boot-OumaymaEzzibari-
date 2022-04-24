package com.example.controle.repos;


import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.controle.entities.Livre;

public interface LivreRepo extends JpaRepository<Livre, Integer>{
	List<Livre> findByAuteur(String auteur);
	List<Livre> findByTitre(String titre);
	List<Livre> findByDateDerCon(Date dateDerCon);
	List<Livre> findByIsbn(Integer isbn);
	List<Livre> findByDisponibility(Boolean disponibility);
	

	String deleteByTitre(String n);

	

}
