
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
public class Account {
    private String accountApp;   
    private String accountPassword;   
    private String accountName;    
    private String accountEmail;
}
