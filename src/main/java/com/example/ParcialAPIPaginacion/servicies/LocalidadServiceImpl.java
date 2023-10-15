package com.example.ParcialAPIPaginacion.servicies;

import com.example.ParcialAPIPaginacion.entitites.Localidad;
import com.example.ParcialAPIPaginacion.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    public LocalidadServiceImpl(BaseRepository<Localidad, Long> baseRepository) {
        super(baseRepository);
    }
}
