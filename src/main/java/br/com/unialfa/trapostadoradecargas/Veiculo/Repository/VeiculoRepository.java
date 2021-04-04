package br.com.unialfa.trapostadoradecargas.Veiculo.Repository;

import br.com.unialfa.trapostadoradecargas.Veiculo.Domain.Veiculo;
import org.springframework.data.repository.CrudRepository;

public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {
}
