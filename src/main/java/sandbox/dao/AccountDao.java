package sandbox.dao;

import org.forweb.database.AbstractDao;
import org.springframework.stereotype.Repository;
import sandbox.entity.Account;

@Repository
public interface AccountDao extends AbstractDao<Account>{
}
