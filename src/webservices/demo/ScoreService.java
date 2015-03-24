package webservices.demo;

import java.util.HashMap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "ScoreService", serviceName = "ScoreWebService")
public class ScoreService {
	private HashMap<String, Double> scores = new HashMap<String, Double>();
	
	public ScoreService() {
		scores.put("John", 90.5);
		scores.put("Michael", 100.0);
		scores.put("Michelle", 98.5);
	}
	
	@WebMethod()
	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@WebMethod(operationName = "findScore")
	public double findScore(String name) {
		Double d = scores.get(name);
		if (d == null) {
			System.out.println("Student " + name
					+ " is not found ");
			return -1;
		}
		else {
			System.out.println("Student " + name
					+ "\'s score is "
					+ d.doubleValue());
			return d.doubleValue();
		}
	}
}
