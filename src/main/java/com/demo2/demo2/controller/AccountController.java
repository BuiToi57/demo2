package com.demo2.demo2.controller;

import com.demo2.demo2.entity.Account;
import com.demo2.demo2.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }
    
    @GetMapping
    public String getText() {
    	return "This is my project";
    }

    @GetMapping
    public String getText1() {
    	return "This is my project";
    }
}

