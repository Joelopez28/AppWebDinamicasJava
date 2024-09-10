package implementacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import conexion.Conexion;
import interfaces.IUsuario;
import modelo.Usuario;

public class UsuarioImpl implements IUsuario {

    @Override
    public List<Usuario> listarUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Connection conn = null;
        String sql = "SELECT * FROM usuarios";
        
        try {
            conn = Conexion.getConnection();
            try (Statement stmt = conn.createStatement(); ResultSet rs = stmt.executeQuery(sql)) {
                while (rs.next()) {
                    Usuario usuario = new Usuario();
                    usuario.setNombre(rs.getString("nombre_usuario"));
                    usuario.setFechaDeNacimiento(rs.getString("fecha_nacimiento"));
                    usuario.setRun(rs.getString("run"));
                    usuario.setTipo(rs.getString("tipo"));
                    usuarios.add(usuario);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
        return usuarios;
    }

    @Override
    public void registrarUsuario(Usuario usuario) {
        Connection conn = null;
        String sql = "INSERT INTO usuarios (nombre_usuario, fecha_nacimiento, run, tipo) VALUES (?, ?, ?, ?)";
        
        try {
            conn = Conexion.getConnection();
            try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
                pstmt.setString(1, usuario.getNombre());
                pstmt.setString(2, usuario.getFechaDeNacimiento());
                pstmt.setString(3, usuario.getRun());
                pstmt.setString(4, usuario.getTipo());
                pstmt.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
