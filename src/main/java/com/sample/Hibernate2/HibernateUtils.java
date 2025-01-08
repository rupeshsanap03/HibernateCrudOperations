package com.sample.Hibernate2;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtils {
	private static SessionFactory sessionFactory;
	
	static {
		try {
			Configuration configuration = new Configuration().
					configure("hibernate.cfg.xml").
					addResource("Student.hbm.xml");
//			ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
//                  .applySettings(configuration.getProperties()).build();
			
			sessionFactory = configuration.buildSessionFactory();
			
		}catch(Throwable e) {
			e.printStackTrace();
		}
	}
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
}
