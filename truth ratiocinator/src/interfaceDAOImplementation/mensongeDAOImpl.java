package interfaceDAOImplementation;
import interfaceDAO.mensongeDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import entity.mensonge;
public class mensongeDAOImpl extends mensongeDAO {
    private Connection connection;

    // Constructor to initialize JDBC connection
    public mensongeDAOImpl(Connection connection) {
        this.connection = connection;
    }
    private List<mensonge> mensongeList = new ArrayList<>();

    public List<mensonge> getMensongeList() {
        return mensongeList;
    }

    @Override
    public void insertLie(mensonge mensonge) throws SQLException {
        String sql = "INSERT INTO mensonge (mensonge) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setArray(1, mensonge.getMensonge());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<mensonge> getAllLies() throws SQLException {
        List<mensonge> mensonges = new ArrayList<>();
        String sql = "SELECT * FROM mensonge";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                mensonge mensonge = new mensonge(
                        resultSet.getArray("mensonge")
                );
                mensonges.add(mensonge);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return mensonges;
    }
}
