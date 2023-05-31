package com.dixmillescodeurs.poo.hello.model;

import com.dixmillescodeurs.poo.hello.utils.Util;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;



@SuperBuilder
public class Directeur extends Employe {
  public double calculSalaire() {
    return (double) (this.getAnciennete() * 2) * Util.SALAIRE_BASE;
  }
}
