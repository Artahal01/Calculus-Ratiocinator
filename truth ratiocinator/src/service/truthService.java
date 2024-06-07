package service;


import entity.Verite;
import interfaceDAOImplementation.veriteDAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class truthService {
    private final veriteDAOImpl veriteDAO;

    // Constructor to initialize mensongeDAOImpl with a JDBC connection
    public truthService() throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/appointment", "postgres", "lahatra2004");
        this.veriteDAO = new veriteDAOImpl(connection);
    }

    public void utiliserVeriteList() throws SQLException {
        List<Verite> veriteList = veriteDAO.getAllTruths();

        for (Verite verite : veriteList) {
            // Faites quelque chose avec chaque mensonge
            System.out.println(verite);
        }
    }
}