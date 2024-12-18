// 11. Create an application to retrieve information (author id, name, address, city) about the author who living in the city name begins with the letter “n”

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ElevenAuthor {
public static void main(String args[])
{
    Statement statement = null;
    ResultSet resultset= null;
     try{
         String url = "jdbc:mysql://localhost:3306/Employee";
         String user="root";
         String pass="root";
         String Driver ="com.mysql.jdbc.Driver";
         //StringDriver = "com.mysql.cj.jdbc.Driver";
         String Query = "select* from author where city like N%";
         Class.forName(Driver);
         Connection con = DriverManager.getConnection(url, user, pass);
         
         Statement st = con.createStatement();
         ResultSet set = st.executeQuery(Query);
         while (set.next())
         {
             int authorid = set.getInt("authorid");
             String name = set.getString("name");
             String address = set.getString("address");
             String city = set.getString("city");
             System.out.println("...................................");
             System.out.println(authorid+"\t"+name+"\t"+ address+"\t"+city);
         }
     }
     catch(Exception e)
     {
         e.printStackTrace();
     }
}
}
