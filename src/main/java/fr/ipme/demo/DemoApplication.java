package fr.acl.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

import fr.acl.demo.models.Product;
import fr.acl.demo.repositories.ProductRepository;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Autowired
	private ProductRepository repository;

	@EventListener(ApplicationReadyEvent.class)
	private void createDefaultData(){
		repository.save(new Product());
	}

}
