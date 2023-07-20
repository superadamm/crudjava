/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package widhy;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author USER
 */
public class koneksi {
     Connection koneksi = null;
    public static Connection koneksi(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/crudjava","root","");
            return koneksi;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
