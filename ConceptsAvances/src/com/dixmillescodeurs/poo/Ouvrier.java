package com.dixmillescodeurs.poo;

public class Ouvrier extends Employe {
    public Ouvrier(String nom, String prenom, int age) {
        super(nom, prenom, age);
    }

    @Override
    public double calculSalaire() {
        return this.getAnciennete()*IPersonnel.SALAIRE_BASE;
    }
}
