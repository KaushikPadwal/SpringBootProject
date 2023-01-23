
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
import com.example.Repository.CustomerRepository;
import com.example.Service.CustomerService;

   //  Customer Test Class
	@SpringBootTest
	public class CustomerRepositoryTest 
	{
		@MockBean
		private CustomerRepository customerrepository;
		@Autowired
		private CustomerService customerservice;
		
		//Test SaveCustomer Method
		@Test
		void testSaveCustomer() 
		{
			Customer c = new Customer(1,"Raju",32,"Male","pune",546820,"98523012","raj@gmail.com",200,"Active");
			Mockito.when(customerrepository.save(c)).thenReturn(c);
			assertEquals(c,customerservice.saveCustomer(c));
		}
		
		//Test GetAllCustomer Method
		@Test
		void testGetAllCustomer() 
		{
			List<Customer> customer = Stream
					.of(new Customer(1,"Raju",32,"Male","pune",546820,"98523012","raj@gmail.com",200,"Active"),
					new Customer(1,"Raju",32,"Male","pune",546820,"98523012","raj@gmail.com",200,"Active"))
					.collect(Collectors.toList());
			Mockito.when(customerrepository.findAll()).thenReturn(customer);
			assertEquals(2,customerservice.getAllCustomers().size());
			
		}
		
		//Test DeleteCustomer Method
		@Test
		void testDeleteCustomer() 
		{
			customerservice.deleteCustomer(1);
			Mockito.verify(customerrepository).deleteById(1);
		}
	

	}
