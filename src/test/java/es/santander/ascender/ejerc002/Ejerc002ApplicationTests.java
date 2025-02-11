package es.santander.ascender.ejerc002;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Ejerc002ApplicationTests {

	@Autowired
	EjemploLogica miLogica;

	@Test
	void contextLoads() {

		int resultado = miLogica.multiplica(5, 3);
		assertEquals(15, resultado);
	}

}
