
public class EmployeeApp {
	public static void main(String[] args) {
		HibernateManager hm = new HibernateManager();
		hm.connect();
		String query = "'yong'";
		hm.selectEmployeeByFirstName(query);
		hm.selectEmployeeByFirstName("'Yong Yong'");
		
	}
}
