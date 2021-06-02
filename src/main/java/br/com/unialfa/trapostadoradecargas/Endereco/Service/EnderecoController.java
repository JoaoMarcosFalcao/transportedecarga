package br.com.unialfa.trapostadoradecargas.Endereco.Service;

import br.com.unialfa.trapostadoradecargas.Endereco.Domain.Endereco;
import br.com.unialfa.trapostadoradecargas.Endereco.Business.EnderecoBusiness;
import br.com.unialfa.trapostadoradecargas.Endereco.Domain.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/endereco")
public class EnderecoController {



    @Autowired
    private EnderecoBusiness enderecoBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Endereco> listarEnderecos() {

        return enderecoBusiness.listarEnderecos();

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Endereco> buscarEnderecosPorid(@PathVariable(name = "id") long id){

        return enderecoBusiness.buscarEnderecosPorId(id);
    }

    @PostMapping(path = "/add")
    public void cadastrarEndereco( @RequestBody Endereco endereco ){

        enderecoBusiness.cadastrarEndereco(endereco);
    }

    @PutMapping(path = "/edit")
    public void editarEndereco( @RequestBody Endereco endereco ){

        enderecoBusiness.editarEndereco(endereco);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarEndereco(@PathVariable(name = "id") long id){

        enderecoBusiness.deletarEndereco(id);
    }
}
