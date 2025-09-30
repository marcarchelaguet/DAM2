package view;

import model.Professor;

import java.sql.Connection;
import java.util.List;
import java.util.Scanner;

public class ProfessorView {
    private final Scanner sc = new Scanner(System.in);

    public int mostrarMenuPrincipal(){
        int opcio;
        System.out.println("--- MENÚ PRINCIPAL ---");
        System.out.println("1. Gestionar professors");
        System.out.println("0. Sortir");
        System.out.print("Tria una opció: ");
        opcio = Integer.parseInt(sc.nextLine());
        return opcio;
    }

    public int mostrarMenuProfessors(){
        System.out.println("--- MENÚ PROFESSORS ---");
        System.out.println("1. Alta");
        System.out.println("2. Llistar");
        System.out.println("3. Actualitzar");
        System.out.println("4. Eliminar");
        System.out.println("0. Sortir");
        System.out.print("Tria una opció: ");
        int opcio = Integer.parseInt(sc.nextLine());
        return opcio;
    }

    //Metodes
    public Professor demanarDadesAlta(){
        System.out.print("Nom: ");
        String nom = sc.nextLine();
        System.out.print("Cognoms: ");
        String cognoms = sc.nextLine();
        return new Professor(nom, cognoms);
    }

    public Professor demanarDadesActualitzar(){
        System.out.print("ID del professor: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nou nom: ");
        String nom = sc.nextLine();
        System.out.print("Nous cognoms: ");
        String cognom = sc.nextLine();
        return new Professor(id, nom, cognom);
    }

    public int demanarIdEliminar(){
        System.out.print("ID del professor a eliminar: ");
        int id = Integer.parseInt(sc.nextLine());
        return id;
    }

    public void mostrarProfessors(List<Professor> professors){
        System.out.println("---Lista de professors---");
        for (Professor p : professors){
            System.out.println(p.getId() + " - " + p.getCognoms() + ", " + p.getNom());
        }
    }




}
