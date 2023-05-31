package com.dixmillescodeurs.poo.hello.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public abstract class Employe {
  private String nom;
  private String prenom;
  private int age;
  private int anciennete;

  public abstract double calculSalaire();
}
