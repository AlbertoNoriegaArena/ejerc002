package es.santander.ascender.ejerc002.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// @Entity hace referencia que la clase es una tabla de BBDD
@Entity
// Fuerza especificamente el nombre de la tabla
@Table(name = "DATO")
public class Dato {

    // @Id indica que el campo es PK
    // @GeneratedValue
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;

    public Dato() {
    }

    public Dato(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
