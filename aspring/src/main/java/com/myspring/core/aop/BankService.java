package com.myspring.core.aop;

import org.springframework.stereotype.Service;

import com.myspring.model.User;

@Service
public class BankService extends BaseService {
	
	public void accout() {
		System.out.println("计算金额");
	}
	
	public int updateAccount(User user) {
		System.out.println("this is updateAccout");
//		throw new RuntimeException();
		return 11111;
	}
}
