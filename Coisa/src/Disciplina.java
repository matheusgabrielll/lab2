package lab2;

import java.util.Arrays;
/**
 * Representação de uma disciplina, com horas de estudo e notas.
 * A média pode ser aritmética ou ponderada.
 *
 * @author Matheus Gabriel Barreto Santos
 */
public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double[] notas;
    private int[] pesos;
    /**
     * Constrói uma disciplina com 4 notas de mesmo peso.
     *
     * @param nomeDisciplina o nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[4];
        this.pesos = new int[4];
        for (int i = 0; i < 4; i++) {
            this.pesos[i] = 1;
        }
    }
    /**
     * Constrói uma disciplina com um número de notas, todqs com o mesmo peso.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param numeroDeNotas a quantidade de notas
     */
    public Disciplina(String nomeDisciplina, int numeroDeNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numeroDeNotas];
        this.pesos = new int[numeroDeNotas];
        for (int i = 0; i < numeroDeNotas; i++) {
            this.pesos[i] = 1;
        }
    }
    /**
     * Constrói uma disciplina com um número de notas e um peso pra cada
     * uma (média ponderada). Se o array de pesos for null ou de tamanho
     * diferente do número de notas, todas as notas ficam com o mesmo peso.
     *
     * @param nomeDisciplina o nome da disciplina
     * @param numeroDeNotas a quantidade de notas
     * @param pesos os pesos de cada nota, na ordem das notas
     */
    public Disciplina(String nomeDisciplina, int numeroDeNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.notas = new double[numeroDeNotas];
        this.pesos = new int[numeroDeNotas];

        if (pesos != null && pesos.length == numeroDeNotas) {
            for (int i = 0; i < numeroDeNotas; i++) {
                this.pesos[i] = pesos[i];
            }
        } else {
            for (int i = 0; i < numeroDeNotas; i++) {
                this.pesos[i] = 1;
            }
        }
    }
    /**
     * Soma horas de estudo as ja cadastradas.
     *
     * @param horas as horas a adicionar
     */
    public void cadastraHoras(int horas) {
        this.horasEstudo = this.horasEstudo + horas;
    }
    /**
     * Cadastra o valor de uma nota. Números de nota inválidos são ignorados.
     *
     * @param nota o número da nota, começando em 1
     * @param valorNota o valor da nota
     */
    public void cadastraNota(int nota, double valorNota) {
        if (nota >= 1 && nota <= notas.length) {
            this.notas[nota - 1] = valorNota;
        }
    }

    private double calculaMedia() {
        double soma = 0;
        int somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i] * pesos[i];
            somaPesos = somaPesos + pesos[i];
        }
        return soma / somaPesos;
    }
    /**
     * Verifica se o aluno foi aprovado (média maior ou igual a 7.0).
     *
     * @return true se foi aprovado, false se não
     */
    public boolean aprovado() {
        if (calculaMedia() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }
    /**
     * Retorna a representação da disciplina no formato
     * "NOME HORAS MEDIA [notas]".
     *
     * @return a representação em String da disciplina
     */
    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia()
                + " " + Arrays.toString(notas);
    }
}


