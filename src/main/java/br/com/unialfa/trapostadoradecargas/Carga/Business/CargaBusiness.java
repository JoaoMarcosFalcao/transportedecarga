package br.com.unialfa.trapostadoradecargas.Carga.Business;

import br.com.unialfa.trapostadoradecargas.Carga.Domain.Carga;
import br.com.unialfa.trapostadoradecargas.Carga.Repository.CargaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class CargaBusiness {

    @Autowired
    private CargaRepository cargaRepository;

    public Iterable<Carga> listarCarga() {
        return cargaRepository.findAll();
    }

    public void cadastrarCarga(Carga carga) {
        cargaRepository.save(carga);
    }

    public void editarCarga (Carga carga) {
        cargaRepository.save(carga);
    }

    public @ResponseBody
    void deletarCarga (long id ) {
        cargaRepository.deleteById(id);
    }
}
