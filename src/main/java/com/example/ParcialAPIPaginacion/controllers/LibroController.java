package com.example.ParcialAPIPaginacion.controllers;

import com.example.ParcialAPIPaginacion.entitites.Libro;
import com.example.ParcialAPIPaginacion.servicies.LibroServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("api/v1/libros")
public class LibroController extends BaseControllerImpl<Libro, LibroServiceImpl> {
}
