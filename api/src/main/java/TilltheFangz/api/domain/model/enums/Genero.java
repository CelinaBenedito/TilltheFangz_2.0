package TilltheFangz.api.domain.model.enums;

/**
 * Representa a identidade de gênero.
 */
public enum Genero {

    /** Mulher que se identifica com o gênero feminino atribuído ao nascer. */
    MULHER_CIS,

    /** Mulher cuja identidade de gênero difere daquela atribuída ao nascer. */
    MULHER_TRANS,

    /** Homem que se identifica com o gênero masculino atribuído ao nascer. */
    HOMEM_CIS,

    /** Homem cuja identidade de gênero difere daquela atribuída ao nascer. */
    HOMEM_TRANS,

    /** Pessoa cuja identidade de gênero não se limita ao masculino ou feminino. */
    NAO_BINARIO,

    /** Pessoa cuja identidade de gênero pode variar ao longo do tempo. */
    GENERO_FLUIDO,

    /** Pessoa que não se identifica com nenhum gênero. */
    AGENERO,

    /** Pessoa que se identifica com dois gêneros, simultânea ou alternadamente. */
    BIGENERO,

    /** Pessoa que se identifica parcialmente com determinado gênero. */
    DEMIGENERO,

    /** Pessoa que se identifica parcialmente com o gênero feminino. */
    DEMIMULHER,

    /** Pessoa que se identifica parcialmente com o gênero masculino. */
    DEMIHOMEM,

    /** Pessoa que se identifica com múltiplos gêneros. */
    PANGENERO,

    /** Identidade de gênero que não se enquadra nas classificações tradicionais. */
    GENERO_QUEER,

    /** Identidade de gênero associada a uma combinação de características masculinas e femininas. */
    ANDROGINO,

    /** Pessoa cuja identidade de gênero não está representada nas demais opções. */
    OUTRO,

    /** Pessoa que prefere não informar a sua identidade de gênero. */
    PREFERE_NAO_INFORMAR
}

