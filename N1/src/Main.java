import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        String nome;
        int idade, index;
        float altura;

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));
        Agenda ag = new Agenda();

        do {
            System.out.println("-----------Agenda Telefônica----------");
            System.out.println("Você possui " + ag.getPessoas().size() + " contatos");
            System.out.println("Opções disponíveis: \n1. Armazenar Contato\n2. Remover contato\n3. Mostrar agenda\n4. Mostrar Contatos\n0. Sair");
            System.out.println("Selecione a opção: ");

            int contador = Integer.parseInt(leitor.readLine());
            switch (contador) {
                case 1:
                    nome = leitor.readLine();
                    idade = Integer.parseInt(leitor.readLine());
                    altura = Float.parseFloat(leitor.readLine());

                    ag.armazenarPessoa(nome, idade, altura);
                    break;
                case 2:
                    nome = leitor.readLine();

                    ag.removePessoa(nome);
                    break;
                case 3:
                    ag.imprimeAgenda();
                    break;
                case 4:
                    index = Integer.parseInt(leitor.readLine());

                    ag.imprimePessoa(index);
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Opção inválida, digite novamente.");
                    break;
            }
            System.out.flush();
        } while (true);
    }
}
