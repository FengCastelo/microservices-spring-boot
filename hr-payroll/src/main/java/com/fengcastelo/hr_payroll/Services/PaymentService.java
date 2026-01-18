package com.fengcastelo.hr_payroll.Services;

import com.fengcastelo.hr_payroll.Entities.Payment;
import com.fengcastelo.hr_payroll.Entities.Worker;
import com.fengcastelo.hr_payroll.feignclients.WorkerFeignClient;
import org.springframework.stereotype.Service;


@Service
public class PaymentService {

    private final WorkerFeignClient feignClient;

    public PaymentService(WorkerFeignClient feignClient) {
        this.feignClient = feignClient;
    }

    public Payment getPayment(Long workerId, int days) {
        Worker worker = feignClient.findById(workerId);
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}