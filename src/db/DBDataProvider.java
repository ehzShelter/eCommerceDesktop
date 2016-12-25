/*
    fething data from database
 */
    package db;

    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.sql.*;
    import java.util.ArrayList;

    public class DBDataProvider {

        public static int getCategoryItem(String name){
            int total_items = 0;
            try {
            //Get the Dbconn from DBConnectionProvider
                Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
                PreparedStatement statement = conn.prepareStatement("SELECT total_items FROM ecommercejava.category WHERE category.name = ?");
                statement.setString(1, name); 
                ResultSet rs = statement.executeQuery();

                while (rs.next()) {
                   total_items = rs.getInt("total_items");
               }

           } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }
         return total_items;
     }

 }
