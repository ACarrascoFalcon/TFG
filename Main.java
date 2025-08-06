import java.sql.*;

public class Main {

    public static Connection ConectarBD(){
        Connection conexion;
        String host = "jdbc:mysql://localhost:3306/" + "presupuestos";
        String user = "root";
        String pass = "^v^[SQL]7v7";
        String bd = "presupuestos";

        System.out.println("Conectando ...");
        try {
            conexion = DriverManager.getConnection(host, user, pass);
            System.out.println("Conexion exitosa");
        }catch (SQLException e) {
            System.out.println(e.getMessage());
            throw  new RuntimeException(e);
        }
        return conexion;
    }

    public static void main(String[] args) throws SQLException {

        Connection bd = ConectarBD();

        Statement statement = bd.createStatement();

        statement.executeUpdate("INSERT INTO EMPRESA (NOMBRE)  VALUES ('Alejandro')");

        ResultSet SELECT = statement.executeQuery("SELECT * FROM EMPRESA");

        while (SELECT.next()) {
            System.out.println(SELECT.getString("IDEMPRESA") + " | | " + SELECT.getString("NOMBRE"));
        }

        bd.close();
        SELECT.close();
        statement.close();

    }
}
