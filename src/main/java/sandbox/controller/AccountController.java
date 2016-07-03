package sandbox.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sandbox.dao.AccountDao;
import sandbox.entity.Account;
import sandbox.service.AccountService;

@RestController
@RequestMapping("account")
public class AccountController extends CrudController<Account, AccountDao, AccountService> {
}
