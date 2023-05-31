package com.dixmillescodeurs.poo.hello.model;

import com.dixmillescodeurs.poo.hello.utils.Util;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;


@SuperBuilder
public class Ouvrier extends Employe {
  public double calculSalaire() {
    return (double)this.getAnciennete() * Util.SALAIRE_BASE;
  }
}