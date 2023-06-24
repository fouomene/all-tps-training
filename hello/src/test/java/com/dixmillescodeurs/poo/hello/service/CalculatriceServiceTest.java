package com.dixmillescodeurs.poo.hello.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatriceServiceTest {

  private CalculatriceService calculatrice;


  @BeforeAll
  static public void initStartingTime() {
    System.out.println("Appel avant tous les tests");
  }

  @AfterAll
  static public void showTestDuration() {
    System.out.println("Appel après tous les tests");
  }

  @BeforeEach
  public void initCalculator() {
    System.out.println("Appel avant chaque test");
    calculatrice = new CalculatriceService();
  }

  @AfterEach
  public void undefCalculator() {
    System.out.println("Appel après chaque test");
    calculatrice = null;
  }

 /* 5+2 = 7 */
  @Test
  void somme() {

    int resultat = calculatrice.somme(5, 2);

    assertThat(resultat).isEqualTo(7);

  }

  /* 5+2 = 7 */
  @Test
  void whenGiven5and2Somme_shouldReturn7() {

    // Given ou Arrange
    var nombre1 = 5;
    var nombre2 = 2;

    // when ou act
    int resultat = calculatrice.somme(nombre1, nombre2);

    // then ou assert
    assertThat(resultat).isEqualTo(7);

  }

 /* 1+1 = 2 ; 2+3 = 5; 42 +57 = 99 */
 @ParameterizedTest(name = "{0} + {1} should equal to {2}")
 @CsvSource({ "1,1,2", "2,3,5", "42,57,99" })
 public void somme_shouldReturnTheSum_ofMultipleIntegers(int arg1, int arg2, int expectResult) {
  // Arrange -- Tout est prêt !

  // Act
  int actualResult = calculatrice.somme(arg1, arg2);

  // Assert
  assertThat(expectResult).isEqualTo(actualResult);
 }

  /* 8 - 5 = 3 */
  @Test
  void soustration() {

    int resultat = calculatrice.soustration(8, 5);

    assertThat(resultat).isEqualTo(3);
  }

  /* 8 * 5 = 40 */
  @Test
  void multiplication() {

    int resultat = calculatrice.multiplication(8, 5);

    assertThat(resultat).isEqualTo(40);
    assertEquals(resultat, 40);

  }

  /* 8 / 2 = 4 */
  @Test
  void division() {

    double resultat = calculatrice.division(8, 2);

    assertThat(resultat).isEqualTo(4.0);

  }
  /* 4 , 2 = 12*/
  @Test
  void calculPerimetreshouldReturnTheResult12WhenLongueuris4andLargeuris2(){

    // ARRANGE ou GIVEN
   CalculatriceService calculatriceService = new CalculatriceService();

   // ACT ou WHEN
    int resultat = calculatriceService.calculPerimetre(4,2);

   // ASSERT ou  THEN
   assertThat(resultat).isEqualTo(12);

  }


}