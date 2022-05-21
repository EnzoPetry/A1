import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A classe Main executa o programa de gerenciamento das notas
 * trimestrais do aluno
 *
 * @author Bernardo Moreira e Enzo Petry
 * @version 1.0
 * @since 21/05/2022
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Studant aluno = new Studant();

        System.out.println("----------- Notas Escolares ----------");

        System.out.print("Digite seu nome: ");
        aluno.setNome(leitor.readLine());

        for (int i = 0; i < 3; i++) {
            System.out.print("Nota trimestre " + (i + 1) + ": ");
            aluno.setNota(i, Float.parseFloat(leitor.readLine()));
        }

        aluno.calculaMediaFinal();

        System.out.println(aluno);
    }
}
