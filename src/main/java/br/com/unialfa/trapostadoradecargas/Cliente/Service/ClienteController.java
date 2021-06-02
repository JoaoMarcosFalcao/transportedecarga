package br.com.unialfa.trapostadoradecargas.Cliente.Service;

import br.com.unialfa.trapostadoradecargas.Cliente.Business.ClienteBusiness;
import br.com.unialfa.trapostadoradecargas.Cliente.Domain.Cliente;
import br.com.unialfa.trapostadoradecargas.Cliente.Domain.Cliente;
import br.com.unialfa.trapostadoradecargas.Cliente.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteBusiness clienteBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Cliente> listarClientes() {

        return clienteBusiness.listarClientes();

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Cliente> bucarClientesPorid(@PathVariable(name = "id") long id){

        return clienteBusiness.bucarClientesPorId(id);
    }


    @PostMapping(path = "/add")
    public void cadastrarCliente( @RequestBody Cliente cliente ){

        clienteBusiness.cadastrarCliente(cliente);
    }

    @PutMapping(path = "/edit")
    public void editarCliente( @RequestBody Cliente cliente ){

        clienteBusiness.editarCliente(cliente);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarCliente(@PathVariable(name = "id") long id){

        clienteBusiness.deletarCliente(id);
    }
}
