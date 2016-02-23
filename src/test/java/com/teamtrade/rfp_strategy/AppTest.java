package com.teamtrade.rfp_strategy;

import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.teamtrade.rfp_strategy.model.Actor;
import com.teamtrade.rfp_strategy.model.Rfp;
import org.hibernate.cfg.Configuration;
/**
 * Unit test for simple App.
 */
public class AppTest {
	    
	public static void main(String[] args) {
		
	    System.out.println("Hibernate many to many (Annotation)");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		
		Session session  = sessionFactory.openSession(); 
		session.beginTransaction();
		//
		Actor a = new Actor();
		a.setId(1);
		a.setName("Quan");
		Actor b = new Actor();
		b.setId(2);
		b.setName("Khalid");		
		
		
		Rfp rfp1 = new Rfp();
	    rfp1.setId(1);
	    rfp1.setName("Ca-cib");
	    rfp1.getActors().add(a);
	    rfp1.getActors().add(b);
	   
	    a.getRfps().add(rfp1);
	    b.getRfps().add(rfp1);
		
	    session.getTransaction().commit();
		System.out.println("Done");
		}
    
}
