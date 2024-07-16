package com.bankingapplication.mapper;

import com.bankingapplication.dto.AccountDto;
import com.bankingapplication.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
        return new Account(
            accountDto.getCust_id(),
            accountDto.getFirst_name(),
            accountDto.getLast_name(),
            accountDto.getDob(),
            accountDto.getAccno(),
            accountDto.getBranch(),
            accountDto.getAddress_line1(),
            accountDto.getCity(),
            accountDto.getState(),
            accountDto.getPincode()
        );
    }

    public static AccountDto mapToAccountDto(Account account) {
        return new AccountDto(
            account.getCust_id(),
            account.getFirst_name(),
            account.getLast_name(),
            account.getDob(),
            account.getAccno(),
            account.getBranch(),
            account.getAddress_line1(),
            account.getCity(),
            account.getState(),
            account.getPincode()
        );
    }
}
