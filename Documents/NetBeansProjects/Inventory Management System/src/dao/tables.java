/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class tables {
    
    public static void main(String[] args) {
        Connection con= null;
        Statement st = null;
        try{
            con= ConnectionProvider.getCon();
            st = con.createStatement();
//            st.executeUpdate("CREATE TABLE appuser (" +
//    "appuser_pk INT AUTO_INCREMENT PRIMARY KEY, " +
//    "userRole VARCHAR(50), " +
//    "name VARCHAR(200), " +
//    "mobileNumber VARCHAR(50), " +
//    "email VARCHAR(200), " +
//    "password VARCHAR(50), " +
//    "address VARCHAR(200), " +
//    "status VARCHAR(50))");
        st.executeUpdate("insert into appuser(userRole, name, mobileNumber, email, password, address, status) values('SuperAdmin', 'Super Admin', 'ttlshiwwya1@', 'superadmin@testemail', 'admin', 'India', 'true')");
        JOptionPane.showMessageDialog(null, "Table Created Successfully");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        finally{
            try{
                con.close();
                st.close();
            }
            catch(Exception e){}
        }
    }
    
}
