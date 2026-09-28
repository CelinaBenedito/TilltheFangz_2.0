package TilltheFangz.api.adapters.output.persistence.entity;

import TilltheFangz.api.domain.model.Genero;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.aspectj.lang.annotation.Before;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class UsuarioEntity {

    @Id
    private UUID id;
    @NotNull
    private String nome;
    @NotNull
    private String sobrenome;
    private String nickname;
    @NotNull
    @Email
    private String email;
    @NotNull
    @Size(min = 11, max = 11)
    private String celular;
    @NotNull
    private Genero genero;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private Boolean ativo;
    @NotNull
    private String senha;
    @OneToMany
    private List<PersonagemEntity> personagens = new ArrayList<>();
}