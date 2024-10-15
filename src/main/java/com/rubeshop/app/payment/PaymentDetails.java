package com.rubeshop.app.payment;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class PaymentDetails {
    private String paymentId;
    private String stripePaymentLinkId;
    private String stripePaymentLinkReferenceId;
    private String stripePaymentLinkStatus;
    private String stripePaymentIdZWSP;
    private PaymentStatus status;
}
