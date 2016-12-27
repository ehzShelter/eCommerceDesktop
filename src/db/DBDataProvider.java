/*
    fething data from database
 */
    package db;

    import java.sql.Connection;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.sql.*;
    import java.util.ArrayList;
    import java.util.Vector;
    import javax.swing.JTable;

    import model.Product;

    public class DBDataProvider {

        //get the total number of product per category
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

     //get all products from DB
      public static JTable getAllProduct(){
            JTable productTable;
            Vector v1 = new Vector();
            Vector v3 = new Vector();
            try {
            //Get the conn from DBConnectionProvider
                Connection conn = DBConnectionProvider.getDBConnection();
            //Create Statement to execute query
                PreparedStatement statement = conn.prepareStatement("SELECT * FROM product");
                ResultSet res = statement.executeQuery();

                v1.addElement("NAME");
                v1.addElement("CATEGORY");
                v1.addElement("PRICE");
                v1.addElement("QUANTITY");

                try{
                    Vector v2 = new Vector();
                    v2.addElement(res.getString(2));
                    v2.addElement(res.getString(3));
                    v2.addElement(Double.toString(res.getDouble(4)));
                    v2.addElement(Integer.toString(res.getInt(5)));
                    v3.add(v2);
                }catch(Exception e){
                    System.out.println("ERROR: " + e);
                }
           } catch (Exception ex) {
             System.out.println(ex.getMessage());
         }

        System.out.println(v3.);
        productTable = new JTable(v3,v1);
        return productTable;
     }

 }
