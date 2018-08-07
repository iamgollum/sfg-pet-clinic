package ibm.cloudgarage.sfgpetclinic.services;

import ibm.cloudgarage.sfgpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByid(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
