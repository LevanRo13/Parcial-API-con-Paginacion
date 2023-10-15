package com.example.ParcialAPIPaginacion.servicies;

import com.example.ParcialAPIPaginacion.entitites.Autor;
import com.example.ParcialAPIPaginacion.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long>implements AutorService {
    public AutorServiceImpl(BaseRepository<Autor, Long> baseRepository) {
        super(baseRepository);
    }
}
