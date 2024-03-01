package com.servicio.demo.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.servicio.demo.Servicio.HolaMundoServicio;

@RestController
public class HolaMundoControlador {
    private final HolaMundoServicio holaMundoServicio;

    public HolaMundoControlador(HolaMundoServicio holaMundoServicio) {
        this.holaMundoServicio = holaMundoServicio;
    }

    @GetMapping("/{id}")
    String holaMundo(@PathVariable int id) {
        return holaMundoServicio.holaMundo(id);
    }
}
