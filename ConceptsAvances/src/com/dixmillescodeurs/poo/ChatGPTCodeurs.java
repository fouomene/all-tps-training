package com.dixmillescodeurs.poo;

public class ChatGPTCodeurs implements IRobotIA {

    @Override
    public double calculer(double nombre1, double nombre2, Operateur operateur, ICalculatrice calculatrice) {

        switch (operateur){
            case ADDITION: return calculatrice.somme(nombre1,nombre2);
            case SOUSTRACTION: return calculatrice.soustration(nombre1,nombre2);
            case MULTIPLICATION: return calculatrice.produit(nombre1,nombre2);
            case DIVISION: return calculatrice.division(nombre1,nombre2);
        }

        return 0;
    }
}
