package br.com.unialfa.trapostadoradecargas.Telefone.Business;

import br.com.unialfa.trapostadoradecargas.Telefone.Domain.Telefone;
import br.com.unialfa.trapostadoradecargas.Telefone.Domain.Telefone;
import br.com.unialfa.trapostadoradecargas.Telefone.Repository.TelefoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class TelefoneBusiness {

    @Autowired
    private TelefoneRepository telefoneRepository;

    public Iterable<Telefone> listarTelefones()
    {
        return telefoneRepository.findAll();
    }

    public Optional<Telefone> buscarTelefonesPorId(long id)
    {
        return telefoneRepository.findById(id);
    }

    public void cadastrarTelefone(Telefone telefone) {
        telefoneRepository.save(telefone);
    }

    public void editarTelefone (Telefone telefone) {
        telefoneRepository.save(telefone);
    }

    public @ResponseBody
    void deletarTelefone (long id ) {
        telefoneRepository.deleteById(id);
    }

}
