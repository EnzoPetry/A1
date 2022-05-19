import java.util.Scanner;

public class Aluno {

    private String Nome;
    private float Nota1, Nota2, Nota3;
    private float Resultado = 0;

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public float getNota1() {
        return Nota1;
    }

    public void setNota1(float nota1) {
        Nota1 = nota1;
    }

    public float getNota2() {
        return Nota2;
    }

    public void setNota2(float nota2) {
        Nota2 = nota2;
    }

    public float getNota3() {
        return Nota3;
    }

    public void setNota3(float nota3) {
        Nota3 = nota3;
    }

    public float getResultado() {
        return Resultado;
    }

    public void setResultado(float resultado) {
        Resultado = resultado;
    }

    public void MediaFinal(Scanner scanner) {
        System.out.println("Digite Seu Nome:");
        setNome(scanner.nextLine());
         do{
            System.out.println("Nota Trimestre 1:");
            setNota1(scanner.nextFloat());
            System.out.println("Nota Trimestre 2:");
            setNota2(scanner.nextFloat());
            System.out.println("Nota Trimestre 3:");
            setNota3(scanner.nextFloat());
            Resultado = (float) (Nota1 * 0.3 + Nota2 * 0.35 + Nota3 * 0.35);
            System.out.println(Resultado);
        }while(Resultado < 0 || Resultado > 10);

        System.out.println(Nome + " / " + Resultado);
        if (Resultado >= 6) {
            System.out.println("Aprovado!!!");
        }else{
            System.out.println("Reprovado - Ainda falta " + (6 - Resultado) + " Pontos");
        }
    }
}