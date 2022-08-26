package com.hib.controller;

import com.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateUser {
    public void updateUser() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        User u = new User();
        u.setId(15);
        u.setEmail("mhaseeb@perscholas");
        u.setFullname("M haseeb");
        u.setPassword("123456");
        u.setSalary(5000.00);
        u.setCity("Louisville");
        u.setAge(29);
        session.merge(u);
        session.getTransaction().commit();
        session.close();
        factory.close();

    }
}
