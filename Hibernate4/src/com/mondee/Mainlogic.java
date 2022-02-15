 package com.jarvis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration; 

public class Mainlogic {

	
	public static void main(String[] args) {

		Configuration cf = new Configuration();
		cf.configure("hibernet.xml");
		SessionFactory sf = cf.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		student srujan = new student();
		srujan.setSid(1023);
		srujan.setSname(" Dhoni ");
	        srujan.setSmarks(10);
		se.save(srujan);
		tx.commit();
		se.close();
		}	
	}
