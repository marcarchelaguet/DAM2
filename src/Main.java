import controller.ProfessorController;
import DAO.ProfessorDAOImpl;
import model.Professor;
import view.ProfessorView;

public class Main {
    public static void main(String[] args) {
        ProfessorView vista = new ProfessorView();
        ProfessorDAOImpl dao = new ProfessorDAOImpl();
        ProfessorController controller = new ProfessorController(vista, dao);

        controller.iniciarPrograma();

    }
}