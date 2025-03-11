package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.practice.model.Account;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("context-->" + context);

		// singleton in constructor arg
		System.out.println("singleton");
		Account account = (Account) context.getBean("account");
		Account account1 = (Account) context.getBean("account");
		Account account2 = (Account) context.getBean("account");
		Account account3 = (Account) context.getBean("account");
		Account account4 = (Account) context.getBean("account");
		System.out.println(account.hashCode());
		System.out.println(account1.hashCode());
		System.out.println(account2.hashCode());
		System.out.println(account3.hashCode());
		System.out.println(account4.hashCode());

		// prototype example
		System.out.println("PROTO TYPE");
		Account acc = (Account) context.getBean("account1");
		Account acc1 = (Account) context.getBean("account1");
		Account acc2 = (Account) context.getBean("account1");
		Account acc3 = (Account) context.getBean("account1");
		Account acc4 = (Account) context.getBean("account1");

		System.out.println(acc.hashCode());
		System.out.println(acc1.hashCode());
		System.out.println(acc2.hashCode());
		System.out.println(acc3.hashCode());
		System.out.println(acc4.hashCode());

		System.out.println("setter injection ");

		Account acccountdetails = (Account) context.getBean("account2");
		System.out.println(acccountdetails);

	}

}
