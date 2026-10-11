package lab2;
/**
 * Registro do tempo online de estudo em uma disciplina, com uma meta de
 * tempo esperqdo.
 *
 * @author Matheus Gabriel Barreto Santos
 */
public class RegistroTempoOnline {

    private String nomeDisciplina;
    private int tempoOnline;
    private int tempoOnlineEsperado;
    /**
     * Constrói um registro com a meta padrão de 120 horas.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = 120;
    }

    /**
     * Constrói um registro com uma meta de tempo definida.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado a meta de tempo online, em horas
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnline = 0;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    /**
     * Soma tempo online ao total ja registrado.
     *
     * @param tempo o tempo a adicionar, em horas
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline = this.tempoOnline + tempo;
    }
    /**
     * Verifica se a meta de tempo online foi atingida.
     *
     * @return true se o tempo online é maior ou igual a meta, false se não
     */
    public boolean atingiuMetaTempoOnline() {
        if (tempoOnline >= tempoOnlineEsperado) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Retorna o registro no formato "DISCIPLINA tempo/meta".
     *
     * @return a representação em String do registro
     */
    public String toString() {
        return nomeDisciplina + " " + tempoOnline + "/" + tempoOnlineEsperado;
    }

}


