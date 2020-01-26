package com.assignment.main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.assignment.model.Company;
import com.assignment.model.Directors;
import com.assignment.model.Employee;
import com.assignment.model.HumanResource;
import com.assignment.model.Manager;

public class MainClass {
	static SessionFactory factory = new Configuration().configure().buildSessionFactory();  
	public static void main(String[] args) {
	  MainClass main = new MainClass();
	  main.saveData(1, "Abhigyan", "Nayak");
	  main.retriveData();
	  main.deleteData(1);
	  main.updateData(1, "vaubhav");
	  
	  factory.close() ;		
    }
	  
	public void saveData(int id, String firstName, String lastName) {
		Session session = factory.openSession();
        Transaction transaction = null;
 
        try {
            transaction = session.beginTransaction();
            Employee emp= new Employee();
            emp.setId(1);
  		  	emp.setFirstName("Abhigyan");
  		  	emp.setLastName("Nayak");

            Manager manager = new Manager();
			manager.setManagerName("Parvesh khan");

			Company firm = new Company();
			firm.setCompanyId(1);
			firm.setCompanyName("ABC");
			
			Company firm0 = new Company();
			firm.setCompanyId(2);
			firm.setCompanyName("PQR");			
			
			Collection<Company> firms = new ArrayList<>();
			firms.add(firm);
			firms.add(firm0);			

			Directors director = new Directors();
			director.setDirectorId(3);;
			director.setDirectorName("Bismillah Sharma xD");
			
			HumanResource hr = new HumanResource();
			hr.setHrId(4);
			hr.setHrName("Sharma Abhishek");
			
            session.save(emp);
            session.save(firms);
            session.save(director);
            session.save(firms);
            
            transaction.commit();
            System.out.println("Records inserted sucessessfully");
        }
        catch (Exception e) {
            System.out.println(e);
        }
        finally {
            session.close();
        } 
    }
 
    public void retriveData() { 
    	Session session = factory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            List employee = session.createQuery("from Employee").list();
 
            for (Iterator iterator = employee.iterator(); iterator.hasNext();) {
                Employee employee1 = (Employee) iterator.next();
                System.out.println(employee1.getFirstName() + "  "
                		+ employee1.getLastName() + "  " );
            }
            transaction.commit(); 
        }
        catch (Exception e) {	 
        	System.out.println(e);
        }
        finally {	 
            session.close();
        }
    }
 
    public void deleteData(int id) { 
    	Session session = factory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String queryString = "from Employee where id = :id";
            Query query = session.createQuery(queryString);
            query.setParameter("id", id);
            Employee employee = (Employee)query.getResultList();
            session.delete(employee);
            System.out.println("records deleted!");
 
        }
        catch (Exception e) {	 
            System.out.println(e);	 
        }
        finally {	 
            session.close();	 
        }
    }
 
    public void updateData(int id, String firstName) {
 
    	Session session = factory.openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String queryString = "from Employee where id = :id";
            Query query = session.createQuery(queryString);
            query.setParameter("id", id);
            Employee employee = (Employee) query.getResultList();
            employee.setFirstName(firstName);
            session.update(employee);
            System.out.println("Records updated!");
        }
        catch (Exception e) {	 
        	System.out.println(e);
        }
        finally {	 
            session.close();
 
        }
    }
}
