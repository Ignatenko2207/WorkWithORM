package info.sjd;

import static org.junit.Assert.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;

import info.sjd.util.ConnectionFactory;

public class ConnectionFactoryTest {

	@Test
	public void testGetSessionFactory() {
		SessionFactory sessionFactory = ConnectionFactory.getSessionFactory();
		
		assertNotNull(sessionFactory);
		
		Session session = sessionFactory.openSession();
		
		assertNotNull(session);
		
		session.close();
	}

}
