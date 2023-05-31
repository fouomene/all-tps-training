package com.dixmillescodeurs.poo.hello.presention;

import com.dixmillescodeurs.poo.hello.service.RessourceHumaineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RessourceHumainController {

  @Autowired
  private RessourceHumaineService ressourceHumaineService;


  @GetMapping("/listedirecteurs")
  public String listeDirecteurs(Model model) {

    var directeurs = ressourceHumaineService.listeDesDirecteurs();

    directeurs.stream().forEach(System.out::println);

    model.addAttribute("directeurs", directeurs);

    return "listedirecteurs";
  }

}