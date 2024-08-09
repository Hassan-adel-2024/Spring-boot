package com.global.hr.repository.Imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.global.hr.mapper.EmployeeMapper;
import com.global.hr.model.Employee;
import com.global.hr.repository.EmployeeRep;

@Component
public class EmployeeJDBCRepoImp implements EmployeeRep {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int count() {
		return jdbcTemplate.queryForObject("select count(*) from employees ", Integer.class);
	}

	@Override
	public Employee findById(Long id) {
		return jdbcTemplate.queryForObject("SELECT id, name, salary FROM employees WHERE id = ?", new Object[] { id },
				new EmployeeMapper());
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT id, name, salary FROM employees", new EmployeeMapper());
	}

	@Override
	public int insert(Employee employee) {
		return jdbcTemplate.update("insert into employees (id,name ,salary) values(?,?,?)",
				new Object[] { employee.getId(), employee.getName(), employee.getSalary() });
	}

	@Override
	public int update(Employee employee) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("update employees set name=?,salary=?",
				new Object[] { employee.getId(), employee.getName(), employee.getSalary() });
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("delete from employees where id = ?",new Object[] {id});
	}

}
