package pl.javastart.schronisko.repository;

import org.springframework.stereotype.Repository;
import pl.javastart.schronisko.model.Pets;

import javax.validation.constraints.Max;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PetsRepository {
    private List<Pets> petsList;

    public PetsRepository() {
        petsList = new ArrayList<>();
        petsList.add(new Pets("Azor", "teks informacyjny o psie", "/Azor.jpg"));
        petsList.add(new Pets("Rudy", "teks informacyjny o psie", "/Rudy.jpg"));

    }

    public List<Pets> getPetsList() {
        return petsList;
    }

    public void setPetsList(List<Pets> petsList) {
        this.petsList = petsList;
    }

    public Pets getPet (String name){
        for (Pets p : petsList) {
            if (p.getName().equals(name))
               return p;
        }
        return null;
    }
}
