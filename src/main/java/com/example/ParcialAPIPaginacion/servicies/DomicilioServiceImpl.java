package com.example.ParcialAPIPaginacion.servicies;

import com.example.ParcialAPIPaginacion.entitites.Domicilio;
import com.example.ParcialAPIPaginacion.repositories.BaseRepository;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long> implements DomicilioService {

    public DomicilioServiceImpl(BaseRepository<Domicilio, Long> baseRepository) {
        super(baseRepository);
    }
}
