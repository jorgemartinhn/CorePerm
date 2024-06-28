/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.inversionesjrj.core.perm.domain.dto;

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
public class AccountRelCompanyRol {
    private String id;
    private String companyIDUUID; 
    //private String companyCommercialName;
    private String rolIDUUID;// Rol rol;
    //private String rolName;    
    Company company;
    Rol rol;
}
