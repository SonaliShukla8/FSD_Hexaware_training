package com.hexaware.hibernate_jan25;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate_jan25.entity.Manufactures;
import com.hexaware.hibernate_jan25.entity.Model;
import com.hexaware.hibernate_jan25.util.HibernateUtil;

public class OneToManyMapping {

	public static void main(String[] args) {
		SessionFactory sessionFactory =HibernateUtil.getSessionFactory();

        Session session =sessionFactory.openSession();
        System.out.println(session);
        
        Transaction tn=session.beginTransaction() ;
      
        Model model1=new Model(1,"AYZ");
        Model model2=new Model(2,"ZET");
        Model model3=new Model(3,"bbb");
        
        Manufactures m1= new Manufactures();
        m1.setId(101);
        m1.setManufactures_name("Shanu");
        m1.addModel(model3);
        m1.addModel(model2);
        Manufactures m2= new Manufactures();
        m2.setId(102);
        m2.setManufactures_name("Sheetal");
        m2.addModel(model1);
        
        session.persist(m1);
        session.persist(m2);
        tn.commit();
        

	}

}
