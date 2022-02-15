package com.jarvis;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataBuilder;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;


public class Mainlogic {

	
   public static void main(String[] args) {
       StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernet.xml").build();
       Metadata me=new org.hibernate.boot.MetadataSources(ssr).getMetadataBuilder().build();
		SessionFactory sf = me.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		student srujan= new student();
		srujan.setSid(1206);
		srujan.setSname("bhavani");
		srujan.setSmarks(700);
		
		se.save(srujan);
		
		
		tx.commit();
		se.close();
		
		
		
		
	}

}
