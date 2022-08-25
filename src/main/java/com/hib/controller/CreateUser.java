package com.hib.controller;

import com.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateUser {
    public void createUser() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
       Session session = factory.openSession();
        Transaction t = session.beginTransaction();
        User user3 = new User();
        user3.setEmail("James@gmail.com");
        user3.setFullname("James Santana");
        user3.setPassword("James123");
        user3.setSalary(2060.69);
        user3.setAge(25);
        user3.setCity("Dallas");

        User user1 = new User();
        user1.setEmail("Morgan@yahoo.com");
        user1.setFullname("Morgan Lewis");
        user1.setPassword("xyz321");
        user1.setSalary(2000.77);
        user1.setAge(24);
        user1.setCity("Savannah");

        User user2 = new User();
        user2.setEmail("haseeb@gmail.com");
        user2.setFullname("Moh Haseeb");
        user2.setPassword("has123");
        user2.setSalary(2000.69);
        user2.setAge(20);
        user2.setCity("New York");
        //Passing values and data by using a constructor
        User user4 = new User("Anna Jones", "anna@yahoo.com", "ghi678", 18, 500.00, "New York");
        Integer userid = null;
        session.save(user1);
        session.save(user2);
        session.save(user3);
        session.save(user4);
        t.commit();
        System.out.println("Successfully saved");
        factory.close();
        session.close();
    }
}
