package jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class ApplicationJpa implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJpaRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationJpa.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("User 12001 -> {}", repository.findById(12001));
		logger.info("Inserting 2005 -> {}", repository.insert(new PersonJpa(700, "Lucas", "Cali", new Date())));
		logger.info("Update 14001 -> {}", repository.update(new PersonJpa(14001, "Maria", "Madrid", new Date())));
		repository.deleteById(13001);
		logger.info("All users -> {}", repository.findAll());
//		logger.info("All users -> {}", repository.findall());
//		logger.info("Deleting 13001 -> {}", repository.deleteById(13001));

	}
}
