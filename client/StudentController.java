package spring.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import spring.server.StudentService;

@Component
public class StudentController
{
	@Autowired
	private StudentService studentService;

	public double findScore(String name)
	{
		return studentService.findScore(name);
	}
}
