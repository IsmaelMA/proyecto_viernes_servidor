package com.ismaelmaldonado.proyecto_viernes_servidor.model;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * Representa un libro en la base de datos.
 * 
 * @author Ismael Maldonado
 */
@Entity
@Table(name = "libros")
public class Libro {

    /** ISBN del libro, utilizado como identificador único. */
    @Id
    @Column(name = "isbn")
    private String isbn;

    /** Título del libro. */
    @Column(name = "titulo")
    private String titulo;

    /** Temática o género del libro. */
    @Column(name = "tematica")
    private String tematica;

    /**
     * Constructor por defecto.
     */
    public Libro() {
    }

    /**
     * Constructor que inicializa el libro con un ISBN.
     * 
     * @param isbn ISBN del libro.
     */
    public Libro(String isbn) {
        this.isbn = isbn;
    }

    /**
     * Constructor completo para inicializar un libro.
     * 
     * @param isbn     ISBN del libro.
     * @param titulo   Título del libro.
     * @param tematica Temática o género del libro.
     */
    public Libro(String isbn, String titulo, String tematica) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.tematica = tematica;
    }

    /**
     * @return ISBN del libro.
     */
    public String getIsbn() {
        return isbn;
    }

    /**
     * Establece el ISBN del libro.
     * 
     * @param isbn ISBN a establecer.
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    /**
     * @return Título del libro.
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Establece el título del libro.
     * 
     * @param titulo Título a establecer.
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return Temática o género del libro.
     */
    public String getTematica() {
        return tematica;
    }

    /**
     * Establece la temática o género del libro.
     * 
     * @param tematica Temática a establecer.
     */
    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isbn, tematica, titulo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Libro other = (Libro) obj;
        if (isbn == null) {
            if (other.isbn != null)
                return false;
        } else if (!isbn.equals(other.isbn))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Libros [isbn=" + isbn + ", titulo=" + titulo + ", tematica=" + tematica + "]";
    }

}
