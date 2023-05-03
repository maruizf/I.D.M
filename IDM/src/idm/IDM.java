
package idm;

import java.sql.Connection;
import java.sql.SQLException;

public class IDM {
    public static void main(String[] args) {
        try {
            Connection conexion = ConexionBD.conectar();
            // Aquí puedes ejecutar tus consultas SQL
            conexion.close(); // No olvides cerrar la conexión cuando termines
        } catch (SQLException e) {
            System.out.println("Error al conectarse a la base de datos: " + e.getMessage());
        }
    }
}
