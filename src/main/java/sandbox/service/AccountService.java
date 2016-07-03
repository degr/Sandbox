package sandbox.service;

import org.forweb.database.AbstractService;
import org.springframework.stereotype.Service;
import sandbox.dao.AccountDao;
import sandbox.entity.Account;

@Service
public class AccountService extends AbstractService<Account, AccountDao>{
}
