package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GestorConnexioBD {
    private static final String URL = "jdbc:mysql://localhost:3306/DAM2";
    private static final String USUARI = "root";
    private static final String CONTRASENYA = "10356055";

    public static Connection obtenirConnexio() throws SQLException {
        return DriverManager.getConnection(URL, USUARI, CONTRASENYA);
    }
}
