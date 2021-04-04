package br.com.unialfa.trapostadoradecargas.Viagem.Repository;

import br.com.unialfa.trapostadoradecargas.Viagem.Domain.Viagem;
import org.springframework.data.repository.CrudRepository;

public interface ViagemRepository extends CrudRepository<Viagem, Long> {
}
