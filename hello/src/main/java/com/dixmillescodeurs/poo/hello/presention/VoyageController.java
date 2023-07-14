package com.dixmillescodeurs.poo.hello.presention;

import com.dixmillescodeurs.poo.hello.service.RessourceHumaineService;
import com.dixmillescodeurs.poo.hello.service.VoyageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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

    return "reservation";
  }

}