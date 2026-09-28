package TilltheFangz.api.application.port.out;

import TilltheFangz.api.domain.model.Personagem;
import TilltheFangz.api.domain.model.Usuario;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PersonagemRepositoryPort {

    void salvar(Personagem personagem);
    void atualizar(Personagem personagem);
    void remover(Personagem personagem);
    Optional<Personagem> buscarPorId(Integer id);
    Optional<Personagem> buscarPorNome(String nome);
    Optional<Personagem> buscarPorUsuario(Usuario usuario);
    List<Personagem> buscarTodos();
    List<Personagem> buscarTodosPorUsuario(Usuario usuario);
    List<Personagem> buscarPorUsuarioId(UUID usuarioId);
}
