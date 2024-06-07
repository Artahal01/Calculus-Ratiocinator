package interfaceDAO;

import entity.mensonge;

import java.util.List;
import java.sql.SQLException;
public abstract class mensongeDAO {

    public abstract void insertLie(mensonge mensonge) throws SQLException;

    public abstract List<mensonge> getAllLies() throws SQLException;
}
