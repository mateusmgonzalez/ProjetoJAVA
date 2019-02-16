package com.treino.web.demo.services;

import com.treino.web.demo.domain.Cliente;
import com.treino.web.demo.repository.ClienteRepository;
import com.treino.web.demo.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente find(Integer id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.orElseThrow(()-> new ObjectNotFoundException("Objeto não encontrdo Id: " + id + Cliente.class.getName() ));
    }

}
