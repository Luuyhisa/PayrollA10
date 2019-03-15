package za.ac.cput.ProjectSpring.house;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HouseApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext run = SpringApplication.run(HouseApplication.class, args);
	}

}
