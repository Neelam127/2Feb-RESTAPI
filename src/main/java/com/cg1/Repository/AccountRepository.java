package com.cg1.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.cg1.model.Account;

public interface AccountRepository extends MongoRepository<Account,Integer >{

}
