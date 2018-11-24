package com.softedge.inheritancemapping.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.softedge.inheritancemapping.model.CardPayment;
import com.softedge.inheritancemapping.model.ChequePayment;
import com.softedge.inheritancemapping.model.Payment;

public class SessionFactoryProvider {

	
	private static SessionFactory sessionFactory;
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	static {
		StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure().build();
		sessionFactory = new MetadataSources(registry)
				.addAnnotatedClass(Payment.class)
				.addAnnotatedClass(ChequePayment.class)
				.addAnnotatedClass(CardPayment.class)
				.buildMetadata().buildSessionFactory();
	}
}
