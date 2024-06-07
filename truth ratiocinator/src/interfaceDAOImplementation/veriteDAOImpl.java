package interfaceDAOImplementation;

import entity.Verite;
import entity.mensonge;
import interfaceDAO.veriteDAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class veriteDAOImpl extends veriteDAO {
    private Connection connection;

    // Constructor to initialize JDBC connection
    public veriteDAOImpl(Connection connection) {
        this.connection = connection;
    }
    private List<Verite> veriteList = new ArrayList<>();

    @Override
    public void insertTruth(Verite verite) throws SQLException {
        String sql = "INSERT INTO mensonge (mensonge) VALUES (?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setArray(1, verite.getVerite());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @Override
    public List<Verite> getAllTruths() throws SQLException {
        List<Verite> verites = new ArrayList<>();
        String sql = "SELECT * FROM verite";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(sql)) {
            while (resultSet.next()) {
                Verite verite = new Verite(
                        resultSet.getArray("verite")
                );
                verites.add(verite);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw e;
        }
        return verites;
    }
}
