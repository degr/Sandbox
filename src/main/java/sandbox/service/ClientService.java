package sandbox.service;

import org.forweb.database.AbstractService;
import org.springframework.stereotype.Service;
import sandbox.dao.ClientDao;
import sandbox.entity.Client;

@Service
public class ClientService extends AbstractService<Client, ClientDao> {
}
