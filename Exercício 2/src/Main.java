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

        Elevador ele = new Elevador();

        boolean finalizar = false;

        System.out.println("----------- Sistema Elevador ----------");
        System.out.print("Informe a capadidade máxima do elevador: ");
        int capacidadeTota = Integer.parseInt(leitor.readLine());

        System.out.print("Informe a quantidade máxima de andares: ");
        int andarTotal = Integer.parseInt(leitor.readLine());

        ele.inicializa(capacidadeTota, andarTotal);

        do {
            Main.desenhaMenu(ele.getCapacidadeAtual(), ele.getCapacidadeTotal(), ele.getAndarAtual(), ele.getAndarTotal());

            int opcaoMenu = Integer.parseInt(leitor.readLine());

            switch (opcaoMenu) {
                case 1:
                    ele.entra();
                    break;
                case 2:
                    ele.sai();
                    break;
                case 3:
                    ele.sobe();
                    break;
                case 4:
                    ele.desce();
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

    public static void desenhaMenu(int capacidadeAtual, int capacidadeTotal, int andarAtual, int andarTotal) {
        System.out.println("----------- Sistema Elevador ----------");
        System.out.println("Existem " + capacidadeAtual + " pessoa(s) no elevador (" + capacidadeAtual + "/" + capacidadeTotal + ")");
        System.out.println("Você está no andar " + andarAtual + " (" + andarAtual + "/" + andarTotal + ")");
        System.out.println("1. Entrar\n2. Sair\n3. Subir\n4. Descer\n0. Encerrar programa");
        System.out.print("Selecione a opção: ");
    }
}

