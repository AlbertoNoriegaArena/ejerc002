package es.santander.ascender.ejerc002.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import es.santander.ascender.ejerc002.model.Columna;

@SpringBootTest
public class ColumnaRepositoryTest {

    @Autowired
    private ColumnaRepository repository;

    @Test
    public void create() {

        Columna columna = new Columna();
        // a2 tiene que ser mayor o igual que 5 por validaciones
        columna.setA2(5);
        // a1 tiene que ser distinto de null
        columna.setA1(4l);

        repository.save(columna);

        // Si crea el registro, la BBDD se encarga de egenerar el ID
        // Vamos a comprobar el ID que tiene el nuevo registro

        assertTrue(
                repository
                        .findById(columna.getId())
                        .isPresent());

    }

}
