package com.varsha.springprj.hibernateinheritance.repose;

import org.springframework.data.repository.CrudRepository;

import com.varsha.springprj.hibernateinheritance.entities.Payment;

public interface PaymentRepository extends CrudRepository<Payment, Integer> {

}
