package br.com.unialfa.trapostadoradecargas.Veiculo.Service;

import br.com.unialfa.trapostadoradecargas.Veiculo.Domain.Veiculo;
import br.com.unialfa.trapostadoradecargas.Veiculo.Business.VeiculoBusiness;
import br.com.unialfa.trapostadoradecargas.Veiculo.Domain.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping(path = "/api/veiculo")
public class VeiculoController {
    
    @Autowired
    private VeiculoBusiness veiculoBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Veiculo> listarVeiculos() {

        return veiculoBusiness.listarVeiculos();

    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<Veiculo> buscarVeiculosPorid(@PathVariable(name = "id") long id){

        return veiculoBusiness.buscarVeiculosPorId(id);
    }

    @PostMapping(path = "/add")
    public void cadastrarVeiculo( @RequestBody Veiculo veiculo ){

        veiculoBusiness.cadastrarVeiculo(veiculo);
    }

    @PutMapping(path = "/edit")
    public void editarVeiculo( @RequestBody Veiculo veiculo ){

        veiculoBusiness.editarVeiculo(veiculo);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarVeiculo(@PathVariable(name = "id") long id){

        veiculoBusiness.deletarVeiculo(id);
    }
}
