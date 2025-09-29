package model;

import java.sql.Connection;
import java.util.Scanner;

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

    //Menú
    public static void menu(Connection conn){
        Scanner sc = new Scanner(System.in);
        int opcio;
        do {
            System.out.println("---Gestió Professors---");
            System.out.println("1 - Alta");
            System.out.println("2 - Llistar");
            System.out.println("3 - Actualitzar");
            System.out.println("4 - Eliminar");
            System.out.println("5 - Sortir");
            System.out.print("Tria una opció: ");
            opcio = Integer.parseInt(sc.nextLine());

        }while (opcio!=5);

    }

}
