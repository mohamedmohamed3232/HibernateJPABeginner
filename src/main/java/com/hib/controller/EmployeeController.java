package com.hib.controller;

import com.hib.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import javax.persistence.TypedQuery;
import java.util.List;

public class EmployeeController {
    public void createEmployeeTable()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();

        Transaction t = session.beginTransaction();
        Employee uone = new Employee();
        t.commit();
        System.out.println("successfully saved");
        factory.close();
        session.close();
    }

    public void findEmployeeById()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
//------------  Hibernate Named Query   -------------
        TypedQuery query = session.getNamedQuery("get_Emp_name_by_id");
        query.setParameter("id",3);
        List<Object[]> emName=  query.getResultList();
        for(Object[] o: emName)
        {
            System.out.println("Employee name: " +o[0] +" | Employee Salary: "+ o[1] +" | Emp Job Title: "+ o[2]);
        }
        factory.close();
        session.close();
    }

    public void ShowOfficeCodes_AsDepartment()
    {
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session = factory.openSession();
//------------  Hibernate Named Query   -------------
        TypedQuery query = session.getNamedQuery("empDepAlias");
        List<Object[]> list  =  query.getResultList();
        for(Object[] e: list )
        {
            System.out.println("OfficeCode: " + e[1] + " | Dep Name: " +e[3]+ " | Employee Name: " + e[2]);
        }
        factory.close();
        session.close();
    }
}




