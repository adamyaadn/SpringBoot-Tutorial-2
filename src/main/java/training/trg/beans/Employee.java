package training.trg.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Required;

public class Employee {
	private int empId;
	
	private String name;
	
	public Employee() {
		super();
	}
	public Employee(int empId, String name, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}

	@Autowired @Qualifier("dept2")
	private Department dept;
	private int salary;
	
	List<String> technologies;
	
	@Autowired
	Company company;
	
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public List<String> getTechnologies() {
		return technologies;
	}
	public void setTechnologies(List<String> technologies) {
		this.technologies = technologies;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", dept=" + dept + ", salary=" + salary
				+ ", technologies=" + technologies + ", company=" + company + "]";
	}
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void beanCreate() {
		System.out.println("Bean " + empId + " created");
	}
	
	public void beanDestroy() {
		System.out.println("Bean " + empId + " destroyed");
	}
}
