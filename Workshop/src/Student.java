import java.sql.*;

public class Student {
    public void insertEntries() {
        String url = "jdbc:mysql://localhost:3306/";
        String user = "Root";
        String password = "Root";
        try {
// Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

// Connect to MySQL
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            stmt.executeQuery("create database if not exists Java");
            // 2. Use Database
            stmt.executeUpdate("USE Java");
            // 3. Create Table
            String createTable = "CREATE TABLE IF NOT EXISTS student (" +
                    "id INT PRIMARY KEY AUTO_INCREMENT, " +
                    "name VARCHAR(50), " +
                    "marks INT)";
            stmt.executeUpdate(createTable);
            // 4. Insert Data
            String insertData = "INSERT INTO student(name, marks) VALUES" +
                    "('Manvi', 85)," +
                    "('Vaishnavi', 90)";
            stmt.executeUpdate(insertData);
            System.out.println("Database, Table created & Data inserted!");

// Close connection
            con.close();


        }catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        } catch (SQLException e){
            throw new RuntimeException(e);

        } finally {
            System.out.println("Database Created Successfully");

        }

    }

    public static void main(String[] args) {
        Student student=new Student();
        student.insertEntries();
    }
}