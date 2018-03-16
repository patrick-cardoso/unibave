package com.unibave.microservice.aluno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AlunoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(AlunoApplication.class, args);
    }

    @Autowired
    AlunoRepository repository;

    @Override
    public void run(String... strings) throws Exception {
        repository.save(new Aluno(null, "Patrick", 12345, "patrick@gmail.com"));
        repository.save(new Aluno(null, "Fulano", 3456, "fulano@gmail.com"));
        repository.save(new Aluno(null, "Beltrano", 4554345, "beltrano@gmail.com"));
    }
}
