package br.com.unialfa.trapostadoradecargas.Carga.Repository;

import br.com.unialfa.trapostadoradecargas.Carga.Domain.Carga;
import org.springframework.data.repository.CrudRepository;

public interface CargaRepository extends CrudRepository  <Carga, Long> {


}
