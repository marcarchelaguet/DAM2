package model;

public class Professor {

    String nom;
    String cognom;

    //Constructors
    public Professor(){

    }
    public Professor(String nom, String cognom){
        this.nom = nom;
        this.cognom = cognom;
    }

    //Getters & setters
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCognom() {
        return cognom;
    }
    public void setCognom(String cognom) {
        this.cognom = cognom;
    }
}
