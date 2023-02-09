package com.example.myfirstspringproject;

import com.example.myfirstspringproject.business.PaymentCalculator;
import lombok.val;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class MyfirstspringprojectApplication {

	public static void main(String[] args) {
		//SpringApplication.run(MyfirstspringprojectApplication.class, args);

		PaymentCalculator calculator = new PaymentCalculator(2000000, 10);
		double payment = calculator.calculatePayment();
		System.out.println("The total loan amount you will be paying in 10 years is: " + payment);

	}

}
