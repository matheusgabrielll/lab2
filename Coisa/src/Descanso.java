package lab2;

public class Descanso {

    private int horasDescanso;
    private int numeroSemanas;

    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    public void defineNumeroSemanas(int valor) {
        this.numeroSemanas = valor;
    }

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
