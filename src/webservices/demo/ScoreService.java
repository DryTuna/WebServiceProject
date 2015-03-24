package webservices.demo;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(name = "ScoreService", serviceName = "ScoreWebService")
public class ScoreService {

	@WebMethod()
	public String sayHello(String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
}
