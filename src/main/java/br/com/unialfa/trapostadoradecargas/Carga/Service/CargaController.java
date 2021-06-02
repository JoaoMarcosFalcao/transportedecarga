package br.com.unialfa.trapostadoradecargas.Carga.Service;

import br.com.unialfa.trapostadoradecargas.Carga.Business.CargaBusiness;
import br.com.unialfa.trapostadoradecargas.Carga.Domain.Carga;
import br.com.unialfa.trapostadoradecargas.Cliente.Domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/carga")
public class CargaController {

    @Autowired
    private CargaBusiness cargaBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Carga> listarCargas() {

        return cargaBusiness.listarCargas();

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Carga> buscarCargasPorid(@PathVariable(name = "id") long id){

        return cargaBusiness.buscarCargasPorId(id);
    }

    @PostMapping(path = "/add")
    public void cadastrarCarga( @RequestBody Carga carga ){

        cargaBusiness.cadastrarCarga(carga);
    }

    @PutMapping(path = "/edit")
    public void editarCarga( @RequestBody Carga carga ){

        cargaBusiness.editarCarga(carga);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarCarga(@PathVariable(name = "id") long id){

        cargaBusiness.deletarCarga(id);
    }

}



