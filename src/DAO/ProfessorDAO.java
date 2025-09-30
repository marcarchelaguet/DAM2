package DAO;

import model.Professor;
import java.util.List;

public interface ProfessorDAO {
    void afegirProfessor(Professor p);
    void editarProfessor(Professor p);
    void eliminarProfessor(int id);
    List<Professor> llistarProfessors();
}