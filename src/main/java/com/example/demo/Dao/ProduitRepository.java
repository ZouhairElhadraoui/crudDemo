package com.example.demo.Dao;
import com.example.demo.entity.Produit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface ProduitRepository  extends JpaRepository<Produit, Long> {
	
	@Query("SELECT  p FROM Produit p  WHERE p.designation LIKE :x")
	public  List<Produit> produitParMc(@Param("x")String mc); 
	
 	
}
