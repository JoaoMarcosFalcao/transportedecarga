package br.com.unialfa.trapostadoradecargas.Telefone.Repository;

import br.com.unialfa.trapostadoradecargas.Telefone.Domain.Telefone;
import org.springframework.data.repository.CrudRepository;

public interface TelefoneRepository extends CrudRepository<Telefone, Long> {
}
