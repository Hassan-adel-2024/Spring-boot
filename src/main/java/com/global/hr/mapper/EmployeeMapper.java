package com.global.hr.mapper;

import org.springframework.jdbc.core.RowMapper; // Import the Spring RowMapper
import java.sql.ResultSet;
import java.sql.SQLException;
import com.global.hr.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {
    @Override
    public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Employee(
            rs.getLong("id"),
            rs.getString("name"),
            rs.getDouble("salary")
        );
        
        
    }
}
