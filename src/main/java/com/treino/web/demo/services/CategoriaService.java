package com.treino.web.demo.services;

import com.treino.web.demo.domain.Categoria;
import com.treino.web.demo.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    public Categoria find(Integer id){
        Optional<Categoria> categoria = repository.findById(id);

        return categoria.orElseThrow(null);
    }
}
