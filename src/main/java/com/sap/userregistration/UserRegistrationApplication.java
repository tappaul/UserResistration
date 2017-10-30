package com.sap.userregistration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

import com.sap.userregistration.Model.Employee;
import com.sap.userregistration.repository.EmployeeRepository;

@SpringBootApplication
@EnableResourceServer
public class UserRegistrationApplication {

	private static final Logger logger = LoggerFactory.getLogger(UserRegistrationApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(UserRegistrationApplication.class, args);
	}

	@Bean
	public CommandLineRunner setup(EmployeeRepository employeeRepository) {
		return (args) -> {
			employeeRepository.save(new Employee("Gustavo", "Ponce", true));
			employeeRepository.save(new Employee("John", "Smith", true));
			employeeRepository.save(new Employee("Jim ", "Morrison", true));
			employeeRepository.save(new Employee("David", "Gilmour", true));
			logger.info("The sample data has been generated");
		};
	}
}