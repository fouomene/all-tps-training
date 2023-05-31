package com.dixmillescodeurs.poo;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author Daniel FOUOMENE
 */
public class MainCollection {

    public static void main(String[] args) {

        Directeur directeur1 = new Directeur("NANKAM", "Fabrice", 13);
        Directeur directeur2 = new Directeur("DOUARE", "Farimata", 15);
        Directeur directeur3 = new Directeur("NJEUNKWE", "Borel", 32);
        Directeur directeur4 = new Directeur("TATA", "TITI", 20);

        List<Directeur> directeurs = new ArrayList<Directeur>();
        directeurs.add(directeur1);
        directeurs.add(directeur2);
        directeurs.add(directeur3);
        directeurs.add(directeur1);
        directeurs.add(directeur2);

        // afficher la liste des directeurs
        for (Directeur d : directeurs) {
            System.out.println(d);
        }

        // afficher le troisieme directeur
        System.out.println("**********************afficher le troisieme directeur***********");
        System.out.println(directeurs.get(2));

        Set<Directeur> directeursSet = new HashSet<>();
        directeursSet.add(directeur1);
        directeursSet.add(directeur2);
        directeursSet.add(directeur3);
        directeursSet.add(directeur1);
        directeursSet.add(directeur2);
        directeursSet.add(directeur4);
        System.out.println("********************** directeurs avec la collection Set ***********");
        for (Directeur d : directeursSet) {
            System.out.println(d);
        }

        Map<String, Employe> dictionnaireEmploye = new HashMap<>();

        dictionnaireEmploye.put("04Y452", directeur1);
        dictionnaireEmploye.put("04Y455", directeur2);
        dictionnaireEmploye.put("04Y453", directeur3);

        System.out.println("********************** directeurs avec Map ***********");
        for (Employe e : dictionnaireEmploye.values()
        ) {
            System.out.println(e);
        }


        List<Directeur> directeursStream = new ArrayList<Directeur>();
        directeursStream.add(directeur1);
        directeursStream.add(directeur2);
        directeursStream.add(directeur3);
        directeursStream.add(directeur4);

        // Besoin : « Avec la même liste des directeurs, on souhaite calculer l’âge moyen des directeurs majeurs
        double moyenAgeDirecteusMajeurs = directeursStream.stream()
                .filter(directeur -> directeur.getAge() > 18) // filtre sur l'age
                .mapToInt(directeur -> directeur.getAge()) // liste des ages
                .average() // moyen de la liste des ages
                .getAsDouble();

        System.out.println(" l’âge moyen des directeurs majeurs est " + moyenAgeDirecteusMajeurs);

        ///afficher le nom du 1er directeur majeur de la liste précédente

        String nomPremierDirecteurMajeur = directeursStream.stream()
            .filter(directeur -> directeur.getAge()>18)
            //.map(directeur -> directeur.getNom())
            .map(Directeur::getNom)
            .findFirst()
            .orElse("Aucun resultat");

        System.out.println("le nom du 1er directeur majeur de la liste précédente est " + nomPremierDirecteurMajeur);

        List<String> listNomDirecteurs = directeursStream.stream()
            .map(directeur -> directeur.getNom())
            .collect(Collectors.toList());

        listNomDirecteurs.stream().forEach(nom-> System.out.println(nom));

        listNomDirecteurs.stream().forEach(System.out::println);









    }


}
