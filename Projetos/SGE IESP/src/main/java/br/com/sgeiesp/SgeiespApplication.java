package br.com.sgeiesp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.sgeiesp.controllers"})
public class SgeiespApplication {

	public static void main(String[] args) {
		SpringApplication.run(SgeiespApplication.class, args);
	}

}
