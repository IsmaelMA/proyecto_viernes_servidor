package com.ismaelmaldonado.proyecto_viernes_servidor.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ismaelmaldonado.proyecto_viernes_servidor.model.Libro;
import com.ismaelmaldonado.proyecto_viernes_servidor.servicio.LibroServicio;

/**
 * Controlador REST para gestionar operaciones relacionadas con libros.
 * 
 * @author Ismael Maldonado
 */
@RestController
public class LibroController {

    /** Servicio para gestionar las operaciones CRUD de libros. */
    @Autowired
    LibroServicio servicio;

    /**
     * Obtiene todos los libros.
     * 
     * @return Lista de todos los libros.
     */
    @GetMapping(value = "libros", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Libro> getAllLibros() {
        return servicio.readAllLibros();
    }

    /**
     * Obtiene un libro por su ISBN.
     * 
     * @param isbn ISBN del libro.
     * @return Libro encontrado.
     */
    @GetMapping(value = "libro/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Libro getLibroByID(@PathVariable("isbn") String isbn) {
        return servicio.findLibroByIsbn(isbn);
    }

    /**
     * Actualiza la información de un libro existente.
     * 
     * @param isbn     ISBN del libro.
     * @param titulo   Título del libro.
     * @param tematica Temática o género del libro.
     */
    @PutMapping(value = "libro/{isbn}/{titulo}/{tematica}")
    public void putUpdateLibro(@PathVariable("isbn") String isbn, @PathVariable("titulo") String titulo,
            @PathVariable("tematica") String tematica) {
        Libro libro = servicio.findLibroByIsbn(isbn);
        libro.setTitulo(titulo);
        libro.setTematica(tematica);
        servicio.addLibro(libro);
    }

    /**
     * Añade un nuevo libro a la base de datos.
     * 
     * @param libro Libro a añadir.
     */
    @PostMapping(value = "libro", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void postDarAltaLibro(@RequestBody Libro libro) {
        servicio.addLibro(libro);
    }

    /**
     * Añade un nuevo libro a la base de datos utilizando parámetros.
     * 
     * @param isbn     ISBN del libro.
     * @param titulo   Título del libro.
     * @param tematica Temática o género del libro.
     */
    @PostMapping(value = "libro/{isbn}/{titulo}/{tematica}")
    public void postDarAltaLibroParams(@PathVariable("isbn") String isbn, @PathVariable("titulo") String titulo,
            @PathVariable("tematica") String tematica) {
        Libro nuevoLibro = new Libro(isbn, titulo, tematica);
        servicio.addLibro(nuevoLibro);
    }

    /**
     * Elimina un libro por su ISBN.
     * 
     * @param isbn ISBN del libro a eliminar.
     */
    @DeleteMapping(value = "libro/{isbn}")
    public void deleteRemoveLibro(@PathVariable("isbn") String isbn) {
        servicio.deleteLibroByID(isbn);
    }

}
