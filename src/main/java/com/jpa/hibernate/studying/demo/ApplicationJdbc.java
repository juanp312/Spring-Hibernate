package com.jpa.hibernate.studying.demo;

import jdbc.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import java.util.Date;

//@SpringBootApplication
public class ApplicationJdbc implements CommandLineRunner {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	PersonJdbcDao dao;

	public static void main(String[] args) {
		SpringApplication.run(ApplicationJdbc.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users -> {}", dao.findall());
		logger.info("User 12001 -> {}", dao.findById(12001));
		logger.info("Deleting 13001 -> {}", dao.deleteById(13001));
		logger.info("Inserting 19001 -> {}", dao.insert(new Person(19001, "Ramon", "New York", new Date())));
		logger.info("Update 14001 -> {}", dao.update(new Person(14001, "Maria", "Madrid", new Date())));
	}
}
