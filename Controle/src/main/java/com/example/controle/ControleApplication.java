package com.example.controle;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.example.controle.entities.Livre;
import com.example.controle.repos.LivreRepo;

@SpringBootApplication
@ComponentScan({"com.example.controle.Controller","com.example.controle.Service","controller","service"})
public class ControleApplication  implements CommandLineRunner{
	@Autowired
	LivreRepo livrerepo;
	public static void main(String[] args) {
		SpringApplication.run(ControleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("****INSERTION****");
		//for(int i=1; i<2;i++) {
		//Livre n1= new Livre(null,"livre "+i,"edition " +i,new Date(),"Auteur " +i ,100,40+i,new Date(),true);
		//Livre v = livrerepo.save(n1);
		//System.out.println(n1);
		//}
	
		System.out.println("Nombre de ligne : " +livrerepo.count());
		
		
	}
}
