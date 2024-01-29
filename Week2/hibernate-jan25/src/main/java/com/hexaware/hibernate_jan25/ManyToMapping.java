package com.hexaware.hibernate_jan25;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate_jan25.entity.Cart;
import com.hexaware.hibernate_jan25.entity.Item;
import com.hexaware.hibernate_jan25.util.HibernateUtil;



public class ManyToMapping {

	public static void main(String[] args) {
		SessionFactory sessionFactory =HibernateUtil.getSessionFactory();

        Session session =sessionFactory.openSession();
        System.out.println(session);
        
        Transaction tn=session.beginTransaction() ;
        
        
        Cart c1=new Cart();
        c1.setCartId(1);
        c1.setCartName("William's Cart");
        Cart c2=new Cart();
        c2.setCartId(2);
        c2.setCartName("John's Cart");
        Cart c3=new Cart();
        c3.setCartId(3);
        c3.setCartName("Priya's Cart");
        Cart c4=new Cart();
        c4.setCartId(4);
        c4.setCartName("Rini's Cart");
        
        Item i1 = new Item();
        i1.setItemId(101);
        i1.setItemName("Redtape Yellow Shirt");
        i1.setQuantityAvailable(170);
        i1.addCart(c4);
        i1.addCart(c1);
        Item i2 = new Item();
        i2.setItemId(102);
        i2.setItemName(" Levis Blue Jeans");
        i2.setQuantityAvailable(400);
        i2.addCart(c4);
        i2.addCart(c1);
        i2.addCart(c2);
        Item i3 = new Item();
        i3.setItemId(103);
        i3.setItemName(" OPPO phone");
        i3.setQuantityAvailable(1000);
        i3.addCart(c4);
        i3.addCart(c1);
        i3.addCart(c2);
        i3.addCart(c3);
        
        session.persist(i1);
        session.persist(i2);
        session.persist(i3);
        
        
        tn.commit();
        sessionFactory.close();
        
        

	}

}
