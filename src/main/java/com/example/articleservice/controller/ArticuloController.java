package com.example.articleservice.controller;

import com.example.articleservice.model.Articulo;
import com.example.articleservice.repository.ArticuloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/articulos")
public class ArticuloController {

    @Autowired
    private ArticuloRepository articuloRepository;

    @GetMapping("/{id}")
    public ResponseEntity<Articulo> getArticulo(@PathVariable String id) {
        Optional<Articulo> articulo = articuloRepository.findById(id);
        return articulo.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Articulo> updateArticulo(@PathVariable String id, @RequestBody Articulo articuloDetails) {
        Optional<Articulo> articuloOpt = articuloRepository.findById(id);
        if (!articuloOpt.isPresent()) {
            return ResponseEntity.notFound().build();
        }
        Articulo articulo = articuloOpt.get();
        articulo.setDescripcion(articuloDetails.getDescripcion());
        articulo.setModelo(articuloDetails.getModelo());
        Articulo updatedArticulo = articuloRepository.save(articulo);
        return ResponseEntity.ok(updatedArticulo);
    }
}
