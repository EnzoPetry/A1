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

        do {
            try {
                System.out.print("Digite seu nome: ");

                aluno.setNome(leitor.readLine());

                if (aluno.getNome().length() < 1) {
                    throw new Exception();
                }

                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um nome válido.");
            }
        } while (true);

        for (int i = 0; i < 3; i++) {
            do {
                try {
                    System.out.print("Nota trimestre " + (i + 1) + " (Ex.: 7.8): ");

                    aluno.setNota(i, Float.parseFloat(leitor.readLine()));

                    if (aluno.getNota()[i] < 0) {
                        throw new Exception();
                    }

                    break;
                } catch (Exception e) {
                    System.out.println("Por favor, digite uma nota válida.");
                }
            } while (true);
        }

        aluno.calculaMediaFinal();

        System.out.println(aluno);
    }
}
