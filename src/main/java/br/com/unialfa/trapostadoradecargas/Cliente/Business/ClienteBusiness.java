package br.com.unialfa.trapostadoradecargas.Cliente.Business;

import br.com.unialfa.trapostadoradecargas.Cliente.Domain.Cliente;
import br.com.unialfa.trapostadoradecargas.Cliente.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class ClienteBusiness {


    @Autowired
    private ClienteRepository clienteRepository;

    public Iterable<Cliente> listarClientes()
    {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> bucarClientesPorId(long id)
    {
        return clienteRepository.findById(id);
    }

    public void cadastrarCliente(Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public void editarCliente (Cliente cliente) {
        clienteRepository.save(cliente);
    }

    public @ResponseBody
    void deletarCliente (long id ) {
        clienteRepository.deleteById(id);
    }
}
