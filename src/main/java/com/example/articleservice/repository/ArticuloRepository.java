package com.example.articleservice.repository;

import com.example.articleservice.model.Articulo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticuloRepository extends JpaRepository<Articulo, String> {
}
