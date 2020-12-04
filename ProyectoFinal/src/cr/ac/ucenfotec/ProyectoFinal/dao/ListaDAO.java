package cr.ac.ucenfotec.ProyectoFinal.dao;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Lista;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ListaDAO {

    private final String TEMPLATE_CMD_INSERTAR = "insert into TLista(nombreLista,fechaCreacion,calificacion) " +
            "values (?,?,?)";

    private Connection cnx;
    private PreparedStatement cmdInsertar;

    public ListaDAO(Connection connection) {
        this.cnx = connection;
        try {
            this.cmdInsertar = cnx.prepareStatement(TEMPLATE_CMD_INSERTAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveLista(Lista nuevo) throws SQLException{
        if (this.cmdInsertar != null) {
            this.cmdInsertar.setString(1, nuevo.getNombreLista());
            this.cmdInsertar.setDate(2, convertToSqlDate(nuevo.getFechaCreacion()));
            this.cmdInsertar.setInt(3, nuevo.getCalificacion());
            this.cmdInsertar.execute();
        }
    }

    private java.sql.Date convertToSqlDate(java.util.Date fechaAConvertir){
        return new java.sql.Date(fechaAConvertir.getTime());
    }

}

