package com.springboot_datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.springboot_datajpa.beans.Account;
import com.springboot_datajpa.service.AccountService;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.springboot_datajpa.dao"})
@EnableTransactionManagement
public class AccountTest {
	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AccountTest.class, args);
		AccountService service=context.getBean(AccountService.class);
	//	Account account=service.getAccountList(1);
	//	System.out.println("the account details: "+account);
		Account account=new Account(2,"kohli","current","ranchi");
		service.saveAccount(account);
		System.out.println("the account inserted successfully....");
	}
}
