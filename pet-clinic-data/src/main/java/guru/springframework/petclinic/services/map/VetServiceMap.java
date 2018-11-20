package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Vet;
import guru.springframework.petclinic.services.CrudService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet,Long> implements CrudService<Vet, Long> {
    public Set<Vet> findAll() {
        return super.findAll();
    }

    public void delete(Vet object) {
        super.delete(object);
    }

    public Vet save(Vet object) {
        return super.save(object.getId(),object);
    }

    public void deletById(Long id) {
      super.deleteById(id);
    }

    public Vet findById(Long id) {
        return super.findById(id);
    }
}
