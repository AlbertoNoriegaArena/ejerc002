package es.santander.ascender.ejerc002;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class DatoRepositoryTest {

    @Autowired
    DatoRepository datoRepository;

    @Test
    public void testList() {
        Iterable<Dato> valores = datoRepository.findAll();
        assertNotNull(valores);
    }

    @Test
    public void testNoExiste() {
        Optional<Dato> resultado = datoRepository.findById(456l);
        assertTrue(resultado.isEmpty());
    }

    @Test
    public void testLeerUno() {

        Dato datoAGuardar = new Dato(null, "Juan");
        datoRepository.save(datoAGuardar);

        Optional<Dato> resultado = datoRepository.findById(datoAGuardar.getId());
        assertTrue(resultado.isEmpty());
    }
}
