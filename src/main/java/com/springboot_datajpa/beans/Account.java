package com.springboot_datajpa.beans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(builderMethodName="of")
public class Account {
	private int accountNo;
	private String accountName;
	private String accountType;
	private String address;
}
