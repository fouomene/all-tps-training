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

    var ageMoyen = directeurs.stream()
        .filter(directeur -> directeur.getAge() > Util.AGE_MAJEUR)
        .mapToInt(Directeur::getAge)
        .average()
        .getAsDouble();

    return ageMoyen;

  }

  public String nomPremierDirecteurMajeur() {

    var directeurs = directeurDao.getAll();

    var nom = directeurs.stream()
        .filter(directeur -> directeur.getAge() > Util.AGE_MAJEUR)
        //.map(Directeur::getNom)
        .map(directeur -> directeur.getNom())
        .findFirst()
        .get();

    return nom;

  }


}
