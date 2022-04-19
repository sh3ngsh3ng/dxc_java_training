public class StudentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.insert(new Student(1, "Yong"));
//		hm.deleteData(1);
		hm.updateData(1, "Yong2");
	}

}
