package lab2;
import java.util.Arrays;
/**
 * Registro de resumos de estudos. Guarda uma quantidade limitada de
 * resumos, identificqdos pelo tema.
 *
 * @author Matheus Gabriel Barreto Santos
 */
public class RegistroResumos {

    private Resumo[] resumos;
    private int quantidadeResumos;
    private int proximaPosicao;
    /**
     * Constroi um registro com capacidade para um número máximo de resumos.
     *
     * @param numeroDeResumos a capacidade máxima do registro
     */
    public RegistroResumos(int numeroDeResumos) {
        this.resumos = new Resumo[numeroDeResumos];
        this.quantidadeResumos = 0;
        this.proximaPosicao = 0;
    }
    /**
     * Adiciona um resumo. Se o tema ja existe, troca o conteúdo.
     * Se o registro estiver cheio, troca o resumo mais antigo.
     *
     * @param tema o tema do resumo
     * @param conteudo o conteúdo do resumo
     */
    public void adicionaResumo(String tema, String conteudo) {
        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getTema().equals(tema)) {
                resumos[i].setConteudo(conteudo);
                return;
            }
        }

        resumos[proximaPosicao] = new Resumo(tema, conteudo);

        if (quantidadeResumos < resumos.length) {
            quantidadeResumos = quantidadeResumos + 1;
        }
        proximaPosicao = (proximaPosicao + 1) % resumos.length;
    }
    /**
     * Retorna os resumos no formato "TEMA: conteúdo".
     *
     * @return array com os resumos cadqstrados
     */
    public String[] pegaResumos() {
        String[] saida = new String[quantidadeResumos];
        for (int i = 0; i < quantidadeResumos; i++) {
            saida[i] = resumos[i].toString();
        }
        return saida;
    }
    /**
     * Retorna a quantidade de resumos e a lista de temas separados por " | ".
     *
     * @return a representação em String dos resumos
     */
    public String imprimeResumos() {
        String texto = "- " + quantidadeResumos + " resumo(s) cadastrado(s)\n- ";
        for (int i = 0; i < quantidadeResumos; i++) {
            if (i > 0) {
                texto = texto + " | ";
            }
            texto = texto + resumos[i].getTema();
        }
        return texto;
    }
    /**
     * Retorna quantos resumos estão cadastrados.
     *
     * @return a quantidade de resumos
     */
    public int contaResumos() {
        return quantidadeResumos;
    }
    /**
     * Verifica se existe um resumo com o tema informado.
     *
     * @param tema o tema procurado
     * @return true se o tema existe, false se não
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
    }
    /**
     * Busca os temas dos resumos cujo conteúdo contem a chave de busca,
     * sem diferenciar maiúsculas de minúsculas.
     *
     * @return os temas encontrados, em ordem alfabética
     */
    public String[] busca(String chaveDeBusca) {
        String chave = chaveDeBusca.toLowerCase();
        String[] temp = new String[quantidadeResumos];
        int cont = 0;

        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getConteudo().toLowerCase().contains(chave)) {
                temp[cont] = resumos[i].getTema();
                cont++;
            }
        }

        String[] resultado = Arrays.copyOf(temp, cont);
        Arrays.sort(resultado);
        return resultado;
    }
        public void adiciona(String tema, String conteudo) {
            adicionaResumo(tema, conteudo);
        }

        public int conta() {
            return contaResumos();
        }
    }