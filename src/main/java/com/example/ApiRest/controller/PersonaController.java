package com.example.ApiRest.controller;

import com.example.ApiRest.entites.Persona;
import com.example.ApiRest.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
// Esta anotacion le permite el acceso a la API de distintos origenes o clientes
@RequestMapping(path = "api/v1/personas")
public class PersonaController extends BaseControllerImpl<Persona,PersonaServiceImpl>{

}
