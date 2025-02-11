package es.santander.ascender.ejerc002;

import org.springframework.data.repository.CrudRepository;

// Le tienes que pasar la clase de la tabla y el tipo de la PK
public interface DatoRepository extends CrudRepository<Dato, Long> {

}
