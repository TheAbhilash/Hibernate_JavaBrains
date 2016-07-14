package com.bipu.hibernte;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bipu.dto.UserDetails;
/* Service class */
public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UserDetails userDetails = new UserDetails();
		userDetails.setUserId(3);
		userDetails.setUserName("Third User");
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(userDetails);
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}

}