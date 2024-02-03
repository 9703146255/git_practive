package in.thiru.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
@RequestMapping("/num1")
public class DataRestController {

	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataFromDB",name = "thirumala")
	public String getDataFromRedis() {
		System.out.println("getDataFromRedis");
			int i = 10 / 0;

 
 		System.out.println("getDataFromRedis1");
 		System.out.println("getDataFromRedis1");
		 System.out.println("getDataFromRedis1");
		 System.out.println("getDataFromRedis1");
		 System.out.println("getDataFromRedis1");
		 System.out.println("getDataFromRedis1");
		 System.out.println("getDataFromRedis1");
 









		
	
		return "data from redis cache";
	}

	public String getDataFromDB(Throwable th) {
		
		System.out.println("getDataFromDB");
		return "data from db";
	}

}
