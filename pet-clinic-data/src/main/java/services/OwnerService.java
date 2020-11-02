package services;

import model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastname);

    Owner findById(Long Id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
