package klhlab2.lab2hibirnate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	
        product pr = new product();
        
        SessionFactory factory = new Configuration()
                .configure()
                .addAnnotatedClass(product.class)
                .buildSessionFactory();
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        pr.setName("Car");
        pr.setDescription("Blue Car");
        pr.setPrice(570000.25);
        pr.setQuantity(1);
        session.persist(pr);
        tx.commit();
        
        session.close();
        factory.close();
    }
}
 