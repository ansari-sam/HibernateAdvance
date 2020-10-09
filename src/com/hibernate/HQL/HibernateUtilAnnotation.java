package com.hibernate.HQL;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class HibernateUtilAnnotation {
	
static SessionFactory factory;
	
	static {
		Configuration cfg=new AnnotationConfiguration();
		cfg.configure("com/hibernate/HQL/hibernate.cfg.xml");
		factory=cfg.buildSessionFactory();
	}
	public static SessionFactory getSessionFactory() {
		return factory;
	}
}
