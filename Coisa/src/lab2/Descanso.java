package lab2;
/**
 * Registro do descanso do aluno. Com a quantidade de horas de descanso e
 * o número de semanas, define se o aluno esta descansado ou cansado.
 *
 * @author Matheus Gabriel Barreto Santos
 */
public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;
    /**
     * Define o total de horas de descanso.
     *
     * @param valor as horas de descanso
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }
    /**
     * Define o número de semanas consideradas.
     *
     * @param valor o número de semanas
     */
    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }
    /**
     * Retorna o status geral do aluno. Se a média de descanso por semana
     * for pelo menos 26 horas, o aluno esta "descansado"; senão, "cansado".
     * Se as horas ou as semanas ainda não foram definidqs, está "cansado".
     *
     * @return "descansado" ou "cansado"
     */
    public String getStatusGeral() {

        if (horasDescanso == 0 || numeroSemanas == 0) {
            return "cansado";
        }

        int mediaPorSemana = horasDescanso / numeroSemanas;

        if (mediaPorSemana >= 26) {
            return "descansado";

        } else {
            return "cansado";
        }
    }
}


