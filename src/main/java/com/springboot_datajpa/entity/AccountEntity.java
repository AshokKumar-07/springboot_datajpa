package com.springboot_datajpa.entity;


import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AccountEntity implements Serializable {
	@Id
	@Column(name="account_no")
	private int accountNo;
	@Column(name="account_name")
	private String accountName;
	@Column(name="account_type")
	private String accountType;
	@Column(name="address")
	private String address;
}
