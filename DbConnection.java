import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {

    public static Connection connect() {

        Connection c = null;

        try {
            Class.forName("org.sqlite.JDBC");
            c = DriverManager.getConnection("jdbc:sqlite:C:/Users/Admin_Asus/IdeaProjects/BudgetTracker/db.db");
            System.out.println("Connected!");
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e+"");
        }
        return c;
    }
}
