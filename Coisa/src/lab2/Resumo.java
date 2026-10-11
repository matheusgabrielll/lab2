package lab2;
/**
 * Representação de um resumo de estudos, com tema e conteúdo.
 *
 * @author Matheus Gabriel Barreto Santos
 */
public class Resumo {

    private String tema;
    private String conteudo;
    /**
     * Constroi um resumo a partir do tema e do conteúdo.
     *
     * @param tema o tema do resumo
     * @param conteudo o conteúdo do resumo
     */
    public Resumo(String tema, String conteudo) {
        this.tema = tema;
        this.conteudo = conteudo;
    }

    public String getTema() {
        return tema;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    /**
     * Retorna o resumo no formato "TEMA: conteúdo".
     *
     * @return a representação em String do resumo
     */
    public String toString() {
        return tema + ": " + conteudo;
    }
}

