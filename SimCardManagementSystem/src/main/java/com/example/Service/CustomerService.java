package com.example.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.example.Model.Customer;
import com.example.Model.SimCard;

// This is a CustomerServuice Interface
@Service
public interface CustomerService 
{
	// save method ...use this method save the customer
    public Customer saveCustomer(Customer customer);
	
    //find method by id...
	public Customer findById(int id);
	
	// get/ fetch all customer using getAll method
	List<Customer>getAllCustomers();
	
	//delete method .. using this method delete the customer ..by helping id
	public void deleteCustomer(int id);
	
	//This is a update method ...use this method update the customer
	public Customer updateCustomer (Customer customer);
	
	// this is a customize method ...findBy
	//using this message customer find by name
	 public List<Customer> findByName(String name);
		
	// this is a customize method ...findBy
	//using this message customer find by email
	 public List<Customer> findByemail(String email);
	
}
