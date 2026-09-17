package TilltheFangz.api.domain.model;

import TilltheFangz.api.domain.exception.ValorInvalidoParaPontuacaoException;

public class Pontos {
    Personagem personagem;
    int vida;
    int defesa;
    int sanidade;
    int carisma;
    int inteligencia;
    int agilidade;
    int vigor;
    int sangueAncestral;

    public Pontos(Personagem personagem, int vida, int defesa, int sanidade, int carisma, int inteligencia, int agilidade, int vigor, int sangueAncestral) {
        this.personagem = personagem;
        this.vida = vida;
        this.defesa = defesa;
        this.sanidade = sanidade;
        this.carisma = carisma;
        this.inteligencia = inteligencia;
        this.agilidade = agilidade;
        this.vigor = vigor;
        this.sangueAncestral = sangueAncestral;
    }

    public Pontos() {
    }

    public Personagem getPersonagem() {
        return personagem;
    }

    public void setPersonagem(Personagem personagem) {
        this.personagem = personagem;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        if(this.vida<0 && vida<=0 ){
            throw new ValorInvalidoParaPontuacaoException("Valor inválido");
        }
        this.vida = vida;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        if(this.defesa<0 && defesa<=0 ){
            throw new ValorInvalidoParaPontuacaoException("Valor inválido");
        }
        this.defesa = defesa;
    }

    public int getSanidade() {
        return sanidade;
    }

    public void setSanidade(int sanidade) {
        if(this.sanidade<0 && sanidade<=0 ){
            throw new ValorInvalidoParaPontuacaoException("Valor inválido");
        }
        this.sanidade = sanidade;
    }

    public int getCarisma() {
        return carisma;
    }

    public void setCarisma(int carisma) {
    if (this.carisma<0 && carisma<=0 ){
            throw new ValorInvalidoParaPontuacaoException("Valor inválido");
        }
        this.carisma = carisma;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        if(this.inteligencia<0 && inteligencia<=0 ){
            throw new ValorInvalidoParaPontuacaoException("Valor inválido");
        }
        this.inteligencia = inteligencia;
    }

    public int getAgilidade() {
        return agilidade;
    }

    public void setAgilidade(int agilidade) {
        if(this.agilidade<0 && agilidade<=0 ){
            throw new ValorInvalidoParaPontuacaoException("Valor inválido");
        }
        this.agilidade = agilidade;
    }

    public int getVigor() {
        return vigor;
    }

    public void setVigor(int vigor) {
        if(this.vigor<0 && vigor<=0 ){
            throw new ValorInvalidoParaPontuacaoException("Valor inválido");
        }
        this.vigor = vigor;
    }

    public int getSangueAncestral() {
        return sangueAncestral;
    }

    public void setSangueAncestral(int sangueAncestral) {
        if(this.sangueAncestral<0 && sangueAncestral<=0 ){
            throw new ValorInvalidoParaPontuacaoException("Valor inválido");
        }
        this.sangueAncestral = sangueAncestral;
    }
}
