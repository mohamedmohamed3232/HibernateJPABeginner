package com.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateUserTable {
    public void createUserTable() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        //User user = new User();
        t.commit();
        System.out.println("Successfully created the User table");
        factory.close();
        session.close();
    }
}
