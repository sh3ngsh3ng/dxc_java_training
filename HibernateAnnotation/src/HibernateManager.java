import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class HibernateManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory(); //connects to cfg          
		Session session = factory.getCurrentSession();
		System.out.println("Connection established");
		
		// CREATE
//		Employee e = new Employee("Sheng", "Lim", "shenglim.com");
//		session.beginTransaction();
//		session.save(e);
//		session.getTransaction().commit();
//		System.out.println("Employee inserted success");

		
		
		
		
		// READ
//		session.beginTransaction();
//		List<Employee> employeeList = session.createQuery("from Employee").list();
//		System.out.println("Here is the list of all the employees");
//		System.out.println("Employee details using forEach loop");
//		for (Employee employee: employeeList) {
//			System.out.println(employee);
//		}
//		System.out.println("Employee details using Iterator");
//		Iterator itr = employeeList.iterator();
//		while(itr.hasNext()) {
//			System.out.println(itr.next());
//		}
//		session.getTransaction().commit();
//		System.out.println("Read successful");
			
		
		
		
		
		
		
		
		// UPDATE
//		session.beginTransaction();
//		Employee s = (Employee) session.get(Employee.class, 1);
//		s.setEmployeeEmail("update works");
//		session.update(s);
//		session.getTransaction().commit();
//		System.out.println("Update successful");
		
		
		
		
		
		// DELETE
//		session.beginTransaction();
//		Employee s = (Employee) session.get(Employee.class, 2);
//		session.delete(s);
//		session.getTransaction().commit();
//		System.out.println("Delete successful");
		
		
		
	}

}
