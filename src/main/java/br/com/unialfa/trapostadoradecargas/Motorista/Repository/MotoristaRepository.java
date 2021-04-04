package br.com.unialfa.trapostadoradecargas.Motorista.Repository;

import br.com.unialfa.trapostadoradecargas.Motorista.Domain.Motorista;
import org.springframework.data.repository.CrudRepository;

public interface MotoristaRepository extends CrudRepository<Motorista, Long> {
}
