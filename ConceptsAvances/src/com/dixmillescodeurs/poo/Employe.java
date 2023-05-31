package com.dixmillescodeurs.poo;

public abstract class Employe {

    private String nom;
    private String prenom;
    private int age;

    private int anciennete;

    public Employe(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public Employe(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public Employe() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAnciennete() {
        return anciennete;
    }

    public void setAnciennete(int anciennete) {
        this.anciennete = anciennete;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + this.nom + '\'' +
                ", prenom='" + this.prenom + '\'' +
                ", age=" + this.age +
                '}';
    }

    public abstract double calculSalaire();

}
