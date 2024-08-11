package com.example.articleservice;

import com.example.articleservice.model.Articulo;
import com.example.articleservice.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArticleServiceApplication implements CommandLineRunner {

    @Autowired
    private ArticuloRepository articuloRepository;

    public static void main(String[] args) {
        SpringApplication.run(ArticleServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Articulo articulo1 = new Articulo();
        articulo1.setId("A123456789");
        articulo1.setNombre("Producto 1");
        articulo1.setDescripcion("Descripción del Producto 1");
        articulo1.setPrecio(29.99);
        articulo1.setModelo("Modelo1");
        articuloRepository.save(articulo1);

        Articulo articulo2 = new Articulo();
        articulo2.setId("B123456789");
        articulo2.setNombre("Producto 2");
        articulo2.setDescripcion("Descripción del Producto 2");
        articulo2.setPrecio(39.99);
        articulo2.setModelo("Modelo2");
        articuloRepository.save(articulo2);
    }
}
