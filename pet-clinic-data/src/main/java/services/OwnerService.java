package services;

<<<<<<< HEAD
public interface OwnerService {
=======
import model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastname);

    Owner findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();
>>>>>>> c684989cf145145f01f842ad640974cd4b05a3e9
}
