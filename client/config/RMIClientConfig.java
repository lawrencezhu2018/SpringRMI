package spring.client.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;
import spring.client.StudentController;
import spring.server.StudentService;

@Configuration
@ComponentScan(basePackageClasses = {StudentController.class})
public class RMIClientConfig
{
	@Bean(name = "studentService")
	public RmiProxyFactoryBean studentService()
	{
		RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
		rmiProxy.setServiceUrl("rmi://localhost/StudentService");
		rmiProxy.setServiceInterface(StudentService.class);

		return rmiProxy;
	}
}
