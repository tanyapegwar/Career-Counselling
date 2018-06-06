/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Databaseconnection;

import static java.lang.System.out;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

public class DatabaseSearch {
 

public static void main(String... args) 
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter admin id");
        String id=sc.next();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//used to load driver
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root" ); 
            PreparedStatement st1=
con.prepareStatement("select * from adminlogintable where adminid=?");
            st1.setString(1, id);
            st1.executeQuery();
            ResultSet rs=st1.executeQuery();
            if(rs.next())
            {
                String adminId=rs.getString(1);
                String password=rs.getString(2);
                out.println(adminId+" "+password);
            }
            else
            {
            out.println("no record found");
            }
            con.close();
            
        }
        catch(SQLException  |   ClassNotFoundException ex)
        {
                        ex.printStackTrace();
        }
            
        
        
    }
    
}
    
}
