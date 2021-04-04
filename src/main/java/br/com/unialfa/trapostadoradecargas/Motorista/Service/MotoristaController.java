package br.com.unialfa.trapostadoradecargas.Motorista.Service;

import br.com.unialfa.trapostadoradecargas.Motorista.Business.MotoristaBusiness;
import br.com.unialfa.trapostadoradecargas.Motorista.Domain.Motorista;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/motorista")
public class MotoristaController {

    @Autowired
    private MotoristaBusiness motoristaBusiness;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public Iterable<Motorista> listarMotorista() {

        return motoristaBusiness.listarMotorista();
    }

    @PostMapping(path = "/add")
    public void cadastrarMotorista( @RequestBody Motorista motorista ){

        motoristaBusiness.cadastrarMotorista(motorista);
    }

    @PutMapping(path = "/edit")
    public void editarMotorista( @RequestBody Motorista motorista ){

        motoristaBusiness.editarMotorista(motorista);
    }

    @DeleteMapping(value = "/delete/{id}")
    public @ResponseBody void deletarMotorista(@PathVariable(name = "id") long id){

        motoristaBusiness.deletarMotorista(id);
    }
}
