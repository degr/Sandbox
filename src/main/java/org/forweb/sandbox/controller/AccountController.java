package org.forweb.sandbox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.forweb.sandbox.dao.AccountDao;
import org.forweb.sandbox.entity.Account;
import org.forweb.sandbox.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController extends CrudController<Account, AccountDao, AccountService> {
}
