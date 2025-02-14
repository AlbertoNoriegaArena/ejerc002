package es.santander.ascender.ejerc002.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.santander.ascender.ejerc002.model.Columna;
import es.santander.ascender.ejerc002.repository.ColumnaRepository;

@Service
public class ColumnaService {

    @Autowired
    private ColumnaRepository repository;

    public Columna create(Columna columna) {

        // repository.save() normalmente devuelve la misma instancia pero no está
        // garantizado.
        // Como no está garantizado tienes que devolver el objeto

        if (columna.getId() != null) {
            throw new CRUDSecurityException("Han tratado de modificar un registro columna",
                    CRUDOperation.CREATE,
                    columna.getId());
        } else {
            return repository.save(columna);
        }

    }

    // Leer uno
    public Columna read(Long id) {
        return repository.findById(id).orElse(null);
    }

    // Listar
    public List<Columna> read() {
        return repository.findAll();
    }

    // Con el update ya tienes el id. En teoria podrías devolver vacio aunque lo
    // puedes dejar asi también.
    public Columna update(Columna columna) {
        if (columna.getId() == null) {
            throw new CRUDSecurityException("Han tratado de crear un registro columna utilizando modificar",
                    CRUDOperation.UPDATE,
                    null);
        }
        return repository.save(columna);
    }

    // DELETE
    // Si no puede borrar salta con excepción
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
