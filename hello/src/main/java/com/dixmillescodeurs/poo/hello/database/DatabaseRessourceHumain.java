package com.dixmillescodeurs.poo.hello.database;

import com.dixmillescodeurs.poo.hello.model.Directeur;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * @author Daniel FOUOMENE
 */
public final class DatabaseRessourceHumain {

  private static List<Directeur> directeurs;

  private DatabaseRessourceHumain() {

    this.directeurs = getListDirecteurFromDatabase();

  }

  public static List<Directeur> getInstance() {

    if (!Optional.ofNullable(directeurs).isPresent()) {
      directeurs = getListDirecteurFromDatabase();
    }
    return directeurs;
  }

  public static List<Directeur> getListDirecteurFromDatabase() {
    var directeur1 = Directeur.builder()
        .nom("FARIMATA")
        .prenom("Douaré")
        .age(13)
        .build();
    var directeur2 = Directeur.builder()
        .nom("NANKAM")
        .prenom("Fabrice")
        .age(15)
        .build();
    var directeur3 = Directeur.builder()
        .nom("NJEUNKWE")
        .prenom("Borel")
        .age(32)
        .build();
    var directeur4 = Directeur.builder()
        .nom("TATA")
        .prenom("TITI")
        .age(20)
        .build();

    List<Directeur> directeurs = new ArrayList();
    directeurs.add(directeur1);
    directeurs.add(directeur2);
    directeurs.add(directeur3);
    directeurs.add(directeur4);

    return directeurs;
  }


}
