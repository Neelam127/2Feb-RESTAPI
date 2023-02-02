package com.cg1.Service;

import java.util.List;

import javax.security.auth.login.AccountNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg1.Repository.AccountRepository;
import com.cg1.model.Account;

@Service
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public List<Account> findAllAccounts() {
		// TODO Auto-generated method stub
		return accountRepository.findAll();
	}

	@Override
	public Account findAccountById(int accountId) throws AccountNotFoundException {
		// TODO Auto-generated method stub
		return accountRepository.findById(accountId).orElseThrow(()-> new AccountNotFoundException("Account Not Found"));
	}

	@Override
	public Account addAccount(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

	@Override
	public Account updateAccount(int accountId, Account account) throws AccountNotFoundException{
		// TODO Auto-generated method stub
		Account update=accountRepository.findById(accountId).orElseThrow(()-> new AccountNotFoundException("Account Not Found"));
		update.setAccountId(account.getAccountId());
		update.setAccountHoldername(account.getAccountHoldername());
		update.setAmount(account.getAmount());
		
		return accountRepository.save(update);
	}

	@Override
	public void deleteAccount(int accountId) {
		// TODO Auto-generated method stub
		accountRepository.deleteById(accountId);
		
	}

}
