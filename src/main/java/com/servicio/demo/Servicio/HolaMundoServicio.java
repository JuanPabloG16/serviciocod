package com.servicio.demo.Servicio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.servicio.demo.Modelo.Personas;

@Service
public class HolaMundoServicio {
    private List<Personas> personas = new ArrayList<>();

    public HolaMundoServicio() {
        cargarDatos();
    }

    private void cargarDatos() {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            ClassPathResource resource = new ClassPathResource("personas.json");
            Personas[] personasArray = objectMapper.readValue(resource.getInputStream(), Personas[].class);
            personas = Arrays.asList(personasArray);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String buscarNombrePorCodigo(int codigo) {
        for (Personas persona : personas) {
            if (persona.getCodigo() == codigo) {
                return persona.getNombre();
            }
        }
        return "Persona no encontrada";
    }
}