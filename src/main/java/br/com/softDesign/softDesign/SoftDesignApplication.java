package br.com.softDesign.softDesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
public class SoftDesignApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftDesignApplication.class, args);
	}
	
    @Bean
    public WebClient webClient() {
        return WebClient.create();
    }
}
