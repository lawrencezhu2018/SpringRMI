package spring.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import spring.client.config.RMIClientConfig;
import spring.server.StudentService;

public class ClientMain
{

	public static void main(String[] args)
	{
		ApplicationContext context = new AnnotationConfigApplicationContext(RMIClientConfig.class);
		StudentService service = (StudentService) context.getBean("studentService");
		StudentController controller = context.getBean(StudentController.class);

		System.out.println(controller.findScore("cc"));
		System.out.println(service.findScore("cc"));
	}
}
