package com.cg1.Service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import com.cg1.model.Account;

public interface AccountService {
	
	List<Account> findAllAccounts();
	
	Account findAccountById(int accountId) throws AccountNotFoundException;
	
	Account addAccount(Account account);
	
	Account updateAccount(int accountId,Account account) throws AccountNotFoundException;
	
	void deleteAccount(int accountId);
	
	

}
