package AssignmentJDBC;
import java.sql.*;
import java.util.Scanner;

import static java.lang.System.exit;

public class JDBC {
    public static void main(String args[]) {

        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "9449";
        final String DATABASE_NAME="student";
        try (Connection con = DriverManager.getConnection(url, username, password);
             Scanner scanner = new Scanner(System.in)) {

            System.out.println("Connected to Database Successfully");
            System.out.println("Please see the Tables Available First");
            int choice;
          do {
              System.out.println("Choose an option:");
              System.out.println("1. Create Table");
              System.out.println("2. Insert Record");
              System.out.println("3. Delete Records");
              System.out.println("4. Update Records");
              System.out.println("5. GetTables");
              System.out.println("6. Exit");

              choice = scanner.nextInt();
              scanner.nextLine();
              switch (choice) {
                  case 1:
                      createTable(con);
                      break;
                  case 2:
                      insertRecord(con,DATABASE_NAME, scanner);
                      break;
                  case 3:
                      deleteRecord(con,DATABASE_NAME,scanner);
                      break;
                  case 4:
                      updateRecords(con,scanner);
                      break;
                  case 5:
                      getTableNames(con,DATABASE_NAME);
                      break;
                  case 6:
                      exit(0);
                  default:
                      System.out.println("Invalid choice! Please choose 1 or 2.");
              }
          }while (choice!=6);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void createTable(Connection con) {
        System.out.println("Enter the table name");
        Scanner sc=new Scanner(System.in);
        String tableName=sc.nextLine();
        String createTable = "CREATE TABLE IF NOT EXISTS "+tableName+"(id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100), age INT,mobileNO VARCHAR(20))";
        try (Statement st = con.createStatement()) {

            st.executeUpdate(createTable);
            System.out.println("Table created successfully!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void insertRecord(Connection con,String dbName, Scanner sc) throws SQLException {
        getTableNames(con,dbName);
        System.out.println("Enter your table Name: ");
        String tableName=sc.nextLine();
        String insertData = "INSERT INTO "+tableName+"(name, age,mobileNO) VALUES (?,?,?)";
        try (PreparedStatement p = con.prepareStatement(insertData)) {
            System.out.println("Enter name of employee");
            String name=sc.nextLine();
            System.out.println("Enter mobile number of employee");
            String mob=sc.nextLine();
            System.out.println("Enter age of employee");
            int age=sc.nextInt();
            p.setString(1, name);
            p.setInt(2, age);
            p.setString(3, mob);
            p.executeUpdate();
            System.out.println("Data Inserted Successfully");
        }
    }
    private static void deleteRecord(Connection con,String dbName,Scanner sc){
     try {
         getTableNames(con,dbName);
         System.out.println("Enter the table to Delete the Records:");
         String tableName=sc.nextLine();
         System.out.println("Enter the Id to Delete Records From Table:"+tableName);
         int id=sc.nextInt();
         String deleteQuery = "DELETE FROM " + tableName + " WHERE id = ?";
         PreparedStatement preparedStatement=con.prepareStatement(deleteQuery);
         preparedStatement.setInt(1,id);
         int rowsAffected=preparedStatement.executeUpdate();
         if(rowsAffected>0){
             System.out.println("Data Deleted Successfully");
         }else {
             System.out.println("No record found with ID: " + id);
         }
     }catch (Exception e){
      e.printStackTrace();
     }
    }
    private static void updateRecords(Connection con, Scanner sc) {
        try {
            getTableNames(con, "student");
            System.out.println("Enter the table name where you want to update a record:");
            String tableName = sc.nextLine();

            System.out.println("Enter the ID of the record to update:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the new name:");
            String newName = sc.nextLine();

            System.out.println("Enter the new age:");
            int newAge = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter the new mobile number:");
            String newMobile = sc.nextLine();

            String updateQuery = "UPDATE " + tableName + " SET name = ?, age = ?, mobileNO = ? WHERE id = ?";
            try (PreparedStatement p = con.prepareStatement(updateQuery)) {
                p.setString(1, newName);
                p.setInt(2, newAge);
                p.setString(3, newMobile);
                p.setInt(4, id);

                int rowsAffected = p.executeUpdate();
                if (rowsAffected > 0) {
                    System.out.println("Record updated successfully.");
                } else {
                    System.out.println("No record found with ID " + id);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void getTableNames(Connection con, String databaseName) {
        try {
            DatabaseMetaData metaData = con.getMetaData();
            ResultSet tables = metaData.getTables(databaseName, null, "%", new String[]{"TABLE"});

            System.out.println("\nTables in database '" + databaseName + "':");
            boolean found = false;
            while (tables.next()) {
                System.out.println("- " + tables.getString("TABLE_NAME"));
                found = true;
            }
            if (!found) {
                System.out.println("No tables found in this database.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}



