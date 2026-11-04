package TilltheFangz.api.domain.model.jogabilidade;

import TilltheFangz.api.domain.model.enums.Elemento;

import java.util.List;
import java.util.UUID;

public class Item {
    private UUID id;
    private String nome;
    private String descricao;
    private Double peso;
    private Elemento elemento;
    private Double nivel;
    private String imagem;
    private List<Ataque> ataques;
}
