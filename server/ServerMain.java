package spring.server;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.server.config.RMIServerConfig;

public class ServerMain
{
	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(RMIServerConfig.class);
		System.out.println("Student Servi" +
				"ce is published ...");
	}
}
