package com.mdc.DataBase;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Properties;
import java.util.logging.Logger;

public class MySqlConnection {
    MySqlConnection() throws IOException, SQLException {

        System.out.println("Connecting database...");

        try (Connection connection = MySqlConnection.getConnection()) {
            Statement statement = connection.createStatement();
            //Add in the database
            //statement.execute("INSERT INTO `employee`(`FirstName`,`LastName`,`Age`) VALUES ('Java','Insert','222')");

            listResults(statement.executeQuery("SELECT * FROM `employee`"));


            //Prepared Statement

            StringBuilder publisherQuery = new StringBuilder("SELECT * from `employee`");
            publisherQuery.append("WHERE `FirstName` = ?");

            PreparedStatement preparedStatement = connection.prepareStatement(publisherQuery.toString());

            preparedStatement.setString(1, "Demo");

            listResults(preparedStatement.executeQuery());
            statement.close();
            // connection.

            System.out.println("Database connected!");
        } catch (SQLException e) {
            Logger.getGlobal().severe(e.getMessage());
            //throw new IllegalStateException("Cannot connect the database!", e);
        }
    }

    /**
     * Gets a connection from the properties specified in the file database.properties.
     *
     * @return the database connection
     */

    public static Connection getConnection() throws SQLException, IOException {
        Properties props = new Properties();

        try (InputStream in = Files.newInputStream(Paths.get("src/com/mdc/DataBase/database.properties"))) {
            props.load(in);
        }
        String drivers = props.getProperty("jdbc.drivers");
        if (drivers != null) System.setProperty("jdbc.drivers", drivers);
        String url = props.getProperty("jdbc.url");
        if (url.length() == 0) {
            throw new SQLException("The url for database is missing");
        }
        String username = props.getProperty("jdbc.username");
        if (username.length() == 0) {
            throw new SQLException("The username for database is missing");
        }
        String password = props.getProperty("jdbc.password");
        return DriverManager.getConnection(url, username, password);

    }

    public void listResults(ResultSet results) throws SQLException {
        //Process the results
        while (results.next()) {
            StringBuilder line = new StringBuilder();
            line.append(results.getString("FirstName"));
            line.append(",");
            line.append(results.getString("LastName"));
            line.append(",");
            line.append(results.getInt("Age"));
            System.out.println(line);
        }
    }

}
