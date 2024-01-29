package com.hexaware.hibernate_jan25;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate_jan25.entity.Answer;
import com.hexaware.hibernate_jan25.entity.Question;
import com.hexaware.hibernate_jan25.util.HibernateUtil;



/**
 * Hello world!
 *
 */
public class OneToOneMapping 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        SessionFactory sessionFactory =HibernateUtil.getSessionFactory();
        System.out.println(sessionFactory);
        Session session =sessionFactory.openSession();
        System.out.println(session); 
        Transaction tn =session.beginTransaction();
//        Answer ans = new Answer(101,"Oblate Spheroid");
//        Question ques= new Question(1,"What is Shape of Earth?",ans);
//        session.persist(ques);
        
        Question ques = new Question(5,"What is shape of egg?");
        Answer ans =new Answer();
        ans.setAnsNumber(103);
        ans.setAnswer("Blue");
        ans.setQuestion(ques);
        session.persist(ques);
        tn.commit();
   
        
    }
}
