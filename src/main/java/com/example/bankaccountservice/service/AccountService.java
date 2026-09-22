package com.example.bankaccountservice.service;

import com.example.bankaccountservice.DTO.BankAccountRequestDTO;
import com.example.bankaccountservice.DTO.BankAccountResponseDTO;
import com.example.bankaccountservice.entities.BankAccount;

import java.util.List;

public interface AccountService {
    public BankAccountResponseDTO addAccount(BankAccountRequestDTO bankAccountDTO);
    public List<BankAccountResponseDTO> bankAccount();
    public BankAccountResponseDTO bankAccount(String id);
    public BankAccountResponseDTO update(String id , BankAccountRequestDTO bankAccountRequestDTO);
    public void delete(String id);
}
