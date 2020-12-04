package cr.ac.ucenfotec.ProyectoFinal.dao;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Administrador;
import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.UsuarioFinal;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioFinalDAO {

    private final String TEMPLATE_CMD_INSERTAR = "insert into TUsuario(nombre,apellido1,apellido2,identificacion,paisProcedencia,edad,correoElectronico,foto,nombreUsuarioFinal,contrasenna) " +
            "values (?,?,?,?,?,?,?,?,?,?)";

    private Connection cnx;
    private PreparedStatement cmdInsertar;

    public UsuarioFinalDAO(Connection connection) {
        this.cnx = connection;
        try {
            this.cmdInsertar = cnx.prepareStatement(TEMPLATE_CMD_INSERTAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveUsuario(UsuarioFinal nuevo) throws SQLException{
        if (this.cmdInsertar != null) {
            this.cmdInsertar.setString(1, nuevo.getNombre());
            this.cmdInsertar.setString(2, nuevo.getApellido1());
            this.cmdInsertar.setString(3, nuevo.getApellido2());
            this.cmdInsertar.setString(4, nuevo.getIdentificacion());
            this.cmdInsertar.setString(5, nuevo.getPaisProcedencia());
            this.cmdInsertar.setInt(6, nuevo.getEdad());
            this.cmdInsertar.setString(7, nuevo.getCorreoElectronico());
            this.cmdInsertar.setString(8, nuevo.getFoto());
            this.cmdInsertar.setString(9, nuevo.getNombreUsuarioFinal());
            this.cmdInsertar.setString(10, nuevo.getContrasenna());
            this.cmdInsertar.execute();
        }
    }

}

