/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package organisation;

import java.util.HashSet;
import java.util.Set;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.Session;

/**
 *
 * @author student
 */
public class HibernateManyToOneMain {
    public static void main(String[] args) {

		AddressTable add = new AddressTable();
		add.setAddress("Ahmedabad-1");
		
		Employee item1 = new Employee(4,"Khantil",add);
		Employee item2 = new Employee(5,"Jay",add);
		Set<Employee> itemsSet = new HashSet<Employee>();
		itemsSet.add(item1); itemsSet.add(item2);
		
		add.setEmployee(itemsSet);
		
		      SessionFactory sessionFactory = null;
		Session session = null;
		      Transaction tx = null;
		try{
		//Get Session
		sessionFactory = OrganisationHibernateUtil.getSessionFactory();
		session = sessionFactory.getCurrentSession();
		System.out.println("Session created");
		//start transaction
		tx = session.beginTransaction();
		
		//Save the Model objects
		session.save(add);
		session.save(item1);
		session.save(item2);
		
		//Commit transaction
		tx.commit();
		System.out.println("Cart ID="+add.getAddId());
		
		}catch(Exception e){
			System.out.println("Exception occured. "+e.getMessage());
			e.printStackTrace();
		}finally{
			if(!sessionFactory.isClosed()){
				System.out.println("Closing SessionFactory");
				sessionFactory.close();
			}
		}
	}
}
