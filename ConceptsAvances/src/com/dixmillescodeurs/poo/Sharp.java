package com.dixmillescodeurs.poo;

public class Sharp implements ICalculatrice{

    @Override
    public double somme(double nombre1, double nombre2) {
        return nombre1 + nombre2;
    }

    @Override
    public double soustration(double nombre1, double nombre2) {
        return nombre1-nombre2;
    }

    @Override
    public double produit(double nombre1, double nombre2) {
        return nombre1*nombre2;
    }

    @Override
    public double division(double nombre1, double nombre2) {

        double resultat = 0;

        try {
            resultat = nombre1/nombre2;
        }catch (Exception e) {
            System.out.println(" Division par 0 impossible");
        }

        return resultat;
    }
}
