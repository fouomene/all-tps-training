package com.dixmillescodeurs.poo;

public class Directeur extends Employe {

    public Directeur(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public String toString() {

        return "Directeur{} " + super.toString();
    }

    @Override
    public double calculSalaire() {
        return (this.getAnciennete()*2)*IPersonnel.SALAIRE_BASE;
    }
}
