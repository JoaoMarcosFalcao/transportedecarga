package br.com.unialfa.trapostadoradecargas.Rota.Service;

import br.com.unialfa.trapostadoradecargas.Rota.Business.RotaBusiness;
import br.com.unialfa.trapostadoradecargas.Rota.Domain.Rota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/rota")
public class RotaController {

    @Autowired
    private RotaBusiness rotaBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Rota> listarRota() {

        return rotaBusiness.listarRota();
    }

    @PostMapping(path = "/add")
    public void cadastrarRota( @RequestBody Rota rota ){

        rotaBusiness.cadastrarRota(rota);
    }

    @PutMapping(path = "/edit")
    public void editarRota( @RequestBody Rota rota ){

        rotaBusiness.editarRota(rota);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarRota(@PathVariable(name = "id") long id){

        rotaBusiness.deletarRota(id);
    }
}
