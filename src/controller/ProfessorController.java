package controller;

import DAO.ProfessorDAO;
import model.Professor;
import view.ProfessorView;

import java.util.List;

public class ProfessorController {
    private final ProfessorView vista;
    private final ProfessorDAO dao;

    public ProfessorController(ProfessorView vista, ProfessorDAO dao) {
        this.vista = vista;
        this.dao = dao;
    }

    public void iniciarPrograma(){
        int opcio;
        do {
            opcio = vista.mostrarMenuPrincipal();
            if (opcio == 1){
                gestionarProfessors();
            }
        }while (opcio != 0);
        System.out.println("Programa finalitzat.");
    }

    private void gestionarProfessors() {
        int op;
        do {
            op = vista.mostrarMenuProfessors();
            switch (op){
                case 1 -> altaProfessor();
                case 2 -> llistarProfessors();
                case 3 -> actualitzarProfessor();
                case 4 -> eliminarProfessor();
            }
        }while (op != 0);
    }

    private void eliminarProfessor() {
        int id = vista.demanarIdEliminar();
        dao.eliminarProfessor(id);
    }

    private void actualitzarProfessor() {
        Professor p = vista.demanarDadesActualitzar();
        dao.editarProfessor(p);
    }

    private void llistarProfessors() {
        List<Professor> llista = dao.llistarProfessors();
        vista.mostrarProfessors(llista);
    }

    private void altaProfessor() {
        Professor p = vista.demanarDadesAlta();
        dao.afegirProfessor(p);
    }
}
