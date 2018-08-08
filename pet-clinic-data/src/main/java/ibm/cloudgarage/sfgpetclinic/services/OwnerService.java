package ibm.cloudgarage.sfgpetclinic.services;

import ibm.cloudgarage.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;


public interface OwnerService extends CrudRepository<Owner, Long> {
    Owner findByLastName(String lastName);
}
