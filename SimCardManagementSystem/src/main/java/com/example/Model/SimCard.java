package com.example.Model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data 
@AllArgsConstructor
@NoArgsConstructor
@Table(name="SimCard_Company") // change table name
public class SimCard           // SimCard class
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull(message="Name is required")
	private String name;
	
	private int customer_care_no;
	@Email(message="please provide valid email id")
	private String email;
	private long Total_customer;
	
	//BiDirection mapping
//	@OneToMany(fetch=FetchType.EAGER,mappedBy="simcard",cascade=CascadeType.ALL)
//	@JsonIgnoreProperties("customer")
	
	//UniDirection mapping
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Customer>customerList=new ArrayList<>();

	//Default Constructor
	public SimCard() 
	{
		
	}

	//Parameterized Constructor
	public SimCard(int id, @NotNull(message = "Name is required") String name, int customer_care_no,
			@Email(message = "please provide valid email id") String email, long total_customer,
			List<Customer> customerList) 
	{
		super();
		this.id = id;
		this.name = name;
		this.customer_care_no = customer_care_no;
		this.email = email;
		Total_customer = total_customer;
		this.customerList = customerList;
	}

//Use Getter Setter Method
	public int getId() 
	{
		return id;
	}

	public void setId(int id) 
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public int getCustomer_care_no() 
	{
		return customer_care_no;
	}

	public void setCustomer_care_no(int customer_care_no) 
	{
		this.customer_care_no = customer_care_no;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email;
	}

	public long getTotal_customer()
	{
		return Total_customer;
	}

	public void setTotal_customer(long total_customer) 
	{
		Total_customer = total_customer;
	}

	public List<Customer> getCustomerList() 
	{
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList)
	{
		this.customerList = customerList;
	}

}
	