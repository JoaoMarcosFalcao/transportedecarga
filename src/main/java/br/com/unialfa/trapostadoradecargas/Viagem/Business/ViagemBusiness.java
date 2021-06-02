package br.com.unialfa.trapostadoradecargas.Viagem.Business;

import br.com.unialfa.trapostadoradecargas.Viagem.Domain.Viagem;
import br.com.unialfa.trapostadoradecargas.Viagem.Domain.Viagem;
import br.com.unialfa.trapostadoradecargas.Viagem.Repository.ViagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class ViagemBusiness {

    @Autowired
    private ViagemRepository viagemRepository;

    public Iterable<Viagem> listarViagens()
    {
        return viagemRepository.findAll();
    }

    public Optional<Viagem> buscarViagensPorId(long id)
    {
        return viagemRepository.findById(id);
    }

    public void cadastrarViagem(Viagem viagem) {
        viagemRepository.save(viagem);
    }

    public void editarViagem (Viagem viagem) {
        viagemRepository.save(viagem);
    }

    public @ResponseBody
    void deletarViagem (long id ) {
        viagemRepository.deleteById(id);
    }
}

