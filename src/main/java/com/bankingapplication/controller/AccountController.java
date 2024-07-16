package com.bankingapplication.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bankingapplication.dto.AccountDto;
import com.bankingapplication.service.AccountService;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    
    // POST - http://localhost:8080/api/accounts
    @PostMapping
    public ResponseEntity<AccountDto> addAccount(@RequestBody AccountDto accountDto) {
        return new ResponseEntity<>(accountService.createAccount(accountDto), HttpStatus.CREATED);
    }
    
    
    //GET - http://localhost:8080/api/accounts/{cust_id}
    //GET - http://localhost:8080/api/accounts/1
    
    @GetMapping("/{cust_id}")
    public ResponseEntity<AccountDto> getAccountById(@PathVariable Long cust_id){
        AccountDto accountDto = accountService.getAccountById(cust_id);
        return ResponseEntity.ok(accountDto);
    }
    
    //GET - http://localhost:8080/api/accounts/account/{accno}
    //GET - http://localhost:8080/api/accounts/account/123456789
    
    @GetMapping("/account/{accno}")
    public ResponseEntity<AccountDto> getAccountByAccno(@PathVariable String accno){
        AccountDto accountDto = accountService.getAccountByAccno(accno);
        return ResponseEntity.ok(accountDto);
    }

    //GET - http://localhost:8080/api/accounts
    @GetMapping
    public ResponseEntity<List<AccountDto>> getAllAccounts(){
        List<AccountDto> accountDtos = accountService.getAllAccounts();
        return ResponseEntity.ok(accountDtos);
    }
    
    //PUT - http://localhost:8080/api/accounts/{cust_id}
    //PUT - http://localhost:8080/api/accounts/1
    @PutMapping("/{cust_id}")
    public ResponseEntity<String> updateAccount(@PathVariable Long cust_id, @RequestBody AccountDto accountDto) {
        accountService.updateAccount(cust_id, accountDto);
        return ResponseEntity.ok("Account Updated Sucessfully");
    }
    
   //PATCH - http://localhost:8080/api/accounts/{cust_id}
   //PATCH - http://localhost:8080/api/accounts/1
    @PatchMapping("/{cust_id}")
    public ResponseEntity<String> partiallyUpdateAccount(@PathVariable Long cust_id, @RequestBody AccountDto accountDto) {
        accountService.partiallyUpdateAccount(cust_id, accountDto);
        return ResponseEntity.ok("Account Updated Sucessfully");
    }
    
    //DELETE - http://localhost:8080/api/accounts/{cust_id}
    //DELETE - http://localhost:8080/api/accounts/1
    
    @DeleteMapping("/{cust_id}")
    public ResponseEntity<String> deleteAccount(@PathVariable Long cust_id) {
        accountService.deleteAccount(cust_id);
        return ResponseEntity.ok("Account Deleted Sucessfully");
    }

}
