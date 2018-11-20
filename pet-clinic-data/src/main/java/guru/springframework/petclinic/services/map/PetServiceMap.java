package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Pet;
import guru.springframework.petclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {
    public Set<Pet> findAll() {
        return super.findAll();
    }

    public void delete(Pet object) {
         super.delete(object);
    }

    public Pet save(Pet object) {
        return super.save(object.getId(),object);
    }

    public void deletById(Long id) {
          super.deleteById(id);
    }

    public Pet findById(Long id) {
        return super.findById(id);
    }
}
