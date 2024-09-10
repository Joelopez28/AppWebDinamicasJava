package interfaces;

import java.util.List;

import modelo.Cliente;

public interface ICliente {
		List<Cliente> listarClientes();
	    void registrarCliente(Cliente cliente);
}
