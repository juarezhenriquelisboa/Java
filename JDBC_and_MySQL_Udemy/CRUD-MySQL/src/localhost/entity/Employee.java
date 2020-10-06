package localhost.entity;

import java.io.Serializable;

public class Employee implements Serializable {
	
	private static final long serialVersionUID=1L;
	private int id;
	private String lastName;
	private String firstName;
	private String email;
	private String department;
	private double salary;
	
	public Employee(int id, String lastName, String firstName, String email, String department, double salary) {
		super();
		this.id = id;
		this.lastName = lastName;
		this.firstName = firstName;
		this.email = email;
		this.department = department;
		this.salary = salary;
	}
	
	public Employee() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	};
	
	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id="+id+", last name="+lastName+", first name="+firstName
				+"email="+email+", department="+department+", salary="+salary+"]";
	}
	
}
