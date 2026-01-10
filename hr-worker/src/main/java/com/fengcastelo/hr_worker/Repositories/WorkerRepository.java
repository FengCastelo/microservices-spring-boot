package com.fengcastelo.hr_worker.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fengcastelo.hr_worker.Entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}