package training.oracle.sample.springapplication2;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import training.trg.beans.Company;
import training.trg.beans.Department;
import training.trg.beans.Employee;
import training.trg.config.AppConfig;

/**
 * Hello world!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext ctx 
        = new ClassPathXmlApplicationContext("beans.xml");

        
//        Employee e1 = ctx.getBean("emp1",Employee.class); 
        
//        System.out.println(e1);
    	
    	Company c1 = ctx.getBean("oracle",Company.class);
        
        System.out.println(c1);
        
//        AppConfig app = new AppConfig();
//        Employee e = app.getEmployee1();
//        System.out.println(e);
        
        ctx.close();
    }
}

//autowired -- byType
//autowired + qualifier -- byName
//required tag for mandatory value(used above setter) - exception  is thrown if 
// the bean doesn't have the mandatory property
//@Component and @Service and @Repository (used at class level) are all same -- makes a class into a bean
// need to add the package in beans.xml to specify the package in which to look for the component
//if no name is given to component, class name with small letters can be used to access
//@Configuration - bean generator -- bean.xml can completely be removed with the use of AppConfig i.e, Configuration annotation
//@Scope annotation is used to declare a bean as prototype
//@PostConstruct -- equivalent of init-method (LC methods)
//@PreDestroy -- equivalent of destroy-method (LC methods)
//Both LC methods require javaee dependency
//github.com/ramanakv/training


