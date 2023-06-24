package com.dixmillescodeurs.poo.hello.service;

import com.dixmillescodeurs.poo.hello.dao.DirecteurDao;
import com.dixmillescodeurs.poo.hello.model.Directeur;
import com.dixmillescodeurs.poo.hello.utils.Util;
import org.springframework.stereotype.Service;
import java.util.List;
import lombok.AllArgsConstructor;

/**
 * @author Daniel FOUOMENE
 */
@Service
@AllArgsConstructor
public class RessourceHumaineService {

  private final DirecteurDao directeurDao;
  private final CalculatriceService calculatriceService;

 /*
  public RessourceHumaineService(DirecteurDao directeurDao) {
    this.directeurDao = directeurDao;
  }*/

  public List<Directeur> listeDesDirecteurs() {

    //directeurDao.getAll().stream().forEach(System.out::println);

    return directeurDao.getAll();

  }

  public double ageMoyenDesDirecteursMajeur() {

    var directeurs = directeurDao.getAll();

    var sommeAgeDirecteurs = 0;
    var nombreDirecteurMajeur = 0;
    for (Directeur directeur : directeurs
    ) {

      if (directeur.getAge() >= Util.AGE_MAJEUR) {
        nombreDirecteurMajeur++;
        sommeAgeDirecteurs = calculatriceService.somme(sommeAgeDirecteurs, directeur.getAge());
      }

    }
    var ageMoyen = calculatriceService.division(sommeAgeDirecteurs, nombreDirecteurMajeur);

   /* var ageMoyen = directeurs.stream()
        .filter(directeur -> directeur.getAge() > Util.AGE_MAJEUR)
        .mapToInt(Directeur::getAge)
        .average()
        .getAsDouble();*/

    return ageMoyen;

  }

  public String nomPremierDirecteurMajeur() {

    var directeurs = directeurDao.getAll();

    var nomPremierDirecteurMajeur=directeurs.stream().filter(directeur -> directeur.getAge()>=Util.AGE_MAJEUR)
        .findFirst()
        //.map(directeur -> directeur.getNom())
        .map(Directeur::getNom)
        .get();

    return nomPremierDirecteurMajeur;

  }


}
