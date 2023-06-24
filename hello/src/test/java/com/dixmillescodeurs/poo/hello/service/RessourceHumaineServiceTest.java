package com.dixmillescodeurs.poo.hello.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import com.dixmillescodeurs.poo.hello.dao.DirecteurDao;
import com.dixmillescodeurs.poo.hello.model.Directeur;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class RessourceHumaineServiceTest {

  @Autowired
  private DirecteurDao directeurDao;

  @Autowired
  private RessourceHumaineService ressourceHumaineService;

  @Test
  void listeDesDirecteursShouldReturnList() {

    //Given
/*
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
    directeurs.add(directeur1); directeurs.add(directeur2); directeurs.add(directeur3); directeurs.add(directeur4);

  /*  when(directeurDao.getAll())
        .thenReturn(directeurs);*/


    //When
    List<Directeur> resultatListDirecteur = ressourceHumaineService.listeDesDirecteurs();

    //Then
    assertThat(resultatListDirecteur).isNotNull();
    assertEquals(resultatListDirecteur.get(0).getNom(),"FARIMATA");
    assertThat(resultatListDirecteur.get(0).getPrenom()).isEqualTo("Douaré");

  }



  @Test
  void ageMoyenDesDirecteursMajeurShouldReturn26() {

    //Given

    //When
    double resultat = ressourceHumaineService.ageMoyenDesDirecteursMajeur();

    //Then

    //assertEquals(resultat,26);
    assertThat(resultat).isEqualTo(26);


  }






}