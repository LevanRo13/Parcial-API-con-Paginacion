package com.example.ParcialAPIPaginacion.controllers;

import com.example.ParcialAPIPaginacion.entitites.Localidad;
import com.example.ParcialAPIPaginacion.servicies.LocalidadServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}
