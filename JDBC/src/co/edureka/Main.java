package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Context.xml");
		AccountDAO dao=(AccountDAO)context.getBean("accountdao");
		Account acc=new Account(100,"sujna",2500);
		dao.createAccount(acc);
	}

}
