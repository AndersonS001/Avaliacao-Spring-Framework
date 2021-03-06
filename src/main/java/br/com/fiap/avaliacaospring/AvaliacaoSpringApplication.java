package br.com.fiap.avaliacaospring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class AvaliacaoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(AvaliacaoSpringApplication.class, args);
	}

}
