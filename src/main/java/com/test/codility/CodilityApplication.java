package com.test.codility;

import com.test.codility.util.EnvReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class CodilityApplication {

//	@Value("${test}")
//	private String testValue;

	@Autowired
	private Environment environment;

	public static void main(String[] args) {
		SpringApplication.run(CodilityApplication.class, args);

	}

	@PostConstruct
	public void showData(){
		System.out.println("KESHAER>>>"+ environment.getProperty("test") +"..."+ environment.getProperty("keshar"));
	}

}
