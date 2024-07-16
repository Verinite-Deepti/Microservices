package com.bankingapplication.service;

import com.bankingapplication.dto.AccountDto;
import java.util.List;

public interface AccountService {

    AccountDto createAccount(AccountDto account);
    AccountDto getAccountById(Long cust_id);
    AccountDto getAccountByAccno(String accno);
    List<AccountDto> getAllAccounts();
    void updateAccount(Long cust_id, AccountDto accountDto);
    void partiallyUpdateAccount(Long cust_id, AccountDto accountDto);
    void deleteAccount(Long cust_id);


}
