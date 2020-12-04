package cr.ac.ucenfotec.ProyectoFinal.dao;

import cr.ac.ucenfotec.ProyectoFinal.bl.entidades.Administrador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AdministradorDAO {

    private final String TEMPLATE_CMD_INSERTAR = "insert into TAdministrador(nombre,apellido1,apellido2,nombreUsuario,contrasenna,foto,correoElectronico) " +
            "values (?,?,?,?,?,?,?)";

    private Connection cnx;
    private PreparedStatement cmdInsertar;

    public AdministradorDAO(Connection connection) {
        this.cnx = connection;
        try {
            this.cmdInsertar = cnx.prepareStatement(TEMPLATE_CMD_INSERTAR);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void saveAdministrador(Administrador nuevo) throws SQLException{
        if (this.cmdInsertar != null) {
            this.cmdInsertar.setString(1, nuevo.getNombre());
            this.cmdInsertar.setString(2, nuevo.getApellido1());
            this.cmdInsertar.setString(3, nuevo.getApellido2());
            this.cmdInsertar.setString(4, nuevo.getNombreUsuario());
            this.cmdInsertar.setString(5, nuevo.getContrasenna());
            this.cmdInsertar.setString(6, nuevo.getFoto());
            this.cmdInsertar.setString(7, nuevo.getCorreoElectronico());
            this.cmdInsertar.execute();
        }
    }

}
