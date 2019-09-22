package pl.javastart.schronisko.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.schronisko.model.Category;
import pl.javastart.schronisko.model.Pets;
import pl.javastart.schronisko.repository.PetsRepository;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

@Controller
public class AnimalController {

    private PetsRepository petsRepository;
  //  private Category category;

    public AnimalController(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    @GetMapping ("/")
    public String home (Model model, @RequestParam (required = false) Category category){
        List<Pets> petsList = petsRepository.showPetsListByCategory(category);
        model.addAttribute("pets", petsList);
        return "home";
    }

    @GetMapping ("/zwierzak")
    public String showPet (Model model, @RequestParam String imie){
        Pets pet = petsRepository.getPet(imie);
        model.addAttribute( "pet", pet);
        return "info";
    }

    @GetMapping("/dodaj")
    public String addPet (Model model){
        model.addAttribute("pet", new Pets());
        return "nowyzwierzak";
    }

    @PostMapping ("/dodaj")
    public String nowy (Pets pet){
        petsRepository.addPetToList(pet);
        return "redirect:/zwierzak?imie=" + pet.getName();
    }
}
