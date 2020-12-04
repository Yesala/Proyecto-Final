package cr.ac.ucenfotec.ProyectoFinal.dao;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Compositor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CompositorDAO {

    private final String TEMPLATE_CMD_INSERTAR = "insert into TCompositor(nombre,apellido1,apellido2,paisNacimiento,edad,genero) " +
            "values (?,?,?,?,?,?)";

    private Connection cnx;
    private PreparedStatement cmdInsertar;

    public CompositorDAO(Connection connection) {
        this.cnx = connection;
        try {
            this.cmdInsertar = cnx.prepareStatement(TEMPLATE_CMD_INSERTAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveCompositor(Compositor nuevo) throws SQLException{
        if (this.cmdInsertar != null) {
            this.cmdInsertar.setString(1, nuevo.getNombre());
            this.cmdInsertar.setString(2, nuevo.getApellido1());
            this.cmdInsertar.setString(3, nuevo.getApellido2());
            this.cmdInsertar.setString(4, nuevo.getPaisNacimiento());
            this.cmdInsertar.setInt(5, nuevo.getEdad());
            this.cmdInsertar.setString(6, nuevo.getGenero().getNombreGenero());
            this.cmdInsertar.execute();
        }
    }

}
