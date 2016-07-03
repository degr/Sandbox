package org.forweb.sandbox.service;

import org.forweb.database.AbstractService;
import org.springframework.stereotype.Service;
import org.forweb.sandbox.dao.ClientDao;
import org.forweb.sandbox.entity.Client;

@Service
public class ClientService extends AbstractService<Client, ClientDao> {
}
