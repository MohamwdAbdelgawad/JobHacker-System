import java.sql.*;

public class Task1 {
    public static void main(String[] args) {
        try{
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","146309012");
            Statement stmt=con.createStatement();

            String sql = "select * from products;";
            ResultSet rs = stmt.executeQuery(sql);
            showResult(rs);

        }catch(Exception e){ System.out.println(e);}

    }
    public static void showResult(ResultSet rs ){
        try {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            for (int i = 1; i <= columnCount; i++)
            {
                System.out.print(metaData.getColumnName(i) + "      ");
            }
            System.out.println();
            System.out.println("------------------------------------------------");
            while (rs.next())
            {
                for (int i = 1; i <= columnCount; i++)
                {
                    Object columnValue = rs.getObject(i);
                    System.out.print(  columnValue + "        ");
                }
                System.out.println();
            }
        }catch (Exception e )
        {
            e.printStackTrace();
        }

    }
}
