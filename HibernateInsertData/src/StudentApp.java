public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.selectData(1);
	}

}
