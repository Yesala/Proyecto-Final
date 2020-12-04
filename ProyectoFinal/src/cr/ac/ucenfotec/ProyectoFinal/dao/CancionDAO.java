package cr.ac.ucenfotec.ProyectoFinal.dao;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Artista;
import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Cancion;
import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Genero;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class CancionDAO {

    private final String TEMPLATE_CMD_INSERTAR = "insert into TCancion(nombreCancion,nombreArtista) " +
            "values (?,?)";

    private Connection cnx;
    private PreparedStatement cmdInsertar;

    public CancionDAO(Connection connection) {
        this.cnx = connection;
        try {
            this.cmdInsertar = cnx.prepareStatement(TEMPLATE_CMD_INSERTAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveCancion(Cancion nuevo) throws SQLException{
        if (this.cmdInsertar != null) {
            this.cmdInsertar.setString(1, nuevo.getNombreCancion());
            this.cmdInsertar.setString(2, nuevo.getArtista().getNombre());
            this.cmdInsertar.execute();
        }
    }
}

/*
Connection cnx;

    public CancionDAO(Connection conexion){
        this.cnx = conexion;
    }

    public CancionDAO() {

    }

    public void saveCancion(Cancion nuevo) throws SQLException {
        Statement stmt = cnx.createStatement();
        String insertQuery = "Insert into TCancion(nombreCancion,nombreArtista) values ('";
        insertQuery += nuevo.getNombreCancion();
        insertQuery += "','";
        insertQuery += nuevo.getArtista().getNombre();
        insertQuery += "')";
        stmt.execute(insertQuery);
    }
 */
