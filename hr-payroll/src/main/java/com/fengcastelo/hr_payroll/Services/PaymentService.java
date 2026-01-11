package com.fengcastelo.hr_payroll.Services;

import com.fengcastelo.hr_payroll.Entities.Payment;
import com.fengcastelo.hr_payroll.Entities.Worker;
import com.fengcastelo.hr_payroll.feignclients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@Service
public class PaymentService {

    @Autowired
    private WorkerFeignClient feignClient;

    public Payment getPayment(Long workerId, int days) {

        Worker worker = feignClient.findById(workerId).getBody();
        return new Payment(worker.getName(), worker.getDailyIncome(), days);
    }
}