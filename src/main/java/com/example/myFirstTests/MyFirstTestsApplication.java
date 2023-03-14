package com.example.myFirstTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.myFirstTests.unittesting.StringUtils;

@SpringBootApplication
public class MyFirstTestsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyFirstTestsApplication.class, args);

		System.out.println(
				" ========================> " + StringUtils.vowels("Cedric") + " =========================== ");
	}

}
