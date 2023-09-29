package com.ismaelmaldonado.proyecto_viernes_servidor.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ismaelmaldonado.proyecto_viernes_servidor.model.Libro;

@Repository
public interface LibroRepository extends JpaRepository<Libro, String> {

}
