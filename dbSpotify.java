package com.soptifyapi;

import org.testng.annotations.Test;

import java.sql.*;

public class dbSpotify {

    @Test
    public void TestPlaylistDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Database username and password
        String username = "sagar";
        String password = "sagar@123";

        //Query to execute
        String query = "select *from playlist";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,username,password);

        //Create Statement Object
        Statement stmt = con.createStatement();

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String Song_No = rs.getString(1);
            String Song_Name = rs.getString(2);
            System. out.println(Song_No+"  "+Song_Name);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestPlaylistInsertionDatabase() throws ClassNotFoundException, SQLException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "Insert into playlist(Song_No,Song_Name) Values('6','Tu hi re')";

        // Execute the SQL Query. Store results in ResultSet
        stmt.executeUpdate(query);

        //System. out.println(Song_No+"  "+Song_Name);

        // closing DB Connection
        con.close();

    }

    @Test
    public void TestPlaylistUpdateDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "update playlist set Song_Name= 'Barish ki jaye' where song_No= 4";

        // Execute the SQL Query. Store results in ResultSet
        stmt.executeUpdate(query);


        // closing DB Connection
        con.close();


    }

    @Test
    public void TestPlaylistDeleteDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "delete from playlist where song_No= 5";

        // Execute the SQL Query. Store results in ResultSet
        stmt.executeUpdate(query);


        // closing DB Connection
        con.close();
        System.out.println("Query is executed");

    }

    @Test
    public void TestUserProfileDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Query to execute
        String query = "select *from user_profile";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String ID= rs.getString(1);
            String Name = rs.getString(2);
            String Email = rs.getString(3);
            System. out.println(ID+"  "+Name+"  "+Email);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestUserProfileInsertionDatabase() throws ClassNotFoundException, SQLException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "Insert into user_profile(ID,Name,Email) Values('5','shiva','shiva@gmail.com')";

        // Execute the SQL Query. Store results in ResultSet
        stmt.executeUpdate(query);

        //System. out.println(Song_No+"  "+Song_Name);

        // closing DB Connection
        con.close();
        System.out.println("Query is executed");

    }

    @Test
    public void TestUserProfileUpdateDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "update user_profile set Email = 'mahi@gmail.com' where ID= 3";

        // Execute the SQL Query. Store results in ResultSet
        stmt.executeUpdate(query);


        // closing DB Connection
        con.close();
        System.out.println("Query is executed");

    }

    @Test
    public void TestUserProfileDeleteDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "delete from user_profile where Id= 5";

        // Execute the SQL Query. Store results in ResultSet
        stmt.executeUpdate(query);


        // closing DB Connection
        con.close();
        System.out.println("Query is executed");

    }

    @Test
    public void TestTracksDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Query to execute
        String query = "select *from track";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String Track_number= rs.getString(1);
            String Type = rs.getString(2);
            System. out.println(Track_number+"  "+Type);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestTracksInsertionDatabase() throws ClassNotFoundException, SQLException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "Insert into track(Track_number,Type) Values('6','Album')";

        // Execute the SQL Query. Store results in ResultSet
        stmt.executeUpdate(query);

        //System. out.println(Song_No+"  "+Song_Name);

        // closing DB Connection
        con.close();
        System.out.println("Query is executed");

    }

    @Test
    public void TestTracksUpdateDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "update track set Type = 'Artist' where Track_number= 6";

        // Execute the SQL Query. Store results in ResultSet
        stmt.executeUpdate(query);


        // closing DB Connection
        con.close();
        System.out.println("Query is executed");

    }

    @Test
    public void TestTracksDeleteDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "delete from track where Track_number =4";

        // Execute the SQL Query. Store results in ResultSet
        stmt.executeUpdate(query);


        // closing DB Connection
        con.close();
        System.out.println("Query is executed");

    }

    @Test
    public void TestLeftJoinUserAndPlaylistDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "select user_profile.ID,Playlist.Song_Name from user_profile LEFT JOIN Playlist ON user_profile.ID=Playlist.Song_No;";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String ID = rs.getString(1);
            String Song_Name = rs.getString(2);
            System. out.println(ID+"  "+Song_Name);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestJoinUserprofileAndPlaylistDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "select user_profile.ID,Playlist.Song_Name from user_profile INNER JOIN Playlist ON user_profile.ID=Playlist.Song_No";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String ID = rs.getString(1);
            String Song_Name = rs.getString(2);
            System. out.println(ID+"  "+Song_Name);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestJoinUserprofileAndTracksDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "select user_profile.ID,Track.Type from user_profile INNER JOIN Track ON user_profile.ID=Track.Track_number";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String ID = rs.getString(1);
            String Type = rs.getString(2);
            System. out.println(ID+"  "+Type);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestJoinPlaylistAndTracksDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "select Playlist.Song_Name,Track.Type from Playlist INNER JOIN Track ON Playlist.Song_No=Track.Track_number";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String Song_Name = rs.getString(1);
            String Type = rs.getString(2);
            System. out.println(Song_Name+"  "+Type);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestLeftJoinPlaylistAndTracksDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "select Playlist.Song_Name,Track.Type from Playlist LEFT JOIN Track ON Playlist.Song_No=Track.Track_number";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String Song_Name = rs.getString(1);
            String Type = rs.getString(2);
            System. out.println(Song_Name+"  "+Type);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestLeftJoinUserAndTracksDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "select user_profile.ID,Track.Type from user_profile LEFT JOIN Track ON user_profile.ID=Track.Track_number";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String ID = rs.getString(1);
            String Type = rs.getString(2);
            System. out.println(ID+"  "+Type);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestRightJoinUserAndTracksDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "select user_profile.ID,Track.Type from user_profile RIGHT JOIN Track ON user_profile.ID=Track.Track_number";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String ID = rs.getString(1);
            String Type = rs.getString(2);
            System. out.println(ID+"  "+Type);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestRightJoinUserAndPlaylistDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "select user_profile.ID,Playlist.Song_Name from user_profile RIGHT JOIN Playlist ON user_profile.ID=Playlist.Song_No";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String ID = rs.getString(1);
            String Song_Name = rs.getString(2);
            System. out.println(ID+"  "+Song_Name);
        }
        // closing DB Connection
        con.close();
    }

    @Test
    public void TestRightJoinPlaylistAndTracksDatabase() throws SQLException, ClassNotFoundException {

        String  dbUrl = "jdbc:mysql://localhost:3306/spotify";

        //Load Mysql jdbc driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        //Create Connection to DB
        Connection con = DriverManager.getConnection(dbUrl,"sagar","sagar@123");

        //Create Statement Object
        Statement stmt = con.createStatement();

        //Query to execute
        String query = "select Playlist.Song_Name,Track.Type from Playlist RIGHT JOIN Track ON Playlist.Song_No=Track.Track_number";

        // Execute the SQL Query. Store results in ResultSet
        ResultSet rs= stmt.executeQuery(query);

        // While Loop to iterate through all data and print results
        while (rs.next()){
            String Song_Name = rs.getString(1);
            String Type = rs.getString(2);
            System. out.println(Song_Name+"  "+Type);
        }
        // closing DB Connection
        con.close();
    }


}
