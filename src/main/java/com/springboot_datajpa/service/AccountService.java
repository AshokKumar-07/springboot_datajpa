package com.springboot_datajpa.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springboot_datajpa.beans.Account;
import com.springboot_datajpa.dao.AccountDao;
import com.springboot_datajpa.entity.AccountEntity;


@Service
public class AccountService {
	
	@Autowired
    private AccountDao accountDao;
    
	@Transactional(readOnly=true)
    public  Account getAccountList(int accountNo){
    	System.out.println("the service");
    	AccountEntity accountEntity=accountDao.getById(accountNo);
    	Account account=new Account(accountEntity.getAccountNo(),accountEntity.getAccountName(),accountEntity.getAccountType(),accountEntity.getAddress());
    	return account;
    }
    
    @Transactional(readOnly=false)
    public String saveAccount(Account account) {
    	AccountEntity accountEntity=new AccountEntity(account.getAccountNo(),account.getAccountName(),account.getAccountType(),account.getAddress());
    	accountDao.save(accountEntity);
    	return "success";
    }
}
