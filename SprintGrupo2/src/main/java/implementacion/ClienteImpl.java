package implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import interfaces.ICliente;
import modelo.Cliente;

public class ClienteImpl implements ICliente{

	@Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        Connection conn = null;
        String sql = "SELECT * FROM clientes";
        
        try {
            conn = Conexion.getConnection();
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                	Cliente cliente = new Cliente();
                    cliente.setNombreCliente(rs.getString("nombre_cliente"));
                    cliente.setApellidoCliente(rs.getString("apellido_cliente"));
                    cliente.setTelefono(rs.getString("telefono"));
                    cliente.setDireccion(rs.getString("direccion"));
                    cliente.setEdad(rs.getString("edad"));
                    clientes.add(cliente);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return clientes;
    }

    @Override
    public void registrarCliente(Cliente cliente) {
        Connection conn = null;
        String sql = "INSERT INTO clientes (nombre_cliente, apellido_cliente, telefono, direccion, edad) VALUES (?, ?, ?, ?, ?)";
        
        try {
            conn = Conexion.getConnection();
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, cliente.getNombreCliente());
                pstmt.setString(2, cliente.getApellidoCliente());
                pstmt.setString(3, cliente.getTelefono());
                pstmt.setString(4, cliente.getDireccion());
                pstmt.setString(5, cliente.getEdad());
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
    }
}