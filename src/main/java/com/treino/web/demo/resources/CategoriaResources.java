package com.treino.web.demo.resources;


import com.treino.web.demo.domain.Categoria;
import com.treino.web.demo.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {


    @Autowired
    private CategoriaService service;

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Categoria> findById(@PathVariable Integer id){

        Categoria categoria = service.find(id);
        return ResponseEntity.ok().body(categoria);
    }


}
