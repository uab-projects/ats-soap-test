package codes.uab.ats.soap_test;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class TestWebService {
	
	@WebMethod
	public String sayHello(String name) {
		return "Hello " + name;
	}
}
