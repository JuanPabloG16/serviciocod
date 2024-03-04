package com.servicio.demo.Controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.demo.Servicio.HolaMundoServicio;

@RestController
public class HolaMundoControlador {
    @Autowired
    private HolaMundoServicio personasService;

    @GetMapping("/personas/{codigo}")
    public String obtenerNombrePorCodigo(@PathVariable int codigo) {
        return personasService.buscarNombrePorCodigo(codigo);
    }
}