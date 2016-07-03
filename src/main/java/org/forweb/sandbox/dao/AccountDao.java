package org.forweb.sandbox.dao;

import org.forweb.database.AbstractDao;
import org.springframework.stereotype.Repository;
import org.forweb.sandbox.entity.Account;

@Repository
public interface AccountDao extends AbstractDao<Account>{
}
