package service;

;
import entity.mensonge;
import interfaceDAOImplementation.mensongeDAOImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class lieService {
    private mensongeDAOImpl mensongeDAO;

    // Constructor to initialize mensongeDAOImpl with a JDBC connection
    public lieService() throws SQLException {
        Connection connection = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/appointment", "postgres", "lahatra2004");
        this.mensongeDAO = new mensongeDAOImpl(connection);
    }

    public void useMensongeList() throws SQLException {
        List<mensonge> mensongeList = mensongeDAO.getAllLies();

        for (mensonge mensonge : mensongeList) {
            // Faites quelque chose avec chaque mensonge
            System.out.println(mensonge);
        }
    }
}
