package TilltheFangz.api.domain.model.jogabilidade;

import TilltheFangz.api.domain.model.enums.*;

import java.util.List;
import java.util.UUID;

public class Item {
    private UUID id;
    private String nome;
    private String descricao;
    private Double peso;
    private Integer quantidade;
    private Double nivel;
    private TipoUso  tipoUso;
    private Elemento elemento;
    private List<Ataque> ataques;
    private TipoDano tipoDano;
    private Integer valorBaseDano;
    private EfeitoStatus efeitoStatus;
    private TipoEfeito tipoEfeito;
    private Integer valorBaseEfeito;
    private Integer qtdDados;
    private Integer valorDado;
    private String imagem;
}
