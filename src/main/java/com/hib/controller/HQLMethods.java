package com.hib.controller;

import com.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class HQLMethods {

public void findUser(){
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();

    String hql = "FROM User";
    Query query = session.createQuery(hql);
    List<User> results = query.getResultList();
    for (User u : results) {
        System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());
    }
    session.close();
    factory.close();
}

public void findUserSelect() {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();
    /* ------------  Example of HQL to get all the records------- */
    String hql = "SELECT u FROM User u";
    Query query = session.createQuery(hql);
    List<User> list  =  query.getResultList();

    for (User u : list) {
        System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());

    }
    session.close();
    factory.close();
}

public void getRecordbyId() {
    SessionFactory factory = new Configuration().configure().buildSessionFactory();
    Session session = factory.openSession();
    String hql = "SELECT U FROM User U WHERE U.id < 20 ORDER BY U.id DESC";
    Query query = session.createQuery(hql);
    List<User> list  =  query.getResultList();
    for (User u : list) {
        System.out.println("User Id: " +u.getId() + "|" + " Full name:" + u.getFullname() +"|"+ "Email: " + u.getEmail() +"|"+ "password" + u.getPassword());
    }

}
    public void getmaxSalary() {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
        String hql = "SELECT Max(U.salary) FROM User U";
        Query query = session.createQuery(hql);
        double maxSalary = (Double) query.getSingleResult();
        System.out.println("Maximum Price:" + maxSalary);

    }
    }
