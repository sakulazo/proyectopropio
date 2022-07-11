package com.example.proyectopropio;

import com.example.proyectopropio.entities.Laptop;
import com.example.proyectopropio.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ProyectopropioApplication {

	public static void main(String[] args) {



		ApplicationContext context = SpringApplication.run(ProyectopropioApplication.class, args);
		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "Pavilion", "HP", 399.99, true);
		Laptop laptop2 = new Laptop(null, "Optiplex", "DELL", 449.99, false);
		Laptop laptop3 = new Laptop(null, "Gonico", "ACCER", 349.99, true);

		repository.save(laptop1);
		repository.save(laptop2);
		repository.save(laptop3);

		System.out.println("Numero de libros en base de datos:" + repository.findAll().size());

	}

}
