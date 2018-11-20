package guru.springframework.petclinic.services.map;

import guru.springframework.petclinic.model.Owner;
import guru.springframework.petclinic.services.OwnerService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {


    public Set<Owner> findAll() {
        return super.findAll();
    }

    public Owner findById(Long id){
        return super.findById(id);
    }

    public void delete(Owner object) {
       super.delete(object);
    }

    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    public void deletById(Long id) {
   super.deleteById(id);
    }

    public Owner findByLastName(String lastName) {
        return null;
    }
}

//ponieważ mamy extends Abstract zamiast this mamy mieć super