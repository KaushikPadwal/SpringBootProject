
//Project Name:SimcardManagement
//In that one to many mapping -> one SimCard Company has many Customers 
//Develop By :Kaushik Rohidas Padawl
//Batch Code :ANP-2839
//UserName:AF0222704
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2 //using for Api documentation
public class SimCardManagementSystemApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(SimCardManagementSystemApplication.class, args);
	}
}
