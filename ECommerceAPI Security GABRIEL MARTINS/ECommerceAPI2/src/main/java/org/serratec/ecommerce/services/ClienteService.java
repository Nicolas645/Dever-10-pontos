package org.serratec.ecommerce.services;

import java.io.IOException;
import java.util.List;

import org.serratec.ecommerce.dtos.ClienteDTO;
import org.serratec.ecommerce.dtos.ClienteInserirDTO;
import org.serratec.ecommerce.entities.Cliente;
import org.springframework.web.multipart.MultipartFile;

public interface ClienteService {
    
	public ClienteDTO inserir(ClienteInserirDTO clienteInserirDTO);

    List<ClienteDTO> listarClientes();

    ClienteDTO buscarClientePorId(Long id);

    Cliente atualizarCliente(Long id, Cliente clienteAtualizado);

    void deletarCliente(Long id);

    ClienteDTO inserirComFoto(Cliente cliente, MultipartFile file) throws IOException;
}
