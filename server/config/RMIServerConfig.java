package spring.server.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;
import spring.server.StudentService;

@ComponentScan(basePackages = {"spring.*"})
@Configuration
public class RMIServerConfig
{
	@Bean
	public RmiServiceExporter rmiServiceExporter(StudentService studentService)
	{
		RmiServiceExporter exporter = new RmiServiceExporter();
		exporter.setService(studentService);
		exporter.setServiceInterface(StudentService.class);
		exporter.setServiceName("StudentService");

		return exporter;
	}

	/*@Bean
	public StudentService studentService()
	{
		return new StudentServiceImpl();
	}*/
}
