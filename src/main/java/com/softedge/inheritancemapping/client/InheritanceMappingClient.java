package com.softedge.inheritancemapping.client;

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.softedge.inheritancemapping.model.CardPayment;
import com.softedge.inheritancemapping.model.ChequePayment;
import com.softedge.inheritancemapping.model.Payment;
import com.softedge.inheritancemapping.util.SessionFactoryProvider;

public class InheritanceMappingClient {

	public static void main(String[] args) {
		SessionFactory factory = SessionFactoryProvider.getSessionFactory();
		Session session = factory.openSession();
		
//		Payment payment = new ChequePayment(101, LocalDate.now(), "Vodafone Bill", 240.0, 12456, "Order");

		Payment payment = new CardPayment(101, LocalDate.now(), "Internet Bill", 240.0, 1234567812345678l, "VISA", 12, 2020);
		Transaction tx = session.beginTransaction();
		
		session.save(payment);
		tx.commit();
		session.close();
		factory.close();
	}
}
