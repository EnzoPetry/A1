import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A classe Agenda gerencia e armazena pessoas
 * em uma agenda.
 *
 * @author Bernardo Moreira e Enzo Petry
 * @version 1.0
 * @since 21/05/2022
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Agenda ag = new Agenda();

        boolean finalizar = false;

        do {
            Main.desenhaMenu(ag.getPessoas().size());

            String nome;
            int idade, index, opcaoMenu;
            float altura;

            opcaoMenu = Integer.parseInt(leitor.readLine());

            switch (opcaoMenu) {
                case 1:
                    System.out.print("Digite um nome: ");
                    nome = leitor.readLine();

                    System.out.print("Digite a idade: ");
                    idade = Integer.parseInt(leitor.readLine());

                    System.out.print("Digite a altura (ex: 1.70): ");
                    altura = Float.parseFloat(leitor.readLine());

                    ag.armazenarPessoa(nome, idade, altura);
                    System.out.println("Nova pessoa adicionada com sucesso!");

                    break;
                case 2:
                    System.out.print("Digite o nome da pessoa a ser deletada: ");
                    nome = leitor.readLine();

                    ag.removePessoa(nome);

                    break;
                case 3:
                    ag.imprimeAgenda();
                    break;
                case 4:
                    System.out.print("Digite o índice da pessoa: ");
                    index = Integer.parseInt(leitor.readLine());

                    ag.imprimePessoa(index);

                    break;
                case 0:
                    finalizar = true;

                    break;
                default:
                    System.out.println("Opção inválida, digite novamente.");

                    break;
            }
        } while (!finalizar);
    }

    /**
     * Desenha o menu e as opções disponíveis para seleção
     *
     * @param qtdeContatos informa a quantidade de contatos da agenda
     */
    public static void desenhaMenu(int qtdeContatos) {
        System.out.println("----------- Agenda Telefônica ----------");
        System.out.println("Você possui " + qtdeContatos + " contatos");
        System.out.println("Opções disponíveis: \n1. Armazenar Contato\n2. Remover contato\n3. Mostrar agenda\n4. Mostrar contato\n0. Encerrar programa");
        System.out.print("Selecione a opção: ");
    }
}
