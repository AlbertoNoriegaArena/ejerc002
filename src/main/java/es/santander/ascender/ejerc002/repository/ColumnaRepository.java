package es.santander.ascender.ejerc002.repository;

import org.springframework.data.repository.ListCrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import es.santander.ascender.ejerc002.model.Columna;

public interface ColumnaRepository
        extends ListCrudRepository<Columna, Long>, ListPagingAndSortingRepository<Columna, Long> {

}
