package com.dixmillescodeurs.poo.hello.model.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VoyageDto {

  private String nom;
  private String destination;
  private String description;

}