package com.servicio.demo.Servicio;

import org.springframework.stereotype.Service;

@Service
public class HolaMundoServicio {
    public String holaMundo(int id) {
        switch (id) {
            case 55220014:
                return "Hola Juan Pablo Gutierrez cod:"+ id;
            case 55220010:
                return "Hola Frans Sebastian Villamizar cod:"+ id;
            case 55220011:
                return "Hola Camilo Andres Leon cod:" + id;
            case 55219009:
                return "Hola Cristian Javier Rodriguez cod:"+id;
            default:
                return "Hola Mundo!";
        }
    }
}
