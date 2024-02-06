package training.trg.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//@Component("oracle")
@Component
@Scope("prototype")
public class Company {
	
	private String name="Oracle";
	
	private String location="Bangalore";

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + "]";
	}
	
	@PostConstruct
	public void createBeanMethod() {
		System.out.println("Company bean created");
	}
	
	@PreDestroy
	public void destroyBeanMethod() {
		System.out.println("Company bean destroyed");
	}
	
}
