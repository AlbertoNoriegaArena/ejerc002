package es.santander.ascender.ejerc002.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.santander.ascender.ejerc002.model.Columna;
import es.santander.ascender.ejerc002.service.ColumnaService;

@RestController
@RequestMapping("/api/columna")
public class ColumnaController {

    @Autowired
    private ColumnaService columnaService;

    @PostMapping
    public Columna create(@RequestBody Columna columna) {
        return columnaService.create(columna);
    }

    @GetMapping("/{id}")
    public Columna read(@PathVariable("id") Long id) {
        return columnaService.read(id);
    }

    @GetMapping
    public List<Columna> list() {
        return columnaService.list();
    }

    @PutMapping
    public Columna update(@RequestBody Columna columna) {
        return columnaService.update(columna);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        columnaService.delete(id);
    }

}
