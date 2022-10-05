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
    private Long order_id;
    private Long payment_method_id;
    private Status status;
}
