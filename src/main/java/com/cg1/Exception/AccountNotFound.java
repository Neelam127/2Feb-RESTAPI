package com.cg1.Exception;

public class AccountNotFound extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AccountNotFound(String msg) {
		super(msg);
	}

}
