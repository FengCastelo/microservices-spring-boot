package com.fengcastelo.hr_payroll.Services;

import com.fengcastelo.hr_payroll.Entities.Payment;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    public Payment getPayment(long workerId, int days) {
        return new Payment("Bob", 200.0, days);
    }
}
