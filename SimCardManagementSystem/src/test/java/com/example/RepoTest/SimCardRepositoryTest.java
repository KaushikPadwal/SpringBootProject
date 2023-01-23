package com.example.RepoTest;

import static org.junit.Assert.assertEquals;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import com.example.Model.Customer;
import com.example.Model.SimCard;
import com.example.Repository.SimCardRepository;
import com.example.Service.SimCardService;

//SimCard Test Class
@SpringBootTest
public class SimCardRepositoryTest 
{
	@Autowired
	private SimCardService  simcardservice;
	
	@Autowired
	@MockBean
	private SimCardRepository simcardrepository;
	
	//Test SaveSimCard Method
	@Test
	void testsaveSimCard()
	{
		List<Customer> customerlist=Stream
				.of(new Customer(1,"Raju",32,"Male","pune",546820,"98523012","raj@gmail.com",200,"Active"),new Customer(2,"Anju",22,"female","pune",326820,"9852142","anju@gmail.com",400,"Active"))
						.collect(Collectors.toList());
		SimCard c=new SimCard(1,"Airtel",32541,"air@gmail.com",200,customerlist);
		Mockito.when(simcardrepository.save(c)).thenReturn(c);
		assertEquals(c,simcardservice.saveSimCard(c));
	}
	
	//Test GetAllSimCards Method
	@Test
	void testGetAllSimcards() 
	{
		List<Customer> customerlist=Stream
				.of(new Customer(1,"Raju",32,"Male","pune",546820,"98523012","raj@gmail.com",200,"Active"),new Customer(2,"Anju",22,"female","pune",326820,"9852142","anju@gmail.com",400,"Active"))
						.collect(Collectors.toList());
		List<SimCard> simcard = Stream
				.of(new SimCard(1,"Airtel",32541,"air@gmail.com",200,customerlist),
						new SimCard(2,"Voda",124541,"voda@gmail.com",500,customerlist))
							.collect(Collectors.toList());
		Mockito.when(simcardrepository.findAll()).thenReturn(simcard);
		assertEquals(2,simcardservice.getAllSimcards().size());
		
	}
	
	//Test DeleteSimCard Method
	@Test
	void testDeleteSimCard() 
	{
		simcardservice.deleteSimCard(2);
		Mockito.verify(simcardrepository).deleteById(2);
	}
	
}
