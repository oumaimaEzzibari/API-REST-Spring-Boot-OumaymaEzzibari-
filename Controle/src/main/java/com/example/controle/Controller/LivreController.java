package com.example.controle.Controller;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.controle.entities.Livre;
import com.example.controle.repos.LivreRepo;

@RestController

public class LivreController  {
		
		private final LivreRepo livrerepo;
		LivreController(LivreRepo livrerepo) {
		    this.livrerepo = livrerepo;
		  }
		@RequestMapping("/")
	    public String home(){
	        return "Hello World!";
	    }
	    @GetMapping("/emsi_api/livre/{id}")
		  Livre one(@PathVariable Integer id) throws ClassNotFoundException  {
		    
		    return livrerepo.findById(id)
		      .orElseThrow(() -> new ClassNotFoundException() );
		  }
		
		 @GetMapping("/emsi_api/livre")
		 List<Livre> all() {
			    return livrerepo.findAll();
			  }
		 @PostMapping("/emsi_api/livre")
		  Livre newLivre(@RequestBody Livre newLivre) {
		    return livrerepo.save(newLivre);
		  }
		 @PutMapping("/emsi_api/livre/{id}")
		  Livre replaceLivre(@RequestBody Livre newLivre, @PathVariable Integer id) {
		    
		    return livrerepo.findById(id)
		      .map(livre -> {
		        livre.setTitre(newLivre.getTitre());
		        livre.setAuteur(newLivre.getAuteur());
		        livre.setDisponibility(newLivre.getDisponibility());
		        livre.setNbr_de_page(newLivre.getNbr_de_page());
		        livre.setDateDerCon(newLivre.getDateDerCon());
		        livre.setDatedesortie(newLivre.getDatedesortie());
		       
		       
		        return livrerepo.save(livre);
		      })
		      .orElseGet(() -> {
		        newLivre.setId(id);
		        return livrerepo.save(newLivre);
		      });
		  }
		 @DeleteMapping("/emsi_api/livre/{id}")
		  void deleteEmployee(@PathVariable Integer id) {
		    livrerepo.deleteById(id);
		    
		  }
		 
		 
		     
      
}



