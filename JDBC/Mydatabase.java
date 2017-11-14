
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bsc3
 */
public class Mydatabase {
   
    public static void main(String ar[]) throws ClassNotFoundException, SQLException 
    {
        try
        {
            Class.forName("org.postgresql.Driver");
            Connection con=DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/postgres","postgres","1234");
            Statement stmt=(Statement) con.createStatement();
            ResultSet rs;
            rs =stmt.executeQuery("select * from Student");
            while (rs.next())
            {
            System.out.println(rs.getString("rollNo"));
        }
            //rs =stmt.executeQuery("select AVG(marks) from Student group by subject");
            //while (rs.next())
            //{            System.out.println(rs.getString("rollNo"));}
        
        // //rs =stmt.executeQuery("select name from Student where marks=MAX(marks)");
            //while (rs.next())
            //{            System.out.println(rs.getString("rollNo"));}
        //
        
        
        
        
        
        
        }
        catch (ClassNotFoundException | SQLException ex){
     
            System.out.print(ex);
        }
        
    }
    
}
