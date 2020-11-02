package services;

<<<<<<< HEAD
public interface PetService {
=======
import model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
>>>>>>> c684989cf145145f01f842ad640974cd4b05a3e9
}
