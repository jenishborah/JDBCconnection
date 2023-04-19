import java.sql.*;
public class Dbconnection {

   
    public static void main(String[] args) {
        try
        {
         Class.forName("com.mysql.jdbc.Driver");  
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/book_management_db","Jenish","Jenish@3116");  
 
        Statement stmt=con.createStatement();  
        ResultSet rs=stmt.executeQuery("select * from books_info");  
        while(rs.next())  
        System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+" "+rs.getInt(7));  
        con.close();  
}
        catch(Exception e)
        { 
            System.out.println(e);
        }  
}  
}  