package training.trg.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import training.trg.beans.Department;
import training.trg.beans.Employee;

//@Configuration
public class AppConfig {
	
	@Bean("emp3")
	@Scope("prototype")
	public Employee getEmployee1() {
		return new Employee(11,"Alex",65000);
	}
	
	@Bean("emp4")
	public Employee getEmployee2() {
		return new Employee(22,"Luke",21000);
	}
	
	@Bean("dept3")
	public Department getDept1() {
		return new Department(11,"Sales");
	}
	
	@Bean("dept4")
	public Department getDept2() {
		return new Department(22,"HR");
	}
}
