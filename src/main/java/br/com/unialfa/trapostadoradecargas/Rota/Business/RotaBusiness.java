package br.com.unialfa.trapostadoradecargas.Rota.Business;

import br.com.unialfa.trapostadoradecargas.Rota.Domain.Rota;
import br.com.unialfa.trapostadoradecargas.Rota.Domain.Rota;
import br.com.unialfa.trapostadoradecargas.Rota.Repository.RotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class RotaBusiness {
    
    @Autowired
    private RotaRepository rotaRepository;

    public Iterable<Rota> listarRotas()
    {
        return rotaRepository.findAll();
    }

    public Optional<Rota> buscarRotasPorId(long id)
    {
        return rotaRepository.findById(id);
    }
    public void cadastrarRota(Rota rota) {
        rotaRepository.save(rota);
    }

    public void editarRota (Rota rota) {
        rotaRepository.save(rota);
    }

    public @ResponseBody
    void deletarRota (long id ) {
        rotaRepository.deleteById(id);
    }
}

