package cr.ac.ucenfotec.ProyectoFinal.dao;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Album;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AlbumDAO {

    private final String TEMPLATE_CMD_INSERTAR = "insert into TAlbum(nombreAlbum,fechaLanzamiento,imagen,artista) " +
            "values (?,?,?,?)";

    private Connection cnx;
    private PreparedStatement cmdInsertar;

    public AlbumDAO(Connection connection) {
        this.cnx = connection;
        try {
            this.cmdInsertar = cnx.prepareStatement(TEMPLATE_CMD_INSERTAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAlbum(Album nuevo) throws SQLException{
        if (this.cmdInsertar != null) {
            this.cmdInsertar.setString(1, nuevo.getNombreAlbum());
            this.cmdInsertar.setDate(2, convertToSqlDate(nuevo.getFechaLanzamiento()));
            this.cmdInsertar.setString(3, nuevo.getImagen());
            this.cmdInsertar.setString(4, nuevo.getArtista().getNombre());
            this.cmdInsertar.execute();
        }
    }

    private java.sql.Date convertToSqlDate(java.util.Date fechaAConvertir){
        return new java.sql.Date(fechaAConvertir.getTime());
    }
}

