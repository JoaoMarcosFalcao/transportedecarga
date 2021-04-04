package br.com.unialfa.trapostadoradecargas.Motorista.Business;

import br.com.unialfa.trapostadoradecargas.Motorista.Domain.Motorista;
import br.com.unialfa.trapostadoradecargas.Motorista.Repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class MotoristaBusiness {

    @Autowired
    private MotoristaRepository motoristaRepository;

    public Iterable<Motorista> listarMotorista() {
        return motoristaRepository.findAll();
    }

    public void cadastrarMotorista(Motorista motorista) {
        motoristaRepository.save(motorista);
    }

    public void editarMotorista (Motorista motorista) {
        motoristaRepository.save(motorista);
    }

    public @ResponseBody
    void deletarMotorista (long id ) {
        motoristaRepository.deleteById(id);
    }
}

