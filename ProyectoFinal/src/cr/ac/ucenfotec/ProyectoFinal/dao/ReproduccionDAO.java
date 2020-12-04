package cr.ac.ucenfotec.ProyectoFinal.dao;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Lista;
import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Reproduccion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class ReproduccionDAO {

    private final String TEMPLATE_CMD_INSERTAR = "insert into TReproduccion() " +
            "values ()";

    private Connection cnx;
    private PreparedStatement cmdInsertar;

    public ReproduccionDAO(Connection connection) {
        this.cnx = connection;
        try {
            this.cmdInsertar = cnx.prepareStatement(TEMPLATE_CMD_INSERTAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveReproduccion(Reproduccion nuevo) throws SQLException{
        if (this.cmdInsertar != null) {
            this.cmdInsertar.execute();
        }
    }

}