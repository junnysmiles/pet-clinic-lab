package services;

<<<<<<< HEAD
public interface VetService {
=======
import model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Vet vet);

    Set<Vet> findAll();

>>>>>>> c684989cf145145f01f842ad640974cd4b05a3e9
}
