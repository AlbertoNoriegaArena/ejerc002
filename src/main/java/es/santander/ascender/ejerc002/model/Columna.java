package es.santander.ascender.ejerc002.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;

@Entity
@Table(name = "Columna")
public class Columna {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    // Asignar un nombre diferente al campo de la BBDD
    @Column(name = "numero_largo_1", nullable = false, unique = true)
    private Long a1;

    @Min(value = 5)
    @Column(name = "numero_largo_2")
    private long a2;

    @Email
    private String correo;

    private boolean a3;

    private Boolean a4;

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Boolean getA4() {
        return a4;
    }

    public void setA4(Boolean a4) {
        this.a4 = a4;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public Character getLetra2() {
        return letra2;
    }

    public void setLetra2(Character letra2) {
        this.letra2 = letra2;
    }

    private char letra;

    private Character letra2;

    public Columna() {

    }

    public Columna(Long id, long a1, long a2, boolean a3) {
        this.id = id;
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getA1() {
        return a1;
    }

    public void setA1(Long a1) {
        this.a1 = a1;
    }

    public long getA2() {
        return a2;
    }

    public void setA2(long a2) {
        this.a2 = a2;
    }

    public boolean isA3() {
        return a3;
    }

    public void setA3(boolean a3) {
        this.a3 = a3;
    }

}
