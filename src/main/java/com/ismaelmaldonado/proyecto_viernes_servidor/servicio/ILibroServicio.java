package com.ismaelmaldonado.proyecto_viernes_servidor.servicio;

import java.util.List;
import com.ismaelmaldonado.proyecto_viernes_servidor.model.Libro;

/**
 * Define las operaciones básicas para el servicio de libros.
 * 
 * @author Ismael Maldonado
 */
public interface ILibroServicio {

    /**
     * Añade un nuevo libro a la base de datos.
     * 
     * @param libro El libro a añadir.
     */
    public void addLibro(Libro libro);

    /**
     * Actualiza la información de un libro existente en la base de datos.
     * 
     * @param libro El libro con la información actualizada.
     */
    public void updateLibro(Libro libro);

    /**
     * Elimina un libro de la base de datos.
     * 
     * @param libro El libro a eliminar.
     */
    public void deleteLibro(Libro libro);

    /**
     * Elimina un libro de la base de datos utilizando su ISBN.
     * 
     * @param isbn El ISBN del libro a eliminar.
     */
    public void deleteLibroByID(String isbn);

    /**
     * Recupera todos los libros de la base de datos.
     * 
     * @return Una lista con todos los libros.
     */
    public List<Libro> readAllLibros();

    /**
     * Busca un libro en la base de datos utilizando su ISBN.
     * 
     * @param isbn El ISBN del libro a buscar.
     * @return El libro encontrado o null si no se encuentra.
     */
    public Libro findLibroByIsbn(String isbn);
}
