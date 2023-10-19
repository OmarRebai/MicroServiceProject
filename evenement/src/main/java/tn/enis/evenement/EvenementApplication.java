package tn.enis.evenement;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tn.enis.evenement.services.EvenementService;

@SpringBootApplication
@EntityScan(basePackages = "tn.enis.evenement.entities")
@AllArgsConstructor
@EnableDiscoveryClient
public class EvenementApplication implements CommandLineRunner {
	EvenementService memberService;
	public static void main(String[] args) {
		SpringApplication.run(EvenementApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {


	}
}
