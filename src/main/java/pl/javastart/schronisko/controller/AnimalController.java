package pl.javastart.schronisko.controller;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.javastart.schronisko.model.Pets;
import pl.javastart.schronisko.repository.PetsRepository;

import javax.validation.constraints.Null;
import java.util.ArrayList;
import java.util.List;

@Controller

public class AnimalController {

    private PetsRepository petsRepository;

    public AnimalController(PetsRepository petsRepository) {
        this.petsRepository = petsRepository;
    }

    @GetMapping ("/")
    public String home (Model model){
        List<Pets> petsList = petsRepository.getPetsList();
        model.addAttribute("pets", petsList);
        return "home";
    }

    @GetMapping ("/zwierzak")
    public String showPet (Model model, @RequestParam String imie){
        Pets pet = petsRepository.getPet(imie);
        model.addAttribute( "pet", pet);
        return "info";
    }
}
