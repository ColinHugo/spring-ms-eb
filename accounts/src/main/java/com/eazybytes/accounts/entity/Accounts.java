package com.eazybytes.accounts.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter @Setter @ToString @NoArgsConstructor @AllArgsConstructor
@Entity
public class Accounts extends BaseEntity {

    private Long customerId;

    @Id
    private Long accountNumber;

    private String accountType;

    private String branchAddress;

}