import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

public class HibernateManager {
	Session session;                                                                                                
	public void connect()                                                                                           
	{                                                                                                               
	//Connection code                                                                                               
		// these 5 lines would remain same and is used for getting connection                                       
	   Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg          
	   ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());  
	   SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       	
	      		                                                                                                    
	    session =sessionFactory.openSession();	                                                                    
	    System.out.println("Connected to Pf....");                                                                  
	}                                                                                                               
	                                                                                                                
	public void deleteData(int studentID) {                                                                         
		session.beginTransaction();                                                                                 
		Student s = (Student) session.get(Student.class, studentID);                                                
		session.delete(s);                                                                                          
		session.getTransaction().commit();                                                                          
		System.out.println("Delete success...");                                                                    
	}                                                                                                               
	                                                                                                                
	                                                                                                                
	public void insert(Student s) //inserts a row into the table                                                    
	{                                                                                                               
		session.beginTransaction();                                                                                 
		session.save(s);                                                                                            
		session.getTransaction().commit();                                                                          
		System.out.println("Insertion success...");                                                                 
	}                                                                                                               
	                                                                                                                
	public void selectData(int studentID) {                                                                         
		session.beginTransaction();                                                                                 
		Student s = (Student) session.get(Student.class, studentID); // need to downcast object to student          
		session.getTransaction().commit();                                                                          
		System.out.println(s);                                                                                      
	}     
	
	public void updateData(int studentID, String name) {
		session.beginTransaction();
		Student s = (Student) session.get(Student.class, studentID);
		s.setName(name);
		session.update(s);
		session.getTransaction().commit();
	}
	                                                                                                                
}
