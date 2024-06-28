/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inversionesjrj.core.perm.domain.dto;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 * @author Alienware
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class AccountDomain {    
    private Account account;
    private List<AccountRelCompanyRol> companyRols;  
}
