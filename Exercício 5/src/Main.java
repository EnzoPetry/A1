import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

/**
 * @author Bernardo Moreira e Enzo Petry
 * @version 1.0
 * @since 26/05/2022
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Editora editora = new Editora();

        // Armazena o nome da editora
        do {
            try {
                System.out.print("Digite o nome da editora: ");

                editora.setNome(leitor.readLine());

                if (editora.getNome().length() < 1) {
                    throw new Exception();
                }

                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um nome válido.");
            }
        } while (true);

        // Armazena o email da editora
        do {
            try {
                System.out.print("Digite o email da editora: ");

                editora.setEmail(leitor.readLine());

                if (!editora.getEmail().contains("@") || !editora.getEmail().contains(".") || editora.getEmail().length() < 1) {
                    throw new Exception();
                }

                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um email válido.");
            }
        } while (true);

        // Seta o id da editora
        editora.setId(editora.hashCode());

        Livro livro = new Livro(editora.hashCode());

        // Armazena o titulo do livro
        do {
            try {
                System.out.print("Digite o título do livro: ");

                livro.setTitulo(leitor.readLine());

                if (livro.getTitulo().length() < 1) {
                    throw new Exception();
                }

                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um título válido.");
            }
        } while (true);

        // Armazena o autor do livro
        do {
            try {
                System.out.print("Digite o nome do autor do livro: ");

                livro.setAutor(leitor.readLine());

                if (livro.getAutor().length() < 1) {
                    throw new Exception();
                }

                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um nome válido.");
            }
        } while (true);

        // Armazena o ano do livro
        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        do {
            try {
                System.out.print("Digite o ano de lançamento do livro: ");

                livro.setAno(Integer.parseInt(leitor.readLine()));

                if (livro.getAno() < 1 || livro.getAno() > anoAtual) {
                    throw new Exception();
                }

                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite um ano válido.");
            }
        } while (true);

        System.out.println(editora);
        System.out.println(livro);
    }
}
