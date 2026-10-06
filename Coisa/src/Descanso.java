package lab2;
/**
 * Representação do estado de descanso de um estudante ao longo das semanas.
 * O aluno é considerado descansado se atingir a média de pelo menos 26 horas de descanso por semana.
 *
 * @author Matheus Gabriel Barreto Santos - 20260008741
 */
public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;
    /**
     * Define o total de horas descansadas pelo estudante.
     *
     * @param valor a quantidade total de horas de descanso
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }
    /**
     * Retorna a situação geral do descanso do aluno ("descansado" ou "cansado").
     *
     * @return a String "descansado" se a média for de pelo menos 26h/semana, ou "cansado" caso contrário.
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
