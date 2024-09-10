package interfaces;

import java.util.List;

import modelo.Capacitacion;
import modelo.Usuario;

public interface IUsuario {
	List<Usuario> listarUsuarios();
    void registrarUsuario(Usuario usuario);
}
