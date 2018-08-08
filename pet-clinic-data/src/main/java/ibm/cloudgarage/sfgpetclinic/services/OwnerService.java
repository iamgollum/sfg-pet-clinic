package ibm.cloudgarage.sfgpetclinic.services;

import ibm.cloudgarage.sfgpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
