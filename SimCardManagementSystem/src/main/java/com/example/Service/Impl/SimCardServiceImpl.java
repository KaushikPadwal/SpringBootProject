package com.example.Service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.Model.SimCard;
import com.example.Repository.SimCardRepository;
import com.example.Service.SimCardService;

//This is a SimCardServiceImpl Class
@Repository
public class SimCardServiceImpl implements SimCardService
{
	@Autowired
	private SimCardRepository simcardRepository;

	//implement the saveSimCard method
	@Override
	public SimCard saveSimCard(SimCard simcard) 
	{
	
		return simcardRepository.save(simcard);
	}

	//implement the findById method
	@Override
	public SimCard findById(int id) 
	{
	
		return simcardRepository.findById(id).get();
	}

	////implement the getAllSimCards method
	@Override
	public List<SimCard> getAllSimcards() 
	{
		
		return simcardRepository.findAll();
	}

	//implement the DeletSimCard method
	@Override
	public void deleteSimCard(int id)
	{
		simcardRepository.deleteById(id);
		
	}
	
	//implement the updateSimCard method
	@Override
	public SimCard updateSimCard(SimCard simcard) 
	{
		SimCard _simcard = simcardRepository.findById(simcard.getId()).get();
		_simcard.setId(_simcard.getId());
		_simcard.setName(_simcard.getName());
		_simcard.setCustomer_care_no(_simcard.getCustomer_care_no());
		_simcard.setEmail(_simcard.getEmail());
		_simcard.setTotal_customer(_simcard.getTotal_customer());
		
		return simcardRepository.save(simcard) ;
	}

	//implement the findByName method
	@Override
	public List<SimCard> findByName(String name) 
	{
		
		return simcardRepository.findByName(name);
	}

}
