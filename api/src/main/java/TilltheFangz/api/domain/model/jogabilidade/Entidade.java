package TilltheFangz.api.domain.model.jogabilidade;

import TilltheFangz.api.domain.model.enums.Genero;
import TilltheFangz.api.domain.model.enums.Raca;

import java.util.ArrayList;
import java.util.UUID;

public class Entidade {
    private UUID id;
    private String nome;
    private String descricao;
    private Double peso;
    private Double nivel;
    private String imagem;
    private Pontos pontos;
    private Inventario inventario;
    private Genero genero;
    private ArrayList<Ataque> ataques;
    private Raca raca;
}
