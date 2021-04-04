package br.com.unialfa.trapostadoradecargas.Telefone.Service;

import br.com.unialfa.trapostadoradecargas.Telefone.Business.TelefoneBusiness;
import br.com.unialfa.trapostadoradecargas.Telefone.Domain.Telefone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/telefone")
public class TelefoneController {

    @Autowired
    private TelefoneBusiness telefoneBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Telefone> listarTelefone() {

        return telefoneBusiness.listarTelefone();
    }

    @PostMapping(path = "/add")
    public void cadastrarTelefone( @RequestBody Telefone telefone ){

        telefoneBusiness.cadastrarTelefone(telefone);
    }

    @PutMapping(path = "/edit")
    public void editarTelefone( @RequestBody Telefone telefone ){

        telefoneBusiness.editarTelefone(telefone);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarTelefone(@PathVariable(name = "id") long id){

        telefoneBusiness.deletarTelefone(id);
    }
}
