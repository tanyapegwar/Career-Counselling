/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


//we can change ref.obj.value
//insertion 
package Databaseconnection;
import static java.lang.System.out;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DatabaseInsert
{
    public static void main(String... args) 
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter admin id");
        String id=sc.next();
        out.println("enter password");
       String pass=sc.next();
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//used to load driver
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root" ); 
            PreparedStatement st1=
con.prepareStatement("insert into adminlogintable values(?,?)");
            st1.setString(1, id);
            st1.setString(2, pass);
                   
            st1.executeUpdate();
            con.close();
            System.out.println("inserted.....");
        }
        catch(SQLException  |   ClassNotFoundException ex)
        {
                        ex.printStackTrace();
        }
            
        
        
    }
    
}