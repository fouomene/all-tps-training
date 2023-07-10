package com.dixmillescodeurs.poo.hello.model.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Daniel FOUOMENE
 */
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Voyage {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String nom;
  private String destination;
  private String description;

}
