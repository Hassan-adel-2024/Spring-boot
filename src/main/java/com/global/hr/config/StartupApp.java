package com.global.hr.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.global.hr.model.Employee;
import com.global.hr.repository.EmployeeRep;

@Component
class StartupApp implements CommandLineRunner {

    @Autowired 
    private JdbcTemplate jdbcTemplate;

    @Autowired 
    private EmployeeRep employeeRep;

    @Override
    public void run(String... args) throws Exception {
        // Drop the table if it exists
        jdbcTemplate.execute("DROP TABLE IF EXISTS employees");

        // Corrected SQL statement to create the table
        jdbcTemplate.execute("CREATE TABLE employees ("
                            + "id SERIAL PRIMARY KEY, "
                            + "name VARCHAR(255), "
                            + "salary NUMERIC(15,2)"
                            + ")");

        // Insert sample data if the table is empty
        if (employeeRep.count() == 0) {
            employeeRep.insert(new Employee(20L, "Hassan", 10000.0));
            employeeRep.insert(new Employee(30L, "Amr", 15000.0));
            employeeRep.insert(new Employee(40L, "Ahmed", 18000.0)); // Adjusted to use unique IDs
        }
    }
}
