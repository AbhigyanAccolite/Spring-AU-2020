package JDBC;

/*
DELIMITER $$
CREATE PROCEDURE EmployeeManagers(IN empid INT)
BEGIN
    SELECT employee.id, first_name,last_name FROM employee
    INNER JOIN Managers ON employee.id = Managers.id        
    END$$
DELIMITER ;

*/ 
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.CallableStatement;
 
public class StoredProcedure {
 
    public static void getManager(int managerId) {
        // 
        String query = "{ call EmployeeManagers(?) }";
        ResultSet rs;
 
        try {
            Class.forName("com.mysql.jdbc.Driver");  
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","123");  
            CallableStatement stmt = conn.prepareCall(query)) {
 
                stmt.setInt(1, managerId);
    
                rs = stmt.executeQuery();
                while (rs.next()) {
                    System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3)));
                }

            } 
        }

        catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
 
   
    public static void main(String[] args) {
        getManager(1);
    }
}
