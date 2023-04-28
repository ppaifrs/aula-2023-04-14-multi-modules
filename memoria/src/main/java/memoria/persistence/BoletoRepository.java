package memoria.persistence;

import java.util.List;

import modelo.entidade.Boleto;
import persistence.IBoletoRepository;

public class BoletoRepository implements IBoletoRepository {

  @Override
  public List<Boleto> findBoletosByCpf(String cpf) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findBoletosByCpf'");
  }
  
}
