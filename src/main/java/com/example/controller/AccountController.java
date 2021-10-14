package com.example.controller;

import com.example.domain.Account;
import com.example.domain.enumerate.AccountStatus;
import com.example.domain.enumerate.AccountType;
import com.example.repository.AccountRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * Project : demo-flyway
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 15/10/21
 * Time: 06.33
 */
@Log4j2
@RequestMapping("/api/v1/accounts")
@RestController
public class AccountController {
    @Autowired
    AccountRepository accountRepository;

    @GetMapping("/add")
    public Account create() {
        Account account = new Account("naruto", "Uzumaki Naruto", AccountStatus.ACTIVATE, AccountType.NRIC);
        Account newAccount = accountRepository.save(account);
        log.info("New Account has been created successfully!");

        return newAccount;
    }

    @GetMapping
    public List<Account> getAllAccounts() {
        log.info("List All Accounts!");
        return accountRepository.findAll();
    }
}
