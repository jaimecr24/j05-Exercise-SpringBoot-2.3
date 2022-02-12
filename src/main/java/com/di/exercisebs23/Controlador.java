package com.di.exercisebs23;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controlador {

    @Autowired @Qualifier("bean1") PersonaService p1;
    @Autowired @Qualifier("bean2") PersonaService p2;
    @Autowired @Qualifier("bean3") PersonaService p3;

    @GetMapping("/controlador/bean/{bean}")
    public Persona getPersona(@PathVariable String bean)
    {
        switch (bean)
        {
            case "bean1": return new Persona(p1.getNombre(),p1.getPoblacion(),p1.getEdad());
            case "bean2": return new Persona(p2.getNombre(),p2.getPoblacion(),p2.getEdad());
            case "bean3": return new Persona(p3.getNombre(),p3.getPoblacion(),p3.getEdad());
            default: return new Persona("","",0);
        }
    }

}
