package interfaceDAO;

import entity.Verite;
import entity.mensonge;

import java.sql.SQLException;
import java.util.List;

public abstract class veriteDAO {
    public abstract void insertTruth(Verite verite) throws SQLException;

    public List<Verite> getAllTruths() throws SQLException {
        return null;
    }
}
