package sandbox.dao;

import org.forweb.database.AbstractDao;
import org.springframework.stereotype.Repository;
import sandbox.entity.Client;

@Repository
public interface ClientDao  extends AbstractDao<Client>{

}
