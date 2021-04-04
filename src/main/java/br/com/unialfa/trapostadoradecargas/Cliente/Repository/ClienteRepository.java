package br.com.unialfa.trapostadoradecargas.Cliente.Repository;

import br.com.unialfa.trapostadoradecargas.Cliente.Domain.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
