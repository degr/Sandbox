package org.forweb.sandbox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.forweb.sandbox.dao.ClientDao;
import org.forweb.sandbox.entity.Client;
import org.forweb.sandbox.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController extends CrudController<Client, ClientDao, ClientService> {
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    @Override
    public List<Client> showAll() {
        List<Client> out = service.findAll();
        return out;
    }
}
