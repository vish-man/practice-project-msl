package com.ecommerce;

import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.osgi.service.blueprint.reflect.Metadata;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {
	private static final org.hibernate.SessionFactory sessionFactory;

    static {
            try {
                    StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                                    .configure("hibernate.cfg.xml").build();
                    org.hibernate.boot.Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                    sessionFactory = metaData.getSessionFactoryBuilder().build();
            } catch (Throwable th) {
                    throw new ExceptionInInitializerError(th);
            }	
    }

    public static SessionFactory getSessionFactory() {
            return (SessionFactory) sessionFactory;
    }
}


