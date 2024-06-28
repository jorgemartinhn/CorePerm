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
public class RolPermission {
    private String id;
    private Rol rol;
    private Permission permission;
    private boolean access;
    private boolean newRegistry;
    private boolean editRegistry;
    private boolean deleteRegistry;
    private boolean printRegistry;
}
