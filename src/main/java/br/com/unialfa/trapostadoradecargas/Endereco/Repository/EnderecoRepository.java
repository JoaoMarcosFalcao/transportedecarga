package br.com.unialfa.trapostadoradecargas.Endereco.Repository;

import br.com.unialfa.trapostadoradecargas.Endereco.Domain.Endereco;
import org.springframework.data.repository.CrudRepository;

public interface EnderecoRepository extends CrudRepository <Endereco, Long> {
}
