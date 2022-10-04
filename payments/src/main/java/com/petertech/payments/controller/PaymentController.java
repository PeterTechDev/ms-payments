package com.petertech.payments.controller;

import com.petertech.payments.dto.PaymentDTO;
import com.petertech.payments.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping
    public Page<PaymentDTO> list(@PageableDefault(size = 10) Pageable paginaion) {
        return paymentService.findAll(paginaion);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PaymentDTO> detail(@PathVariable @NotNull Long id) {
        PaymentDTO dto = paymentService.findById(id);

        return ResponseEntity.ok(dto);
    }
}
