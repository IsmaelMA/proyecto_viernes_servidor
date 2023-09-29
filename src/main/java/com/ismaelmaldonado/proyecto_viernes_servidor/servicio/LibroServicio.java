package com.ismaelmaldonado.proyecto_viernes_servidor.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ismaelmaldonado.proyecto_viernes_servidor.model.Libro;
import com.ismaelmaldonado.proyecto_viernes_servidor.repository.LibroRepository;

/**
 * Implementación del servicio de libros que utiliza un repositorio JPA para
 * interactuar con la base de datos.
 * 
 * @author TuNombre (o el nombre que desees colocar)
 */
@Service
public class LibroServicio implements ILibroServicio {

    /**
     * Repositorio para gestionar las operaciones CRUD de libros en la base de
     * datos.
     */
    @Autowired
    LibroRepository repository;

    /**
     * {@inheritDoc}
     */
    @Override
    public void addLibro(Libro libro) {
        repository.save(libro);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void updateLibro(Libro libro) {
        repository.save(libro);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteLibro(Libro libro) {
        repository.delete(libro);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void deleteLibroByID(String isbn) {
        repository.deleteById(isbn);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Libro> readAllLibros() {
        return repository.findAll();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Libro findLibroByIsbn(String isbn) {
        return repository.findById(isbn).get();
    }

}
