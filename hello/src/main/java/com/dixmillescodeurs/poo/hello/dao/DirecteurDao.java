package com.dixmillescodeurs.poo.hello.dao;

import com.dixmillescodeurs.poo.hello.database.DatabaseRessourceHumain;
import com.dixmillescodeurs.poo.hello.model.Directeur;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 * @author Daniel FOUOMENE
 */
@Component
public class DirecteurDao {

  public List<Directeur> getAll() {
   // DatabaseRessourceHumain.getInstance().stream().forEach(System.out::println);
    return DatabaseRessourceHumain.getInstance();
  }

  public Directeur getById(int index) {
    return DatabaseRessourceHumain.getInstance().get(index);
  }

  public List<Directeur> save(Directeur directeur) {
    var directeurs = DatabaseRessourceHumain.getInstance();
    directeurs.add(directeur);
    return directeurs;
  }

  public List<Directeur> delete(Directeur directeur) {
    var directeurs = DatabaseRessourceHumain.getInstance();
    directeurs.remove(directeur);
    return directeurs;
  }



}
