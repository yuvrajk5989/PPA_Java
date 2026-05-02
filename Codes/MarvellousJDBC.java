import java.sql.*;

class MarvellousJDBC
{
    public static void main(String[] args)
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ppa54", "root", "");

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT * FROM student");

            System.out.println("------------------------------");
            System.out.println("Now Displaying the table ");
            System.out.println("------------------------------");

            while(rs.next())
            {
                System.out.println("Roll No : " + rs.getInt("rno"));
                System.out.println("Name    : " + rs.getString("name"));
                System.out.println("City    : " + rs.getString("city"));
                System.out.println("Marks   : " + rs.getInt("marks"));
                System.out.println("------------------------------");
            }

            rs.close();
            stmt.close();
            con.close();
        }
        catch (Exception e)
        {
            System.out.println("Exception occured : " + e);
        }
    }
}
