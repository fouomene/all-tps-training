package com.dixmillescodeurs.poo.hello.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import com.dixmillescodeurs.poo.hello.dao.DirecteurDao;
import com.dixmillescodeurs.poo.hello.model.Directeur;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class RessourceHumaineServicelUTest {

  @InjectMocks
  RessourceHumaineService ressourceHumaineService;

  @Mock
  private DirecteurDao directeurDao;
  @Mock
  private CalculatriceService calculatriceService;

  private static List<Directeur> getDirecteurs() {
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
    // construction de la liste des directeurs
    List<Directeur> directeurs = new ArrayList();
    directeurs.add(directeur1);
    directeurs.add(directeur2);
    directeurs.add(directeur3);
    directeurs.add(directeur4);
    return directeurs;
  }

  @Test
  public void listeDesDirecteursShouldReturnList() {
    //Given ou Arrage
    List<Directeur> directeurs = getDirecteurs();

    // mocker la couche dao
    when(directeurDao.getAll())
        .thenReturn(directeurs);

    //When ou act
    List<Directeur> resultatListDirecteur = ressourceHumaineService.listeDesDirecteurs();


    //Then
    verify(directeurDao).getAll();
    assertThat(ressourceHumaineService).isNotNull();
    assertEquals(resultatListDirecteur.get(0).getNom(), "FARIMATA");
    assertThat(resultatListDirecteur.get(0).getPrenom()).isEqualTo("Douaré");
  }

  // avec notre liste des directeurs age moyen doit être egale à 26
  @Test
  public void givenOurListDirecteurAgeMoyenDesDirecteursMajeurShouldReturn26() {
    // Given ou Arrange
    // constitution de la liste des directeurs
    List<Directeur> directeurs = getDirecteurs();

    // When ou action
    // mocker la couche dao
    when(directeurDao.getAll())
        .thenReturn(directeurs);
    when(calculatriceService.somme(0, 32))
        .thenReturn(32);
    when(calculatriceService.somme(32, 20))
        .thenReturn(52);
    when(calculatriceService.division(52, 2))
        .thenReturn(26.0);

    double resultAgeMoyen = ressourceHumaineService.ageMoyenDesDirecteursMajeur();

    //Then ou Assert
    verify(directeurDao).getAll();
    assertThat(resultAgeMoyen).isEqualTo(26.0);

  }

  @Test
  public void givenListDirecteurWhenCallNomPremierDirecteurMajeurThenShouldReturnNJEUNKWE() {

    // GIVEN
    List<Directeur> directeurs = getDirecteurs();
    // mocker la couche dao
    when(directeurDao.getAll()).thenReturn(directeurs);
    // WHEN

    var nomPremierDirecteurMajeurResultat = ressourceHumaineService.nomPremierDirecteurMajeur();

    // THEN ou ASSERT
    verify(directeurDao).getAll();
    assertThat(nomPremierDirecteurMajeurResultat).isEqualTo("NJEUNKWE");


  }


}
