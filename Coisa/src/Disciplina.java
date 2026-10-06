package lab2;
/**
 * Representação do acompanhamento de uma disciplina cursada pelo aluno,
 * armazenando o nome da disciplina, horas de estudo dedicadas e 4 notas de avaliações.
 *
 * @author Matheus Gabriel Barreto Santos - 20260008741
 */
public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    /**
     * Constrói uma disciplina com o nome informado.
     * Inicializa as horas de estudo e todas as notas com zero.
     *
     * @param nomeDisciplina o nome da disciplina
     */

    // Ultilizaria um array de inteiros para atribuir as 4 notas, ao inves de 4 variaveis.


    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
    }
    /**
     * Acumula as horas dedicadas aos estudos dessa disciplina.
     *
     * @param horas a quantidade de horas a adicionar
     */

    public void cadastraHoras(int horas) {
        this.horasEstudo = this.horasEstudo + horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        if (nota == 1) {
            this.nota1 = valorNota;
        } else if (nota == 2) {
            this.nota2 = valorNota;
        } else if (nota == 3) {
            this.nota3 = valorNota;
        } else if (nota == 4) {
            this.nota4 = valorNota;
        }
    }
    // Cadastraria a nota através do indice do array notas que deveria ser criado anteriormente.

    private double calculaMedia() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public boolean aprovado() {
        if (calculaMedia() >= 7.0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return nomeDisciplina + " " + horasEstudo + " " + calculaMedia()
                + " [" + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + "]";
    }
}
