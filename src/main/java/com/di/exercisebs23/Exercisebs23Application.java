package com.di.exercisebs23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Exercisebs23Application {

	public static void main(String[] args) {
		SpringApplication.run(Exercisebs23Application.class, args);
	}

	@Bean(name="bean1")
	PersonaService getPersonaService1()
	{
		return new PersonaServiceImp("Luis","Madrid",22);
	}

	@Bean(name="bean2")
	PersonaService getPersonaService2()
	{
		return new PersonaServiceImp("Andrés","Valencia", 33);
	}

	@Bean(name="bean3")
	PersonaService getPersonaService3()
	{
		return new PersonaServiceImp("Lucas", "Bilbao",44);
	}

}
