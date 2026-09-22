package com.example.bankaccountservice.web;

import com.example.bankaccountservice.DTO.BankAccountRequestDTO;
import com.example.bankaccountservice.DTO.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;
import com.example.bankaccountservice.repositories.BankAccountRepository;
import com.example.bankaccountservice.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api")
public class AccountRestController {
    private BankAccountRepository bankAccountRepository;
    private AccountService accountService;
    public AccountRestController(BankAccountRepository bankAccountRepository , AccountService accountService){
        this.bankAccountRepository=bankAccountRepository;
        this.accountService =accountService;
    }
    @GetMapping("/bankAccounts")
    public List<BankAccountResponseDTO> bankAccounts(){

        return accountService.bankAccount();
    }
    @GetMapping("/bankAccounts/{id}")
    public BankAccountResponseDTO bankAccount(@PathVariable String id){
        return accountService.bankAccount(id);
    }
    @PostMapping("/bankAccounts")
    public BankAccountResponseDTO save(@RequestBody BankAccountRequestDTO requestDTO){
        return accountService.addAccount(requestDTO);

    }
    @PutMapping("/bankAccounts/{id}")
    public BankAccountResponseDTO update(@PathVariable String id,@RequestBody BankAccountRequestDTO bankAccountRequestDTO){
        return accountService.update(id,bankAccountRequestDTO);

    }
    @DeleteMapping("/bankAccounts/{id}")
    public void delete(@PathVariable String id){
       accountService.delete(id);
    }

}
