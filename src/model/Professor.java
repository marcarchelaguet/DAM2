package model;

import java.sql.Connection;
import java.util.Scanner;

public class Professor {
    int id;
    String nom;
    String cognom;

    //Constructors
    public Professor(){

    }

    public Professor(String nom, String cognom){
        this.nom = nom;
        this.cognom = cognom;
    }

    public Professor(int id, String nom, String cognom){
        this.id = id;
        this.nom = nom;
        this.cognom = cognom;
    }

    //Getters & setters
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getCognoms() {
        return cognom;
    }
    public void setCognoms(String cognom) {
        this.cognom = cognom;
    }

}
