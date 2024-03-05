package com.springboot_datajpa.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot_datajpa.entity.AccountEntity;

@Repository
public interface AccountDao extends JpaRepository<AccountEntity, Integer> {
	
}
