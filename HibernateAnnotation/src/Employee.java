import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_ANNO")
public class Employee {
	@Id
	@Column(name="ID")
	private int employeeID;
	
	@Column(name="FIRST_NAME")
	private String employeeFirstName;
	
	@Column(name="LAST_NAME")
	private String employeeLastName; // if column name and variable name is the same, no need to specify column name. Just @Column is enough.
	
	@Column(name="EMAIL")
	private String employeeEmail;
	public Employee() {}
	public Employee(String employeeFirstName, String employeeLastName, String employeeEmail) {
		super();
		this.employeeFirstName = employeeFirstName;
		this.employeeLastName = employeeLastName;
		this.employeeEmail = employeeEmail;
	}
	public int getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}
	public String getEmployeeFirstName() {
		return employeeFirstName;
	}
	public void setEmployeeFirstName(String employeeFirstName) {
		this.employeeFirstName = employeeFirstName;
	}
	public String getEmployeeLastName() {
		return employeeLastName;
	}
	public void setEmployeeLastName(String employeeLastName) {
		this.employeeLastName = employeeLastName;
	}
	public String getEmployeeEmail() {
		return employeeEmail;
	}
	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = employeeEmail;
	}
	@Override
	public String toString() {
		return "Employee [employeeID=" + employeeID + ", employeeFirstName=" + employeeFirstName + ", employeeLastName="
				+ employeeLastName + ", employeeEmail=" + employeeEmail + "]";
	}
	
	
	
	
}
