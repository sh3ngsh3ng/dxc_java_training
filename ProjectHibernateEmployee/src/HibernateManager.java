import java.util.List;

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
	
	public void deleteEmployee(int employeeID) {                                                                         
		session.beginTransaction();                                                                                 
		Employee s = (Employee) session.get(Employee.class, employeeID);                                                
		session.delete(s);                                                                                          
		session.getTransaction().commit();                                                                          
		System.out.println("Delete success...");                                                                    
	}                                                                                                               
	                                                                                                                
	                                                                                                                
	public void insertEmployee(Employee e) //inserts a row into the table                                                    
	{                                                                                                               
		session.beginTransaction();                                                                                 
		session.save(e);                                                                                            
		session.getTransaction().commit();                                                                          
		System.out.println("Insertion success...");                                                                 
	}                                                                                                               
	                                                                                                                
	public void selectEmployeeById(int employeeID) {                                                                         
		session.beginTransaction();                                                                                 
		Employee s = (Employee) session.get(Employee.class, employeeID); // need to downcast object to student          
		session.getTransaction().commit();                                                                          
		System.out.println(s);                                                                                      
	}     
	
	public void selectAllEmployee() {
		session.beginTransaction();
		List <Employee> employeeList = session.createQuery("from Employee").list();
		display(employeeList);
		session.getTransaction().commit(); // not needed as not changes made.
	}

	public void display(List<Employee> employeeList) {
		for(Employee emp: employeeList) {
			System.out.println(emp);
		}
	}
	
	public void selectEmployeeByFirstName(String name) {
		session.beginTransaction();
//		List <Employee> employeeList = session.createQuery("from Employee e where e.firstName='yong'").list();
		List <Employee> employeeList = session.createQuery("from Employee e where e.firstName=" + name).list();
		display(employeeList);
		session.getTransaction().commit();
	};
	
	public void updateFirstName(int employeeID, String firstName) {
		session.beginTransaction();
		Employee s = (Employee) session.get(Employee.class, employeeID);
		s.setFirstName(firstName);
		session.update(s);
		session.getTransaction().commit();
	}
	
	public void updateLastName(int employeeID, String lastName) {
		session.beginTransaction();
		Employee s = (Employee) session.get(Employee.class, employeeID);
		s.setLastName(lastName);
		session.update(s);
		session.getTransaction().commit();
	}
	
	
	
	
}
