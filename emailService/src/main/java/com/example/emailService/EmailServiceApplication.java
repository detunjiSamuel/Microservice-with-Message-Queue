package com.example.emailService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmailServiceApplication {

	@Value("${spring.mail.username}")
	private String mailUsername;

	@Value("${spring.mail.password}")
	private String mailPassword;

	@Value("${spring.mail.host}")
	private String mailHost;

	@Value("#{T(java.lang.Integer).parseInt('${spring.mail.port}')}")
	private Integer mailPort;



	public static void main(String[] args) {
		SpringApplication.run(EmailServiceApplication.class, args);
	}



	

}
