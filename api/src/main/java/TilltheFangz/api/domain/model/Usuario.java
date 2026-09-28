package TilltheFangz.api.domain.model;

import TilltheFangz.api.domain.exception.EntidadeInvalidaException;
import TilltheFangz.api.domain.exception.EntidadeInativaException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
/**
* Classe que define o necessário para o usuario principal do sistema do TILL THE FANGZ
* */
public class Usuario {
    private UUID id;
    private String nome;
    private String sobrenome;
    private String nickname;
    private String email;
    private String celular;
    private Genero genero;
    private LocalDate dataNascimento;
    private Boolean ativo;
    private String senha;
    private List<Personagem> personagens = new ArrayList<>();

    public Usuario() {
    }

    public Usuario(UUID id, String nome, String sobrenome, String nickname, String email, String celular, Genero genero, LocalDate dataNascimento, Boolean ativo, String senha) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.nickname = nickname;
        this.email = email;
        this.celular = celular;
        this.genero = genero;
        this.dataNascimento = dataNascimento;
        this.ativo = ativo;
        this.senha = senha;
    }
    public void adicionarPersonagem(Personagem personagem) {
        this.personagens.add(personagem);
        personagem.setUsuario(this);
    }

    private boolean isAtivo(Boolean ativo) {
        if (ativo == null) {
            throw new EntidadeInvalidaException("Ativo não pode ser nulo");
        }
        return ativo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        if (id == null) {
            throw new EntidadeInvalidaException("ID não pode ser nulo");
        }
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()) {
            throw new EntidadeInvalidaException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        if (sobrenome == null || sobrenome.isEmpty()) {
            throw new EntidadeInvalidaException("Sobrenome não pode ser nulo ou vazio");
        }
        this.sobrenome = sobrenome;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        if (nickname == null || nickname.isEmpty()) {
            throw new EntidadeInvalidaException("Nickname não pode ser nulo ou vazio");
        }
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new EntidadeInvalidaException("Email não pode ser nulo ou vazio");
        }
        else if (email.length() > 255) {
            throw new EntidadeInvalidaException("Email não pode ter mais de 255 caracteres");
        }
        else if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new EntidadeInvalidaException("Email inválido");
        }
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        if (celular == null || celular.isEmpty()) {
            throw new EntidadeInvalidaException("Celular não pode ser nulo ou vazio");
        }
        for (char c : celular.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new EntidadeInvalidaException("Celular deve conter apenas números");
            }
        }
        int qtdChar = 0;
        for (int i =0; celular.length()>i; i++){
            qtdChar +=1;
        }

        if (qtdChar > 11) {
            throw new EntidadeInvalidaException("Celular deve conter no máximo 11 dígitos");
        }
        this.celular = celular;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        if (genero == null) {
            throw new EntidadeInvalidaException("Gênero não pode ser nulo");
        }
        if (genero != Genero.Mulher_cis &&
                genero != Genero.Mulher_trans &&
                genero != Genero.Homem_cis &&
                genero != Genero.Homem_trans &&
                genero != Genero.NaoBinario &&
                genero != Genero.GeneroFluido &&
                genero != Genero.Outro) {
            throw new EntidadeInvalidaException("Gênero não está em conformidade com os registrados");
        }
        this.genero = genero;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        if (dataNascimento == null || dataNascimento.isAfter(LocalDate.now())) {
            throw new EntidadeInvalidaException("Data de nascimento não pode ser nula ou posterior a data atual");
        }
        this.dataNascimento = dataNascimento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        if (ativo == null) {
            throw new IllegalArgumentException("Ativo não pode ser nulo");
        }
        this.ativo = ativo;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        if (senha == null || senha.isEmpty()) {
            throw new EntidadeInvalidaException("Senha não pode ser nula ou vazia");
        }
        this.senha = senha;
    }

    public List<Personagem> getPersonagens() {
        return personagens;
    }

    public void setPersonagens(List<Personagem> personagens) {
        this.personagens = personagens;
    }
}
