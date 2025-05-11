package com.processstandard.estandares.controller;

import com.processstandard.estandares.model.Estandar;
import com.processstandard.estandares.service.EstandarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estandares")
public class EstandarController {

    @Autowired
    private EstandarService estandarService;

    @GetMapping
    public List<Estandar> obtenerTodos() {
        return estandarService.obtenerTodos();
    }

    @GetMapping("/{id}")
    public Optional<Estandar> obtenerPorId(@PathVariable int id) {
        return estandarService.obtenerPorId(id);
    }

    @PostMapping
    public Estandar crear(@RequestBody Estandar estandar) {
        return estandarService.crear(estandar);
    }

    @PutMapping("/{id}")
    public Estandar actualizar(@PathVariable int id, @RequestBody Estandar estandar) {
        if (estandarService.existe(id)) {
            estandar.setId(id);
            return estandarService.actualizar(estandar);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable int id) {
        if (estandarService.existe(id)) {
            estandarService.eliminar(id);
        }
    }
}