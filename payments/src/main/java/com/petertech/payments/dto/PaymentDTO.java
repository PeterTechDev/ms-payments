package com.petertech.payments.dto;

import com.petertech.payments.model.Status;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter @Setter
public class PaymentDTO {

    private Long id;
    private BigDecimal value;
    private String name;
    private String number;
    private String validation;
    private String code;
    private Status status;
    private Long paymentMethodId;
    private Long orderId;
}
