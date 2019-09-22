package pl.javastart.schronisko.repository;

import org.springframework.stereotype.Repository;
import pl.javastart.schronisko.model.Category;
import pl.javastart.schronisko.model.Pets;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PetsRepository {
    private List<Pets> petsList;

    public PetsRepository() {
        petsList = new ArrayList<>();
        petsList.add(new Pets("Azor", "teks informacyjny o psie", "/Azor.jpg", Category.DOGS ));
        petsList.add(new Pets("Rudy", "teks informacyjny o psie", "/Rudy.jpg", Category.DOGS));
        petsList.add(new Pets("Czarek", "teks informacyjny o kocie", "/Rudy.jpg", Category.CATS));
        petsList.add(new Pets("Kuba", "teks informacyjny o chomiku", "/Rudy.jpg", Category.OTHER));
    }

    public List<Pets> getPetsList() {
        return petsList;
    }

    public List<Pets> showPetsListByCategory (Category category){
        List<Pets> petsListByCategory = new ArrayList<>();
        if (category == null)
            return getPetsList();
        else
        {
            for (Pets pet: petsList) {
                if (pet.getCategory() == category){
                    petsListByCategory.add(pet);
                }
            }
            return petsListByCategory;
        }
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

    public void addPetToList (String name, String description, String img, Category category){
        petsList.add(new Pets(name, description, img, category));
    }

    public void addPetToList (Pets pet){
        petsList.add(pet);
    }
}
