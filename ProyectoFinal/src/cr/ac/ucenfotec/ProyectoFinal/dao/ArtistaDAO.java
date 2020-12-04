package cr.ac.ucenfotec.ProyectoFinal.dao;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Administrador;
import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Artista;

import java.sql.Connection;;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ArtistaDAO {

    private final String TEMPLATE_CMD_INSERTAR = "insert into TArtista(nombre,apellido1,apellido2,alias,paisnacimiento,fechaNacimiento,fechaDefuncion,edad,genero,referencias) " +
            "values (?,?,?,?,?,?,?,?,?,?)";

    private Connection cnx;
    private PreparedStatement cmdInsertar;

    public ArtistaDAO(Connection connection) {
        this.cnx = connection;
        try {
            this.cmdInsertar = cnx.prepareStatement(TEMPLATE_CMD_INSERTAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveArtista(Artista nuevo) throws SQLException{
        if (this.cmdInsertar != null) {
            this.cmdInsertar.setString(1, nuevo.getNombre());
            this.cmdInsertar.setString(2, nuevo.getApellido1());
            this.cmdInsertar.setString(3, nuevo.getApellido2());
            this.cmdInsertar.setString(4, nuevo.getAlias());
            this.cmdInsertar.setString(5, nuevo.getPaisNacimiento());
            this.cmdInsertar.setDate(6, convertToSqlDate(nuevo.getFechaNacimiento()));
            this.cmdInsertar.setDate(7, nuevo.getFechaDefuncion() == null ? null : convertToSqlDate(nuevo.getFechaDefuncion()));
            this.cmdInsertar.setInt(8, nuevo.getEdad());
            this.cmdInsertar.setString(9, nuevo.getGenero().getNombreGenero());
            this.cmdInsertar.setString(10, nuevo.getReferencias());
            this.cmdInsertar.execute();
        }
    }

    private java.sql.Date convertToSqlDate(java.util.Date fechaAConvertir){
        return new java.sql.Date(fechaAConvertir.getTime());
    }
}

