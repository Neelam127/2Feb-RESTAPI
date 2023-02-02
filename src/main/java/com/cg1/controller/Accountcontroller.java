package com.cg1.controller;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg1.Service.AccountService;
import com.cg1.model.Account;

@RestController
@RequestMapping("/api")
public class Accountcontroller {
	
	@Autowired
	private AccountService accountService; 
	
	@GetMapping("/account")
	public List<Account> getAllAccount(){
		
		return accountService.findAllAccounts();
		
	}
	
	@GetMapping("/account/{accountId}")
	public Account getAccountById(int accountId) throws AccountNotFoundException {
		return accountService.findAccountById(accountId);
	}

	@PostMapping("/account")
	public Account addAccount(Account account) {
		return accountService.addAccount(account);
	}
	
	@PutMapping("/account/{accountId}")
	public Account updateAccount(int accountId,Account account) throws AccountNotFoundException {
		return accountService.updateAccount(accountId, account);
	}
	
	@DeleteMapping("/account")
	public void deleteAccount(int accountId) {
		accountService.deleteAccount(accountId);
	}
	
}
