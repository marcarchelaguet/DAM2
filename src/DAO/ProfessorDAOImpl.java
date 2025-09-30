package DAO;

import model.Professor;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAOImpl implements ProfessorDAO {

    @Override
    public void afegirProfessor(Professor p) {
        String sql = "INSERT INTO Professors (nom, cognoms) VALUES (?, ?)";
        try (Connection conn = GestorConnexioBD.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getNom());
            stmt.setString(2, p.getCognoms());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void editarProfessor(Professor p) {
        String sql = "UPDATE Professors SET nom=?, cognoms=? WHERE id=?";
        try (Connection conn = GestorConnexioBD.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, p.getNom());
            stmt.setString(2, p.getCognoms());
            stmt.setInt(3, p.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void eliminarProfessor(int id) {
        String sql = "DELETE FROM Professors WHERE id=?";
        try (Connection conn = GestorConnexioBD.obtenirConnexio();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Professor> llistarProfessors() {
        List<Professor> professors = new ArrayList<>();
        String sql = "SELECT * FROM Professors";
        try (Connection conn = GestorConnexioBD.obtenirConnexio();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                professors.add(new Professor(
                        rs.getInt("id"),
                        rs.getString("nom"),
                        rs.getString("cognoms")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return professors;
    }
}
