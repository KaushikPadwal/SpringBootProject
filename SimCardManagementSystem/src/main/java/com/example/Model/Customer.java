package com.example.Model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer  // Customer class
{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private int id;
	@Column(name="Customer_name")
	private String name;
	private int age;
	private String gender;
	private String address;
	private long adhar_no;
	@Column(length=10,unique=true)
	private String  contact;
	@Email(message="please provide valid email id")
	private String email;
	@NotNull
	private long sim_no;
	private String status;
	
	//BiDirection Mapping
//	@ManyToOne(cascade=CascadeType.ALL,fetch= FetchType.EAGER)
//	@JoinColumn(name="sc_id")
//	private SimCard simcard;
	
	//Default constructor
	public Customer()
	{
		
	}
	
	//Parameterized constructor
	public Customer(int id, String name, @Positive int age, String gender, String address,
			@NotEmpty(message = "Adhar number is required") long adhar_no, String contact,
			@Email(message = "please provide valid email id") String email, long sim_no, String status
			/*SimCard simcard*/) 
	{
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.adhar_no = adhar_no;
		this.contact = contact;
		this.email = email;
		this.sim_no = sim_no;
		this.status = status;
		//this.simcard = simcard;
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

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public String getGender() 
	{
		return gender;
	}

	public void setGender(String gender)
	{
		this.gender = gender;
	}

	public String getAddress() 
	{
		return address;
	}

	public void setAddress(String address) 
	{
		this.address = address;
	}

	public long getAdhar_no() 
	{
		return adhar_no;
	}

	public void setAdhar_no(long adhar_no) 
	{
		this.adhar_no = adhar_no;
	}

	public String getContact()
	{
		return contact;
	}

	public void setContact(String string) 
	{
		this.contact = string;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public long getSim_no() 
	{
		return sim_no;
	}

	public void setSim_no(long sim_no) 
	{
		this.sim_no = sim_no;
	}

	public String getStatus() 
	{
		return status;
	}

	public void setStatus(String status) 
	{
		this.status = status;
	}

//	public SimCard getSimcard() 
//	{
//		return simcard;
//	}
//
//	public void setSimcard(SimCard simcard) 
//	{
//		this.simcard = simcard;
//	}
	
	
	



}