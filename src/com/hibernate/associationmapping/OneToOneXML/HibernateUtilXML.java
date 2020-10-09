package com.hibernate.associationmapping.OneToOneXML;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtilXML {
	
	static SessionFactory factory;
	
	static {
		Configuration cfg=new Configuration();
		cfg.configure("com/hibernate/associationmapping/OneToOneXML/hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
