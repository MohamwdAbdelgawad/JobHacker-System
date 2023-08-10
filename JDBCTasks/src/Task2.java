import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class Task2 {
    public static void main(String[] args) {
        try {
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","146309012");
            Statement stmt=con.createStatement();
            stmt.executeUpdate("Create Table Employee (" +
                    "ID int primary key, " +
                    "F_name varchar(15) not null," +
                    "L_name varchar(15) not null," +
                    "sex varchar(1) not null," +
                    "age int not null," +
                    "address varchar(50) not null," +
                    "phone_number varchar(15)," +
                    "vaction_balance int );");

            PreparedStatement preparedStatement = con.prepareStatement("insert into Employee values(?,?,?,?,?,?,?,?);");
            insertData(preparedStatement);

            String updateString = "UPDATE Employee SET F_name = CONCAT(?, F_name), vaction_balance = 45 WHERE sex = ? and age>45";
            PreparedStatement update = con.prepareStatement(updateString);
            update.setString(1,"MR.");
            update.setString(2,"M");
            update.addBatch();

            update.setString(1,"MRS.");
            update.setString(2,"F");
            update.addBatch();
            update.executeBatch();


        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void insertData(PreparedStatement preparedStatement)
    {
        try {
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "Mohamed");
            preparedStatement.setString(3, "Ahmed");
            preparedStatement.setString(4, "M");
            preparedStatement.setInt(5, 30);
            preparedStatement.setString(6, "123 Main St, City");
            preparedStatement.setString(7, "555-1234");
            preparedStatement.setInt(8, 30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 2);
            preparedStatement.setString(2, "ahmed");
            preparedStatement.setString(3, "omar");
            preparedStatement.setString(4, "M");
            preparedStatement.setInt(5, 50);
            preparedStatement.setString(6, "cairo");
            preparedStatement.setString(7, "123456");
            preparedStatement.setInt(8, 30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 4);
            preparedStatement.setString(2, "mona");
            preparedStatement.setString(3, "ahmed");
            preparedStatement.setString(4, "F");
            preparedStatement.setInt(5, 32);
            preparedStatement.setString(6, "giza");
            preparedStatement.setString(7, "14524756");
            preparedStatement.setInt(8, 30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 3);
            preparedStatement.setString(2, "hana");
            preparedStatement.setString(3, "elsayed");
            preparedStatement.setString(4, "f");
            preparedStatement.setInt(5, 46);
            preparedStatement.setString(6, "minya");
            preparedStatement.setString(7, "555-34");
            preparedStatement.setInt(8, 30);
            preparedStatement.addBatch();

            preparedStatement.setInt(1, 5);
            preparedStatement.setString(2, "mostafa");
            preparedStatement.setString(3, "nashaat");
            preparedStatement.setString(4, "M");
            preparedStatement.setInt(5, 25);
            preparedStatement.setString(6, "minya");
            preparedStatement.setString(7, "010000");
            preparedStatement.setInt(8, 30);
            preparedStatement.addBatch();
            System.out.println(preparedStatement.executeBatch());

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
