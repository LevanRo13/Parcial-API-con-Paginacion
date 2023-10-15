package com.example.ParcialAPIPaginacion.servicies;

import com.example.ParcialAPIPaginacion.entitites.Libro;
import com.example.ParcialAPIPaginacion.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long> implements LibroService {
    public LibroServiceImpl(BaseRepository<Libro, Long> baseRepository) {
        super(baseRepository);
    }
}
