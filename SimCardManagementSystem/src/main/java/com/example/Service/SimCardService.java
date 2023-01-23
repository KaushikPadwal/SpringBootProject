package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.Model.SimCard;

//This is a SimCard ServiceInterface
@Service
public interface SimCardService 
{
	//This is a save method ...using this method save the SimCard
	public SimCard saveSimCard(SimCard simcard);
	
	//find by method ..find by SimCard using id
	public SimCard findById(int id);
	
	//getAll method ..using this method fetch all SimCard Companies
	List<SimCard>getAllSimcards();
	
	// delete method
	public void deleteSimCard(int id);
	
	//This is a update method
	public SimCard updateSimCard (SimCard simcard);
	
	//This is a customize method... using this method 
	public List<SimCard> findByName(String name);

}
