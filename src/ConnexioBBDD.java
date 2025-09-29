import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnexioBBDD {

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost:3306/DAM2?useSSL=false&serverTimezone=UTC";
        String usuari = "root";
        String contrasenya = "10356055";

        try {
            Connection conn = DriverManager.getConnection(url, usuari, contrasenya);
            System.out.println("Connectat correctament");
            return conn;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
