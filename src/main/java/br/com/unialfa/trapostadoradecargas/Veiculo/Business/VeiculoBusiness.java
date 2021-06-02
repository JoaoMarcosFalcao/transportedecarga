package br.com.unialfa.trapostadoradecargas.Veiculo.Business;

import br.com.unialfa.trapostadoradecargas.Veiculo.Domain.Veiculo;
import br.com.unialfa.trapostadoradecargas.Veiculo.Domain.Veiculo;
import br.com.unialfa.trapostadoradecargas.Veiculo.Repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Optional;

@Service
public class VeiculoBusiness {


    @Autowired
    private VeiculoRepository veiculoRepository;

    public Iterable<Veiculo> listarVeiculos()
    {
        return veiculoRepository.findAll();
    }

    public Optional<Veiculo> buscarVeiculosPorId(long id)
    {
        return veiculoRepository.findById(id);
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

