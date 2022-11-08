import com.mysql.cj.jdbc.Driver;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JDBCLec {
    public static void main(String[] args) {
//        List<Album> allAlbums = new ArrayList<>();
//
//        try {
//            //1. Establish Driver and Connection Object.
//            DriverManager.registerDriver(new Driver());
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
//                    "root",
//                    "codeup");
//            // 2. Create Statement Instant.
//            Statement stmt = connection.createStatement();
//
//            // .execute() : returns boolean (used for delete)
//            // .executeUpdate() : returns the number of rows affected (used for insert or update)
//            // .executeQuery() : returns a ResultSet object (used for selecting queries)
//
//            // 3. Write SELECT query to execute, and set equal to ResultSet.
//            ResultSet rs = stmt.executeQuery("SELECT * FROM albums");
//
//            // While there are still records found on the next row, continue to move to the next row.
//            while(rs.next()){
//                // Create an instance of the album object based on the data coming from our DB
////                allAlbums.add(new Album(rs.getLong("id"), rs.getString("artist"), rs.getString("name")));
//
//                Album albumToAdd = (new Album(rs.getLong("id"), rs.getString("artist"), rs.getString("name")));
//                //add the new instance to the list of Album object
//                allAlbums.add(albumToAdd);
//
//            }
//
//            for(Album album : allAlbums){
//                System.out.println(album.getName());
//            }
//
//            connection.close();
//
//        } catch (SQLException e) {
//            throw new RuntimeException("Sorry, could not connect to database.");
//        }
        try{
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                   "codeup");
            Statement stmt = connection.createStatement();

            String insertQuery = "INSERT INTO albums (artist, name, release_date, genre, sales) VALUES ('Lil Wayne', 'Carter III', 2008, 'rap', 3.97)";

            // Execute the update.
            stmt.executeUpdate(insertQuery, Statement.RETURN_GENERATED_KEYS);
            // Set ResultSet to the newly generated Keys (ids)
            ResultSet rs = stmt.getGeneratedKeys();
            if(rs.next()){
                System.out.println("Inserted a new record! New id: " + rs.getLong(1));
            }

        } catch(SQLException e){
            e.printStackTrace();
//            throw new RuntimeException("Sorry, could not connect to database.");

        }
    }
}
