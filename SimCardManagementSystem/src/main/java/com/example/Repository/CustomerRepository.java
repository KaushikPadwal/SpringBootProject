package com.example.Repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Model.Customer;

//CustomerRepository Interface
public interface CustomerRepository extends JpaRepository<Customer,Integer> 
{
	//Customize Method
	//Customer find by name
	 public List<Customer> findByName(String name);
		
	 //Customer find by email
	 public List<Customer> findByemail(String email);
}
