package com.bankingapplication.service.Impl;

import org.springframework.stereotype.Service;
import com.bankingapplication.dto.AccountDto;
import com.bankingapplication.entity.Account;
import com.bankingapplication.mapper.AccountMapper;
import com.bankingapplication.repository.AccountRepository;
import com.bankingapplication.service.AccountService;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    //post details
    
    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        Account account = AccountMapper.mapToAccount(accountDto);
        Account savedAccount = accountRepository.save(account);
        return AccountMapper.mapToAccountDto(savedAccount);
    }

  
    //get by id
    
    @Override
    public AccountDto getAccountById(Long cust_id) {
        Account account = accountRepository.findById(cust_id)
                .orElseThrow(() -> new RuntimeException("Account does not exist"));
        return AccountMapper.mapToAccountDto(account);
    }

  //get by account no
    
    @Override
    public AccountDto getAccountByAccno(String accno) {
        Account account = accountRepository.findByAccno(accno)
                .orElseThrow(() -> new RuntimeException("Invalid Account No"));
        return AccountMapper.mapToAccountDto(account);
    }
    
    //get details of all customers

    @Override
    public List<AccountDto> getAllAccounts() {
        List<Account> accounts = accountRepository.findAll();
        return accounts.stream()
                .map(AccountMapper::mapToAccountDto)
                .collect(Collectors.toList());
    }
    
    //update details of all customers
    
    @Override
    public void updateAccount(Long cust_id, AccountDto accountDto) {
        Account existingAccount = accountRepository.findById(cust_id)
                .orElseThrow(() -> new RuntimeException("Account does not exist"));

      
        existingAccount.setFirst_name(accountDto.getFirst_name());
        existingAccount.setLast_name(accountDto.getLast_name());
        existingAccount.setDob(accountDto.getDob());
        existingAccount.setAccno(accountDto.getAccno());
        existingAccount.setBranch(accountDto.getBranch());
        existingAccount.setAddress_line1(accountDto.getAddress_line1());
        existingAccount.setCity(accountDto.getCity());
        existingAccount.setState(accountDto.getState());
        existingAccount.setPincode(accountDto.getPincode());

        accountRepository.save(existingAccount);
    }
    
  //update details of all customers
    
    @Override
    public void partiallyUpdateAccount(Long cust_id, AccountDto accountDto) {
        Account existingAccount = accountRepository.findById(cust_id)
                .orElseThrow(() -> new RuntimeException("Account does not exist"));

       
        if (accountDto.getFirst_name() != null) existingAccount.setFirst_name(accountDto.getFirst_name());
        if (accountDto.getLast_name() != null) existingAccount.setLast_name(accountDto.getLast_name());
        if (accountDto.getDob() != null) existingAccount.setDob(accountDto.getDob());
        if (accountDto.getAccno() != null) existingAccount.setAccno(accountDto.getAccno());
        if (accountDto.getBranch() != null) existingAccount.setBranch(accountDto.getBranch());
        if (accountDto.getAddress_line1() != null) existingAccount.setAddress_line1(accountDto.getAddress_line1());
        if (accountDto.getCity() != null) existingAccount.setCity(accountDto.getCity());
        if (accountDto.getState() != null) existingAccount.setState(accountDto.getState());
        if (accountDto.getPincode() != null) existingAccount.setPincode(accountDto.getPincode());

        accountRepository.save(existingAccount);
    }

    
    //delete details of all customers
	@Override
	public void deleteAccount(Long cust_id) {
		// TODO Auto-generated method stub
		Account account = accountRepository.findById(cust_id)
                .orElseThrow(() -> new RuntimeException("Account does not exist"));
	
	accountRepository.delete(account);
	
	}
    


	
    
 

	

}
