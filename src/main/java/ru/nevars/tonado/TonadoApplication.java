package ru.nevars.tonado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TonadoApplication {

	public static String REST_VERSION = "v1";

	public static void main(String[] args) {
		SpringApplication.run(TonadoApplication.class, args);
	}
}
