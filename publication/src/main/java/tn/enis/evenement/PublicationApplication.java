package tn.enis.evenement;

import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tn.enis.evenement.entities.Publication;
import tn.enis.evenement.services.PublicationService;

import java.util.Date;

@SpringBootApplication
@EntityScan(basePackages = "tn.enis.evenement.entities")
@AllArgsConstructor
@EnableDiscoveryClient
public class PublicationApplication implements CommandLineRunner {
	PublicationService evenementService;
	public static void main(String[] args) {
		SpringApplication.run(PublicationApplication.class, args);
	}

	@Override
	public void run (String... args) throws Exception {
		Publication publication = Publication.builder()
				.type("fgh")
				.sourcePdf("fghj")
				.lien("ghj")
				.date(new Date())
				.build();
		evenementService.addPublication(publication);
		Publication publication2 = Publication.builder()
				.type("dfdg")
				.sourcePdf("dsfdgfh")
				.lien("dsfd")
				.date(new Date())
				.build();
		evenementService.addPublication(publication2);

	}
}
