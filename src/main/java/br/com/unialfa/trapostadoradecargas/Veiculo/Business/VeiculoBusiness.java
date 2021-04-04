package br.com.unialfa.trapostadoradecargas.Veiculo.Business;

import br.com.unialfa.trapostadoradecargas.Veiculo.Domain.Veiculo;
import br.com.unialfa.trapostadoradecargas.Veiculo.Repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public class VeiculoBusiness {


    @Autowired
    private VeiculoRepository veiculoRepository;

    public Iterable<Veiculo> listarVeiculo() {
        return veiculoRepository.findAll();
    }

    public void cadastrarVeiculo(Veiculo veiculo) {
        veiculoRepository.save(veiculo);
    }

    public void editarVeiculo (Veiculo veiculo) {
        veiculoRepository.save(veiculo);
    }

    public @ResponseBody
    void deletarVeiculo (long id ) {
        veiculoRepository.deleteById(id);
    }
}

