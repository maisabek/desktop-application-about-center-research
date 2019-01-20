package theproject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.TextField;
public class loginn {
       public  static int flag=0;
       public  static int fla=0;
       public  static int fl=0;
       public  static int ff=0;
       public  static int fff=0;
       public  static int ffff=0;
public boolean managerlogin(TextField f ,TextField h) {  
        String str1 = f.getText();
        String str2 = h.getText();
        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dp", "root", "");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from  mang ");
               while (rs.next()){
                   String val1 = rs.getString(1);
                   String val2 = rs.getString(2);
                   if (( val1.equals(str1))&&(val2.equals(str2)))
                   flag=1;
                   break;
                    }
         }catch (SQLException ex){
                 System.out.print("exception is" + ex);
         }catch(ClassNotFoundException ex){
                 System.out.print("exception is" + ex);
         }if(flag==1){
          return true;
          }else{
          return false;             
}}
public boolean healthlogin(TextField f ,TextField h) {
         String str1 = f.getText();
         String str2 = h.getText();
         try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dp", "root", "");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from  health ");
               while (rs.next()){
                   String val1 = rs.getString(1);
                   String val2 = rs.getString(2);
                   if (( val1.equals(str1))&&(val2.equals(str2)))
                   fla=1;
                   break;}
         }catch (SQLException ex){
                  System.out.print("exception is" + ex);
         }catch(ClassNotFoundException ex){
                  System.out.print("exception is" + ex);
         }if(fla==1){
           return true;
          }else{
          return false;             
}}
public boolean educatelogin(TextField f ,TextField h) {
         String str1 = f.getText();
         String str2 = h.getText();
         try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dp", "root", "");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from  educate ");
               while (rs.next()){
                   String val1 = rs.getString(1);
                   String val2 = rs.getString(2);
                   if (( val1.equals(str1))&&(val2.equals(str2)))
                   fl=1;
                   break;}
         }catch(SQLException ex){
                   System.out.print("exception is" + ex);
         }catch(ClassNotFoundException ex){
                   System.out.print("exception is" + ex);
         }if(fl==1){
           return true;
          }else{
          return false;             
}}
public boolean medecinelogin(TextField f ,TextField h) {
         String str1 = f.getText();
         String str2 = h.getText();
         try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dp", "root", "");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from  medecine ");
               while (rs.next()){
                   String val1 = rs.getString(1);
                   String val2 = rs.getString(2);
                   if (( val1.equals(str1))&&(val2.equals(str2)))
                   ff=1;
                   break;}
         }catch(SQLException ex){
            System.out.print("exception is" + ex);
         }catch (ClassNotFoundException ex){
            System.out.print("exception is" + ex);
         }if(ff==1){
          return true;
          }else{
          return false;             
}}
public boolean doctorlogin(TextField f ,TextField h) {
         String str1 = f.getText();
         String str2 = h.getText();
         try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dp", "root", "");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from  doctorr ");
               while (rs.next()){
                   String val1 = rs.getString("User_Name");
                   String val2 = rs.getString("Password");
                   if (( val1.equals(str1))&&(val2.equals(str2)))
                   fff=1;
                   break; }
         }catch(SQLException ex){
            System.out.print("exception is" + ex);
         }catch(ClassNotFoundException ex){
            System.out.print("exception is" + ex);
         }if(fff==1){
          return true;
          }else{
          return false;             
}}
public boolean changepassword(TextField curr ,TextField pas,TextField conf) {
         String str1 = curr.getText();
         String str2 = pas.getText();
         String str3 = conf.getText();
         try{
         Class.forName("com.mysql.jdbc.Driver");
         Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dp", "root", "");
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from  doctorr ");
           while (rs.next()){
           String val2 = rs.getString("Password");
           if((val2.equals(str1))&&(str2.equals(str3))) 
                   ffff=1;
                   break;}
         }catch (SQLException ex){
          System.out.print("exception is" + ex);
         }catch (ClassNotFoundException ex){
         System.out.print("exception is" + ex);
         }if(ffff==1){
         return true;
         }else{
        return false; 
        }}}
