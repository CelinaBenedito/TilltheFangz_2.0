package TilltheFangz.api.adapters.output.persistence.entity;

import TilltheFangz.api.domain.model.Classe;
import TilltheFangz.api.domain.model.Genero;
import TilltheFangz.api.domain.model.Raca;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "personagem")
public class PersonagemEntity {
    @Id
    private UUID id;
    private String nome;
    private String apelido;
    private Integer idade;
    private Double peso;
    private Genero genero;
    private Raca raca;
    private Classe classe;
    private String historia;
    private String caracteristicas;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "usuario_id")
    private UsuarioEntity usuario;

    public PersonagemEntity() {
    }

    public PersonagemEntity(UUID id, String nome, String apelido, Integer idade, Double peso, Genero genero, Raca raca, Classe classe, String historia, String caracteristicas, UsuarioEntity usuario) {
        this.id = id;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
        this.peso = peso;
        this.genero = genero;
        this.raca = raca;
        this.classe = classe;
        this.historia = historia;
        this.caracteristicas = caracteristicas;
        this.usuario = usuario;
    }
}
