package saulo.springframework.sfgpetclinic.services;

import saulo.springframework.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);
    Vet save (Vet owner);
    Set<Vet> findAll();
}
