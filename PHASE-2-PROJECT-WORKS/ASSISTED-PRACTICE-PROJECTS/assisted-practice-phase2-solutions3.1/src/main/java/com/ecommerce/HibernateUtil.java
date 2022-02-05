package com.ecommerce;

import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.mysql.cj.xdevapi.SessionFactory;

public class HibernateUtil {

	private static final SessionFactory sessionFactory;

    static {
            try {
                    StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
                                    .configure("hibernate.cfg.xml").build();
                    Metadata metaData = new MetadataSources(standardRegistry).getMetadataBuilder().build();
                    sessionFactory = (SessionFactory) metaData.getSessionFactoryBuilder().build();
            } catch (Throwable th) {
                    throw new ExceptionInInitializerError(th);
            }
    }

    public static <sessionFactory> SessionFactory getSessionFactory() {
            return sessionFactory;
    }
}
