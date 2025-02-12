package es.santander.ascender.ejerc002.repository;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

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

    @Test
    public void delete() {

        Columna columna = new Columna();
        columna.setA2(6);
        columna.setA1(10L);
        repository.save(columna);

        assertTrue(repository.existsById(columna.getId()));

        // Borrar registro y comprobar que fue borrado
        repository.deleteById(columna.getId());

        assertFalse(repository.existsById(columna.getId()));
    }

    @Test
    public void view() {
        
        Columna columna = new Columna();
        columna.setA2(8);
        columna.setA1(30L);
        repository.save(columna);

        Optional<Columna> registro = repository.findById(columna.getId());

        assertTrue(registro.isPresent());
        assertTrue(registro.get().getA1().equals(30L));
    }

    @Test
    public void update() {
    
        Columna columna = new Columna();
        columna.setA2(7);
        columna.setA1(20L);
        repository.save(columna);

        assertTrue(repository.existsById(columna.getId()));

        columna.setA2(10);
        repository.save(columna);

        Optional<Columna> updatedColumna = repository.findById(columna.getId());

        assertTrue(updatedColumna.isPresent());
        assertTrue(updatedColumna.get().getA2() == 10);
    }

}
