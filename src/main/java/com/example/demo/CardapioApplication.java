package com.example.demo;

import com.example.demo.model.Prato;
import com.example.demo.repository.PratoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CardapioApplication {

    public static void main(String[] args) {
        SpringApplication.run(CardapioApplication.class, args);
    }

    @Bean
    public CommandLineRunner demo(PratoRepository pratoRepository) {
        return args -> {
            Prato prato1 = new Prato();
            prato1.setNome("Churrasco");
            prato1.setDescricao("Churrasco no ponto!");
            prato1.setPreco(59.99);
            prato1.setFotoUrl("http://localhost:8082/images/churrasco.jpg"); // Caminho relativo ao classpath
    
            Prato prato2 = new Prato();
            prato2.setNome("Batata frita");
            prato2.setDescricao("A batata mais crocante da cidade!");
            prato2.setPreco(29.99);
            prato2.setFotoUrl("http://localhost:8082/images/batata.jpg");
    
            Prato prato3 = new Prato();
            prato3.setNome("Hambúguer artesanal");
            prato3.setDescricao("Hambúguer artesanal? temos também!");
            prato3.setPreco(19.99);
            prato3.setFotoUrl("http://localhost:8082/images/lanche.jpg");
    
            Prato prato4 = new Prato();
            prato4.setNome("Pastel");
            prato4.setDescricao("Melhor que o de Belém");
            prato4.setPreco(15.99);
            prato4.setFotoUrl("http://localhost:8082/images/pastel.jpg");
    
            Prato prato5 = new Prato();
            prato5.setNome("Pizza");
            prato5.setDescricao("Se você é do team pizza, temos opções também!");
            prato5.setPreco(49.99);
            prato5.setFotoUrl("http://localhost:8082/images/pizza.jpg");
    
            Prato prato6 = new Prato();
            prato6.setNome("Sushi");
            prato6.setDescricao("Se mesmo com churrasco, você ainda prefira Sushi, temos também!");
            prato6.setPreco(69.99);
            prato6.setFotoUrl("http://localhost:8082/images/sushi.jpg");

            pratoRepository.save(prato1);
            pratoRepository.save(prato2);
            pratoRepository.save(prato3);
            pratoRepository.save(prato4);
            pratoRepository.save(prato5);
            pratoRepository.save(prato6);
    
        };
    }
}
