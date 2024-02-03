package in.thiru;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
public class Application implements CommandlineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

         public void run()
	{
	}


}
