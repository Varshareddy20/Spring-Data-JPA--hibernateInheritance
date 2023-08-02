package com.varsha.springprj.hibernateinheritance;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.varsha.springprj.hibernateinheritance.entities.Check;
import com.varsha.springprj.hibernateinheritance.entities.CreditCard;
import com.varsha.springprj.hibernateinheritance.repose.PaymentRepository;

@SpringBootTest
class HibernateinheritanceApplicationTests {

	@Autowired
	PaymentRepository repository;
	
	@Test
	public void contextLoads() {
	}
	@Test
	public void createPayment() {
		CreditCard cc = new CreditCard();
		cc.setId(100);
		cc.setAmount(500);
		cc.setCardnumber("1122334455");
		repository.save(cc);
	}
	
	@Test
	public void createCheckPayment() {
		Check ch = new Check();
		ch.setId(101);
		ch.setAmount(500);
		ch.setChecknumber("1122334455");
		repository.save(ch);
	}
		
}



