package com.example.ParcialAPIPaginacion.repositories;
import com.example.ParcialAPIPaginacion.entitites.Libro;
import org.springframework.stereotype.Repository;

@Repository
public interface LibroRepository extends BaseRepository<Libro,Long> {
}