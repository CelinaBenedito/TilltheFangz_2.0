package TilltheFangz.api.application.port.out;

import TilltheFangz.api.domain.model.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepositoryPort {
    void salvar(Usuario usuario);
    Optional<Usuario> buscarPorId(Usuario usuario);
    Optional<Usuario> buscarPorLogin(Usuario usuario);
    Optional<Usuario> buscarPorEmail(Usuario usuario);
    Optional<Usuario> buscarPorNickname(Usuario usuario);
    List<Usuario> buscarTodos();
    Usuario atualizar(Usuario usuario);
    void remover(Usuario usuario);
}
