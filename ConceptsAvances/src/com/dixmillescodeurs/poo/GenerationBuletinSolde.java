package com.dixmillescodeurs.poo;

public class GenerationBuletinSolde implements IPersonnel {

    @Override
    public double calculSalaire(Employe employe) {
        return employe.calculSalaire();
    }
}
