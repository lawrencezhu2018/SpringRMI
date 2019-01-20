package spring.server;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService
{
	private Map<String, Double> scoreMap = new HashMap<>();

	{
		scoreMap.put("zz", 98.5);
		scoreMap.put("cc", 99.9);
	}

	@Override
	public double findScore(String name)
	{
		Double score = scoreMap.get(name);

		if (score == null)
		{
			return 0;
		}
		else
		{
			return score;
		}
	}
}
