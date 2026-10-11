package lab2;

//+ cadastraNota(nota : int, valorNota : double) : void
//+ aprovado() : boolean
//+ toString() : String
//---
public class Disciplina {

    private String nomeDisciplina;
    private int horasEstudo;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horasEstudo = 0;
        this.nota1 = 0;
        this.nota2 = 0;
        this.nota3 = 0;
        this.nota4 = 0;
    }

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
