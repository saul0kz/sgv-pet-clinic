package saulo.springframework.sfgpetclinic.services;

import saulo.springframework.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
   Owner findByLastName(String lastName);


}
