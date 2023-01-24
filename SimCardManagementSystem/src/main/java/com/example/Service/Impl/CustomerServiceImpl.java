package com.example.Service.Impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.Model.Customer;
import com.example.Repository.CustomerRepository;
import com.example.Service.CustomerService;

//CustomerServiceImpl class
@Repository
public class CustomerServiceImpl implements CustomerService
{
	@Autowired(required =true )
	private CustomerRepository customerrepository;

	//implement the saveCustomer method
	@Override
	public Customer saveCustomer(Customer customer) 
	{
		
		return customerrepository.save(customer);
	}

	//implement the findById method
	@Override
	public Customer findById(int id) 
	{
		
		return customerrepository.findById(id).get();
	}

	////implement the getAllCustomers method
	@Override
	public List<Customer> getAllCustomers() 
	{
		
		return customerrepository.findAll();
	}

	////implement the DeleteCustomer method
	@Override
	public void deleteCustomer(int id) {
		
		customerrepository.deleteById(id);
	}

	//implement the updateCustomer method
	@Override
	public Customer updateCustomer(Customer customer) 
	{
		Customer _customer = customerrepository.findById(customer.getId()).get();
		_customer.setId(_customer.getId());
		_customer.setName(_customer.getName());
		_customer.setAge(_customer.getAge());
		_customer.setGender(_customer.getGender());
		_customer.setAddress(_customer.getAddress());
		_customer.setAdhar_no(_customer.getAdhar_no());
		_customer.setContact(_customer.getContact());
		_customer.setEmail(_customer.getEmail());
		_customer.setSim_no(_customer.getSim_no());
		_customer.setStatus(_customer.getStatus());
		
		return customerrepository.save(customer);
	}
	//implement the findByName method
	@Override
	public List<Customer> findByName(String name) 
	{
		
		return customerrepository.findByName(name);	
		}

	//implement the findByemail method
	@Override
	public List<Customer> findByemail(String email) {
		// TODO Auto-generated method stub
		return customerrepository.findByemail(email);
	}

}
