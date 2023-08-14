package com.dixmillescodeurs.poo.hello.presention;

import com.dixmillescodeurs.poo.hello.model.dto.VoyageDto;
import com.dixmillescodeurs.poo.hello.service.RessourceHumaineService;
import com.dixmillescodeurs.poo.hello.service.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VoyageController {

  @Autowired
  private VoyageService voyageService;

  @GetMapping("/voyages")
  public String listevoyages(Model model) {

    var voyages = voyageService.listVoyages();

    model.addAttribute("voyages", voyages);


    return "voyages";
  }

  @GetMapping("/reservation")
  public String formulaireReservation(Model model) {
    var voyageDTO = VoyageDto.builder()
        .nom("kri")
        .destination("YAO")
        .description("")
        .build();

    model.addAttribute("voyageDTO",voyageDTO);
    return "reservation";
  }

  @PostMapping("/enregistrervoyage")
  public String enregistrerVoyage(@ModelAttribute VoyageDto voyageDto) {

    voyageService.ajouterVoyage(voyageDto);

    return "redirect:voyages";
  }

}