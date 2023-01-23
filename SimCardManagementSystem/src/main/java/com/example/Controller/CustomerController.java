package com.example.Controller;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.Model.Customer;
import com.example.Service.CustomerService;

//Customer Controller class
@RestController
public class CustomerController 
{
	@Autowired(required=true)
	private CustomerService customerservice;
	
	//save customer
	@PostMapping("/customervalid")
	public ResponseEntity<Customer>addValidCustomer(@Valid @RequestBody Customer c)
	{
		return new ResponseEntity<Customer>(customerservice.saveCustomer(c),HttpStatus.CREATED);
		
	}

	//Fetch/Get customer by id
	@GetMapping("/customer/id/{id}")
	public Customer findByCustomerId(@PathVariable int id) 
	{
		return customerservice.findById(id);
		
	}
	
	// fetch/Get All customer
	@GetMapping("/customer")
	public List<Customer>getAllCustomer()
	{
		return customerservice.getAllCustomers();
		
	}
	
	//Delete customer
	@DeleteMapping("/customer/del/{id}")
	public String deleteCustomer(@PathVariable int id) 
	{
	 customerservice.deleteCustomer(id);
		return "Customer is Deleted";		
	}
	
	//update customer
	@PutMapping("/customer")
	public Customer updateCustomer(@RequestBody Customer customer) 
	{
		return customerservice.updateCustomer(customer );
		
	}
	
	//This is a customize method 
	//Fetch/Get customer by name
	@GetMapping("/customer/Name/{name}")
	public List<Customer> findByname(@PathVariable String name) 
	{
		return customerservice.findByName(name);
		
	}
	
	//This is a customize method 
	//Fetch/Get customer by Email
	@GetMapping("/customer/Email/{email}")
	public List<Customer> findByemail(@PathVariable String email) 
	{
		return customerservice.findByemail(email);
		
	}

}
