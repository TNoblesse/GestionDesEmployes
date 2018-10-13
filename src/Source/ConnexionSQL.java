/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Source;
import java.sql.*;
/**
 *
 * @author pc
 */
public class ConnexionSQL {
    String urlPilote="com.mysql.jdbc.Driver"; 
    String urlBaseDonnees="jdbc:mysql://localhost:3306/Java"; 
    Connection con;
    
    public ConnexionSQL () {
    
    //chargement de pilote
    try{
      Class.forName(urlPilote);
      System.out.println("Driver load success");
       } 
    catch(ClassNotFoundException ex) { System.out.println(ex);}
    
    //Connexion ‡† la base de donn√©e
    try {
        con=DriverManager.getConnection(urlBaseDonnees,"root","1234");
        System.out.println("Database connection success");
        
        } 
    catch(SQLException ex)  { System.out.println(ex);}
    }
    
    Connection ObtenirConnexion()
    { return con ; }
}

