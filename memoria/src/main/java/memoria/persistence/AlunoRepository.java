package memoria.persistence;

import java.util.Optional;

import modelo.entidade.Aluno;
import persistence.IAlunoRepository;

public class AlunoRepository implements IAlunoRepository {

  @Override
  public Optional<Aluno> findByCpf(String cpf) {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'findByCpf'");
  }
  
}
