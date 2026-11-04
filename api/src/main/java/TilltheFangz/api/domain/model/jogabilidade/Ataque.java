package TilltheFangz.api.domain.model.jogabilidade;

import TilltheFangz.api.domain.exception.EntidadeInvalidaException;
import TilltheFangz.api.domain.exception.EntidadeNaoEncontradaException;
import TilltheFangz.api.domain.model.enums.EfeitoStatus;
import TilltheFangz.api.domain.model.enums.Elemento;
import TilltheFangz.api.domain.model.enums.TipoDano;
import TilltheFangz.api.domain.model.enums.TipoEfeito;

public class Ataque {
    private String nome; //Exemplo: Mordida Vampirica
    private String descricao; //Exemplo: Uma mordida profunda que tira o sangue do alvo e cura o usuário
    private TipoDano tipoDano; //Exemplo: PERFURANTE
    private Integer valorDano; //Exemplo: 10 = 10 de dano base
    private TipoEfeito tipoEfeitoAlvo; //Exemplo: DANO
    private Integer valorEfeitoAlvo; // Exemplo: 10 = 10 de dano
    private TipoEfeito tipoEfeitoUsuario; //Exemplo: CURA
    private Integer valorEfeitoUsuario; //Exemplo: 10 = 10 de cura
    private Elemento elemento; //Exemplo: SANGUE
    private Integer valorElemento; //Exemplo: 10 = 10
    private EfeitoStatus efeitoStatus; //Exemplo: SANGRANDO
    private Integer tempoEmMinutosEfeitoStatus; // 20 = 20 minutos com os efeitos no personagem
    private Integer valorDado; //Exemplo: 20 = d20
    private Integer qtdDado; //Exemplo: 2 = 2d20

    public Ataque(String nome, String descricao, TipoDano tipoDano, Integer valorDano, TipoEfeito tipoEfeitoAlvo, Integer valorEfeitoAlvo, TipoEfeito tipoEfeitoUsuario, Integer valorEfeitoUsuario, Elemento elemento, Integer valorElemento, EfeitoStatus efeitoStatus, Integer tempoEmMinutosEfeitoStatus, Integer valorDado, Integer qtdDado) {
        this.nome = nome;
        this.descricao = descricao;
        this.tipoDano = tipoDano;
        this.valorDano = valorDano;
        this.tipoEfeitoAlvo = tipoEfeitoAlvo;
        this.valorEfeitoAlvo = valorEfeitoAlvo;
        this.tipoEfeitoUsuario = tipoEfeitoUsuario;
        this.valorEfeitoUsuario = valorEfeitoUsuario;
        this.elemento = elemento;
        this.valorElemento = valorElemento;
        this.efeitoStatus = efeitoStatus;
        this.tempoEmMinutosEfeitoStatus = tempoEmMinutosEfeitoStatus;
        this.valorDado = valorDado;
        this.qtdDado = qtdDado;
    }

    public Ataque() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if(nome == null || nome.isEmpty()){
            throw new EntidadeInvalidaException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if(descricao == null || descricao.isEmpty()){
            throw new EntidadeInvalidaException("Descrição não pode ser nula ou vazia");
        }
        this.descricao = descricao;
    }

    public TipoDano getTipoDano() {
        return tipoDano;
    }

    public void setTipoDano(TipoDano tipoDano) {
        if(tipoDano == null){
            throw new EntidadeInvalidaException("Tipo de dano não pode ser nulo");
        }
        this.tipoDano = tipoDano;
    }

    public Integer getValorDano() {
        return valorDano;
    }

    public void setValorDano(Integer valorDano) {
        if (valorDano == null ) {
            throw new EntidadeInvalidaException("Valor de dano não pode ser nulo");
        }
        this.valorDano = valorDano;
    }

    public TipoEfeito getTipoEfeitoAlvo() {
        return tipoEfeitoAlvo;
    }

    public void setTipoEfeitoAlvo(TipoEfeito tipoEfeitoAlvo) {
        if (tipoEfeitoAlvo == null) {
            throw new EntidadeInvalidaException("Tipo de efeito do alvo não pode ser nulo");
        }
        this.tipoEfeitoAlvo = tipoEfeitoAlvo;
    }

    public Integer getValorEfeitoAlvo() {
        return valorEfeitoAlvo;
    }

    public void setValorEfeitoAlvo(Integer valorEfeitoAlvo) {
        if (valorEfeitoAlvo == null) {
            throw new EntidadeInvalidaException("Valor de efeito do alvo não pode ser nulo");
        }
        this.valorEfeitoAlvo = valorEfeitoAlvo;
    }

    public TipoEfeito getTipoEfeitoUsuario() {
        return tipoEfeitoUsuario;
    }

    public void setTipoEfeitoUsuario(TipoEfeito tipoEfeitoUsuario) {
        if (tipoEfeitoUsuario == null) {
            if (this.tipoEfeitoUsuario == null) {
                throw new EntidadeInvalidaException("Tipo de efeito do usuário não pode ser nulo");
            }
        }
        this.tipoEfeitoUsuario = tipoEfeitoUsuario;
    }

    public Integer getValorEfeitoUsuario() {
        return valorEfeitoUsuario;
    }

    public void setValorEfeitoUsuario(Integer valorEfeitoUsuario) {
        if (valorEfeitoUsuario == null) {
            throw new EntidadeInvalidaException("Valor de efeito do usuário não pode ser nulo");
        }
        this.valorEfeitoUsuario = valorEfeitoUsuario;
    }

    public Elemento getElemento() {
        return elemento;
    }

    public void setElemento(Elemento elemento) {
        if (elemento == null) {
            throw new EntidadeInvalidaException("Elemento não pode ser nulo");
        }
        this.elemento = elemento;
    }

    public Integer getValorElemento() {
        return valorElemento;
    }

    public void setValorElemento(Integer valorElemento) {
        if (valorElemento == null) {
            throw new EntidadeInvalidaException("Valor do elemento não pode ser nulo");
        }
        this.valorElemento = valorElemento;
    }

    public EfeitoStatus getEfeitoStatus() {
        return efeitoStatus;
    }

    public void setEfeitoStatus(EfeitoStatus efeitoStatus) {
        if (efeitoStatus == null) {
            throw new EntidadeInvalidaException("Efeito de status não pode ser nulo");
        }
        this.efeitoStatus = efeitoStatus;
    }

    public Integer getTempoEmMinutosEfeitoStatus() {
        return tempoEmMinutosEfeitoStatus;
    }

    public void setTempoEmMinutosEfeitoStatus(Integer tempoEmMinutosEfeitoStatus) {
        if (tempoEmMinutosEfeitoStatus == null || tempoEmMinutosEfeitoStatus < 0) {
            throw new EntidadeInvalidaException("Tempo em minutos do efeito de status não pode ser nulo ou negativo");
        }
        this.tempoEmMinutosEfeitoStatus = tempoEmMinutosEfeitoStatus;
    }

    public Integer getValorDado() {
        return valorDado;
    }

    public void setValorDado(Integer valorDado) {
        if (valorDado == null || valorDado <= 0) {
            throw new EntidadeInvalidaException("Valor do dado não pode ser nulo ou menor ou igual a zero");
        }
        this.valorDado = valorDado;
    }

    public Integer getQtdDado() {
        return qtdDado;
    }

    public void setQtdDado(Integer qtdDado) {
        if (qtdDado == null || qtdDado <= 0) {
            throw new EntidadeInvalidaException("Quantidade de dados não pode ser nula ou menor ou igual a zero");
        }
        this.qtdDado = qtdDado;
    }
}
