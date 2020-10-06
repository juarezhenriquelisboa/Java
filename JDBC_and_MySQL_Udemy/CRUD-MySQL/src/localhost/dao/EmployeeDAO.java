package localhost.dao;

import java.util.List;

import localhost.entity.Employee;;

public interface EmployeeDAO {

	void inserir(Employee employee);
	
	List<Employee> buscarTodos();
	
	void atualizar(Employee employee, int id);
	
	void remover(int id);
}
