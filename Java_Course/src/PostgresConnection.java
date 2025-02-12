
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PostgresConnection {
        public static void main(String[] args) {
            // Database credentials
            String url = "jdbc:postgresql://localhost:5432/User"; // Replace with your database URL
            String user = "admin";
            String password = "HelloWorld@123";

            // Connection object
            Connection conn = null;
            Statement st = null;

            try {
                // Register JDBC driver (optional for newer versions)
                Class.forName("org.postgresql.Driver");

                // Open connection
                conn = DriverManager.getConnection(url, user, password);
                System.out.println("Connection to PostgreSQL established successfully!");
                if(conn!=null){
                    st= conn.createStatement();
                    String FetchUser= "Select * from User";
                    st.execute(FetchUser);
                    System.out.println("Users Fetched");
                }
                st= conn.createStatement();
                String FetchUser= "Select * from User";
                st.execute(FetchUser);

            } catch (ClassNotFoundException e) {
                System.out.println("PostgreSQL JDBC Driver not found.");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("Connection failed.");
                e.printStackTrace();
            } finally {
                // Close connection
                try {
                    if(st!=null) st.close();
                    if (conn != null) {
                        conn.close();
                        System.out.println("Connection closed.");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }


