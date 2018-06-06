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

public class DatabaseUpdate {
 

public static void main(String... args) 
    {
        Scanner sc=new Scanner(System.in);
        out.println("Enter user name");
        String id=sc.next();
        
        try
        {
            Class.forName("com.mysql.jdbc.Driver");//used to load driver
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root" ); 
            PreparedStatement st=
con.prepareStatement("select * from usertable where username=?");
            st.setString(1, id);
            st.executeQuery();
            ResultSet rs=st.executeQuery();
            if(rs.next())
            {
                out.println("select choice to update");
                out.println("--------Index------------");
                out.println("1.username");
                out.println("1.username");
                out.println("1.address");
                out.println("1.city");
                out.println("1.username");
                out.println("1.gender");
                
                int choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        out.println("Enter update contactno");
                        int contactno=sc.nextInt();
                        PreparedStatement st1=con.prepareStatement("update usertable set contactno=? where username=?");                                              
                         st1.setInt(1,contactno);
                         st1.setString(2,id);
                         st1.executeUpdate();
                         break;
                  }
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


