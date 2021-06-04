package br.com.unialfa.trapostadoradecargas.Viagem.Service;

import br.com.unialfa.trapostadoradecargas.Viagem.Domain.Viagem;
import br.com.unialfa.trapostadoradecargas.Viagem.Business.ViagemBusiness;
import br.com.unialfa.trapostadoradecargas.Viagem.Domain.Viagem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/viagem")
public class ViagemController {

    @Autowired
    private ViagemBusiness viagemBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Viagem> listarViagens() {

        return viagemBusiness.listarViagens();

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Viagem> buscarViagensPorid(@PathVariable(name = "id") long id){

        return viagemBusiness.buscarViagensPorId(id);
    }

    @PostMapping(path = "/add")
    public void cadastrarViagem( @RequestBody Viagem viagem ){

        viagemBusiness.cadastrarViagem(viagem);
    }

    @PutMapping(path = "/edit")
    public void editarViagem( @RequestBody Viagem viagem ){

        viagemBusiness.editarViagem(viagem);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarViagem(@PathVariable(name = "id") long id){

        viagemBusiness.deletarViagem(id);
    }
}
