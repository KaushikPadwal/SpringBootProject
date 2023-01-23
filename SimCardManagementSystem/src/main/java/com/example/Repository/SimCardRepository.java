package com.example.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.Model.SimCard;

// SimCardRepository Interface
public interface SimCardRepository extends JpaRepository<SimCard,Integer>
{
	//Customize method
	//SimCard Company find by name 
   public List<SimCard> findByName(String name);

}
