package coms.DemoRestServiceApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoRestServiceAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoRestServiceAppApplication.class, args);
		System.out.println("Service Started...");
	}
}
