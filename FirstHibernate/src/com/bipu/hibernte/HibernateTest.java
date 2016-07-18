package com.bipu.hibernte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bipu.dto.Address;
import com.bipu.dto.UserDetails;
/* Service class */
public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails userDetails = new UserDetails();
		userDetails.setUserName("First User");
		
		Address addr = new Address();
		addr.setStreet("street");
		addr.setCity("Bangalore");
		addr.setState("Karnataka");
		addr.setPin("560068");
		
		Address addr2 = new Address();
		addr.setStreet("street2");
		addr.setCity("Bangalore2");
		addr.setState("Karnataka2");
		addr.setPin("560068-2");
		
		userDetails.setHomeAddress(addr);
		userDetails.setOfficeAddress(addr2);
		
		//only one session factory per application
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();
	}

}
