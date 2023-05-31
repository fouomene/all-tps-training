package com.dixmillescodeurs.poo;

public class Rectangle extends Forme{

       private double longueur;
       private double largeur;

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    @Override
    public double perimetre() {
        return (this.largeur + this.longueur)*2;
    }

    @Override
    public double surface() {
        return this.largeur * this.longueur;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "longueur=" + longueur +
                ", largeur=" + largeur +
                "} " + super.toString();
    }
}
