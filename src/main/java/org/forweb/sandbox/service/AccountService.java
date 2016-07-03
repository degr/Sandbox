package org.forweb.sandbox.service;

import org.forweb.database.AbstractService;
import org.springframework.stereotype.Service;
import org.forweb.sandbox.dao.AccountDao;
import org.forweb.sandbox.entity.Account;

@Service
public class AccountService extends AbstractService<Account, AccountDao>{
}
