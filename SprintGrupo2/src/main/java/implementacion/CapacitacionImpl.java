package implementacion;

import interfaces.ICapacitacion;
import modelo.Capacitacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;

public class CapacitacionImpl implements ICapacitacion {
   // private static List<Capacitacion> capacitaciones = new ArrayList<>();

    @Override
    public List<Capacitacion> listarCapacitaciones() {
        List<Capacitacion> capacitaciones = new ArrayList<>();
        
        Connection conn = Conexion.getConnection();
        String sql = "SELECT * FROM capacitaciones";
        
        System.out.println(conn);
        
        try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Capacitacion capacitacion = new Capacitacion();
                capacitacion.setNombreCapacitacion(rs.getString("nombre"));
                capacitacion.setDetalle(rs.getString("detalle"));
                capacitaciones.add(capacitacion);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return capacitaciones;
    }

    @Override
    public void registrarCapacitacion(Capacitacion capacitacion) {
    	
        Connection conn = Conexion.getConnection();
        String sql = "INSERT INTO capacitaciones (nombre, detalle) VALUES (?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, capacitacion.getNombreCapacitacion());
            pstmt.setString(2, capacitacion.getDetalle());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
	}
}


