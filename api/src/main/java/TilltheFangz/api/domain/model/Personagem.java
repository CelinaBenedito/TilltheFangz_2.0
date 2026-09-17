package TilltheFangz.api.domain.model;

import TilltheFangz.api.domain.exception.EntidadeInvalidaException;

import java.util.UUID;

public class Personagem {
    UUID id;
    Usuario usuario;
    String nome;
    String apelido;
    Integer idade;
    Double peso;
    Genero genero;
    Raca raca;
    Classe classe;
    String historia;
    String caracteristicas;

    public Personagem(UUID id, Usuario usuario, String nome, String apelido, Integer idade, Double peso, Genero genero, Raca raca, Classe classe, String historia, String caracteristicas) {
        this.id = id;
        this.usuario = usuario;
        this.nome = nome;
        this.apelido = apelido;
        this.idade = idade;
        this.peso = peso;
        this.genero = genero;
        this.raca = raca;
        this.classe = classe;
        this.historia = historia;
        this.caracteristicas = caracteristicas;
    }

    public Personagem() {
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
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

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        if (apelido == null || apelido.isEmpty()) {
            throw new EntidadeInvalidaException("Apelido não pode ser nulo ou vazio");
        }
        this.apelido = apelido;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        if (idade == null || idade < 0) {
            throw new EntidadeInvalidaException("Idade não pode ser nula ou negativa");
        }
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        if (peso == null || peso < 0) {
            throw new EntidadeInvalidaException("Peso não pode ser nulo ou negativo");
        }
        this.peso = peso;
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

    public Raca getRaca() {
        return raca;
    }

    public void setRaca(Raca raca) {
        if ((raca != Raca.Humano && raca != Raca.Vampiro)){
            throw new EntidadeInvalidaException("Raça inválida");
        }
        this.raca = raca;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        if (classe != Classe.Cacador
                && classe != Classe.Senhor_das_Sombras
                && classe != Classe.Barbaro
                && classe != Classe.Ilusionista
                && classe != Classe.Cultista
                && classe != Classe.Iluminado
                && classe != Classe.Flagelador
                && classe != Classe.Canibal
                && classe != Classe.Nenhuma){
            throw new EntidadeInvalidaException("Classe inválida");
        }
        this.classe = classe;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        if (historia == null || historia.isEmpty() || historia.equals("null") || historia.length()>500) {
            throw new EntidadeInvalidaException("História não pode ser nula, vazia, 'null' ou maior que 500 caracteres");
        }
        this.historia = historia;
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(String caracteristicas) {
        if (caracteristicas == null || caracteristicas.isEmpty() || caracteristicas.equals("null") || caracteristicas.length()>150) {
            throw new EntidadeInvalidaException("Características não podem ser nulas, vazias, 'null' ou maiores que 150 caracteres");
        }
        this.caracteristicas = caracteristicas;
    }
}
