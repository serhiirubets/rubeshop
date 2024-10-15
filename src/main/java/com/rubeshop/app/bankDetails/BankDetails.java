package com.rubeshop.app.bankDetails;

import jakarta.persistence.Embeddable;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Embeddable
public class BankDetails {
    private String accountNumber;
    private String accountHolderName;
    private String ifscCode;
}
