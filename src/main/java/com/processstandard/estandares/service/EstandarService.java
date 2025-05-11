package com.processstandard.estandares.service;

import com.processstandard.estandares.model.Estandar;
import com.processstandard.estandares.repository.EstandarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstandarService {

    @Autowired
    private EstandarRepository estandarRepository;

    public List<Estandar> obtenerTodos() {
        return estandarRepository.findAll();
    }

    public Optional<Estandar> obtenerPorId(int id) {
        return estandarRepository.findById(id);
    }

    public Estandar crear(Estandar estandar) {
        return estandarRepository.save(estandar);
    }

    public Estandar actualizar(Estandar estandar) {
        return estandarRepository.save(estandar);
    }

    public void eliminar(int id) {
        estandarRepository.deleteById(id);
    }

    public boolean existe(int id) {
        return estandarRepository.existsById(id);
    }
}