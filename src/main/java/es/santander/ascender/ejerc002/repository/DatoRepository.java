package es.santander.ascender.ejerc002.repository;

import org.springframework.data.repository.CrudRepository;

import es.santander.ascender.ejerc002.model.Dato;

// Le tienes que pasar la clase de la tabla y el tipo de la PK
public interface DatoRepository extends CrudRepository<Dato, Long> {

}
