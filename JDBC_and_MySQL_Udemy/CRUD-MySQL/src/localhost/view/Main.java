package localhost.view;

import java.util.List;

import localhost.dao.EmployeeDAO;
import localhost.dao.EmployeeDAOImpl;
import localhost.entity.Employee;

public class Main {

	public static void main(String[] args) {
		try {
			
			EmployeeDAO dao = new EmployeeDAOImpl();
			
			Employee employee = new Employee();
			
			employee.setLastName("Lisboa");
			employee.setFirstName("Juarez");
			employee.setDepartment("IT");
			employee.setEmail("juarez@lisboa");
			employee.setSalary(9000.0);
			
			dao.remover(13);
			
			List<Employee> employees = dao.buscarTodos();
			
			for(Employee employ: employees) {
				System.out.println(employ.toString());
			}
			
		} catch (Exception e) {
			System.err.println("Erro!");
			e.printStackTrace();
		}

	}

}
