package cr.ac.ucenfotec.ProyectoFinal.dao;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Compositor;
import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Genero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class GeneroDAO {

    private final String TEMPLATE_CMD_INSERTAR = "insert into TGenero(nombreGenero) " +
            "values (?)";

    private Connection cnx;
    private PreparedStatement cmdInsertar;

    public GeneroDAO(Connection connection) {
        this.cnx = connection;
        try {
            this.cmdInsertar = cnx.prepareStatement(TEMPLATE_CMD_INSERTAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveGenero(Genero nuevo) throws SQLException{
        if (this.cmdInsertar != null) {
            this.cmdInsertar.setString(1, nuevo.getNombreGenero());
            this.cmdInsertar.execute();
        }
    }
}
