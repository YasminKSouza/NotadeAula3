public class Aluno extends Pessoa{

    private Double nota1;
    private Double nota2;
    private Double media;

    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }

    public Double getNota1() {
        return nota1;
    }

    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }

    public Double getNota2() {
        return nota2;
    }

    public Double getMedia() {
        media = (nota1 + nota2) / 2;
        return media;
    }


}
