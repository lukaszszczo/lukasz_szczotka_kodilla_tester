package com.kodilla.jdbc;

import org.junit.Assert;
import org.junit.Test;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbManagerTestSuite {
    @Test
    public void testConnect() throws SQLException {
        //Given
        //When
        DbManager dbManager = DbManager.getInstance();
        //Then
        Assert.assertNotNull(dbManager.getConnection());
    }

    @Test
    public void testSelectUsers() throws SQLException {
        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Zara', 'Ali')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Otman', 'Use')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Mark', 'Boq')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Uli', 'Wimer')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO USERS(FIRSTNAME, LASTNAME) VALUES ('Oli', 'Kosiw')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT * FROM USERS";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {


            System.out.println(rs.getInt("ID") + ", " +
                    rs.getString("FIRSTNAME") + ", " +
                    rs.getString("LASTNAME"));
            counter++;
        }
        int expected = count + 5;
        Assert.assertEquals(expected, counter);

        rs.close();
        statement.close();
    }

    @Test
    public void testSelectUsersAndPosts() throws SQLException {

        //Given
        DbManager dbManager = DbManager.getInstance();
        String countQuery = "SELECT COUNT(*) FROM USERS JOIN POSTS ON USERS.ID = POSTS.USER_ID GROUP BY POSTS.USER_ID HAVING COUNT(*) > 1";
        Statement statement = dbManager.getConnection().createStatement();
        ResultSet rs = statement.executeQuery(countQuery);
        int count = 0;
        while (rs.next()) {
            count = rs.getInt("COUNT(*)");
        }
        String sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES (2,'This is my first post too!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES (2,'This is my first post too!')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES (3,'Testowa wiadomosc')";
        statement.executeUpdate(sql);
        sql = "INSERT INTO POSTS (USER_ID, BODY) VALUES (3,'Testowa wiadomosc')";
        statement.executeUpdate(sql);

        //When
        String sqlQuery = "SELECT FIRSTNAME, LASTNAME, COUNT(*) AS POSTS_NUMBER FROM USERS JOIN POSTS ON USERS.ID = POSTS.USER_ID GROUP BY POSTS.USER_ID HAVING COUNT(*) > 1 ";
        statement = dbManager.getConnection().createStatement();
        rs = statement.executeQuery(sqlQuery);

        //Then
        int counter = 0;
        while (rs.next()) {
            String firstname = rs.getString("USERS.FIRSTNAME");
            String lastname = rs.getString("USERS.LASTNAME");


            System.out.println(firstname + " " + lastname + " " );
            counter++;

            counter++;
        }
        int expected = count + 2;
        Assert.assertEquals(expected, counter);

        rs.close();
        statement.close();


    }
}