package localhost.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import localhost.entity.Employee;
import localhost.jdbc.EmployeeDbManager;

public class EmployeeDAOImpl implements EmployeeDAO{

	private Connection conexao;
	PreparedStatement pstmt = null;
	
	public void inserir(Employee employee) {
		try {
			conexao = EmployeeDbManager.obterConexao();
			pstmt = conexao.prepareStatement("INSERT INTO employees (id, last_name, first_name, email, department, salary) "
											+ "VALUES (NULL, ?, ?, ?, ?, ?)");
			
			pstmt.setString(1, employee.getLastName());
			pstmt.setString(2, employee.getFirstName());
			pstmt.setString(3, employee.getEmail());
			pstmt.setString(4, employee.getDepartment());
			pstmt.setDouble(5, employee.getSalary());
			pstmt.executeUpdate();
			
		} catch (SQLException err) {
			err.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException err) {
				err.printStackTrace();
			}
		}
	}

	@Override
	public List<Employee> buscarTodos() {
		
		List<Employee> employees = new ArrayList<Employee>();
		ResultSet rs = null;
		
		try {
			conexao = EmployeeDbManager.obterConexao();
			pstmt = conexao.prepareStatement("SELECT * FROM employees");
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Employee employee = new Employee(rs.getInt("id"), rs.getString("last_name"), rs.getString("first_name"), rs.getString("email"), rs.getString("department"), rs.getDouble("salary"));
				employees.add(employee);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return employees;
	}

	@Override
	public void atualizar(Employee employee, int id) {
		try {
			conexao = EmployeeDbManager.obterConexao();
			pstmt = conexao.prepareStatement("UPDATE employees set last_name = ?, first_name = ?, "
											+ " email = ?, department = ?, salary = ? where id = ?");
			
			pstmt.setString(1, employee.getLastName());
			pstmt.setString(2, employee.getFirstName());
			pstmt.setString(3, employee.getEmail());
			pstmt.setString(4, employee.getDepartment());
			pstmt.setDouble(5, employee.getSalary());
			pstmt.setInt(6, id);
			pstmt.executeUpdate();
			
		} catch (SQLException err) {
			err.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException err) {
				err.printStackTrace();
			}
		}
	}

	@Override
	public void remover(int id) {
		try {
			conexao = EmployeeDbManager.obterConexao();
			pstmt = conexao.prepareStatement("DELETE FROM employees where id = ?");
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
			
		} catch (SQLException err) {
			err.printStackTrace();
		} finally {
			try {
				pstmt.close();
				conexao.close();
			} catch (SQLException err) {
				err.printStackTrace();
			}
		}
	}
}
