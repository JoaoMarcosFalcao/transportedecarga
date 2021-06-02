package br.com.unialfa.trapostadoradecargas.Motorista.Business;

import br.com.unialfa.trapostadoradecargas.Motorista.Domain.Motorista;
import br.com.unialfa.trapostadoradecargas.Motorista.Domain.Motorista;
import br.com.unialfa.trapostadoradecargas.Motorista.Repository.MotoristaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class MotoristaBusiness {

    @Autowired
    private MotoristaRepository motoristaRepository;

    public Iterable<Motorista> listarMotoristas()
    {
        return motoristaRepository.findAll();
    }

    public Optional<Motorista> buscarMotoristasPorId(long id)
    {
        return motoristaRepository.findById(id);
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

