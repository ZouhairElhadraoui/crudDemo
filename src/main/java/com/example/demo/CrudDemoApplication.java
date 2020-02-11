package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.demo.Dao.ProduitRepository;
import com.example.demo.entity.Produit;




@SpringBootApplication
public class CrudDemoApplication implements CommandLineRunner {

	

	
	public static void main(String[] args) {
		
		ApplicationContext  context = SpringApplication.
				run(CrudDemoApplication.class, args);
		ProduitRepository produitRepository = context.getBean(ProduitRepository.class); 
		produitRepository.save(new Produit("ThinVision", 500, 1)); 
		produitRepository.save(new Produit("Ibm", 200, 3)); 
		produitRepository.save(new Produit("Dell", 1000, 1)); 
		
		
		
		List<Produit> produits= produitRepository.produitParMc("%i%"); 
		for(Produit p: produits) {
			System.out.println("Des : " + p.getDesignation());
			System.out.println("Prix : " + p.getPrix());
			
		}
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
