import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * A classe Main executa o programa de gerenciamento de elevador
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

        int capacidadeTota, andarTotal;
        capacidadeTota = andarTotal = 0;

        do {
            try {
                System.out.print("Informe a capadidade máxima do elevador: ");

                capacidadeTota = Integer.parseInt(leitor.readLine());

                if (capacidadeTota <= 0) {
                    throw new Exception();
                }

                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite uma capacidade válida.");
            }
        } while (true);

        do {
            try {
                System.out.print("Informe a quantidade máxima de andares: ");

                andarTotal = Integer.parseInt(leitor.readLine());

                if (andarTotal <= 0) {
                    throw new Exception();
                }

                break;
            } catch (Exception e) {
                System.out.println("Por favor, digite uma quantidade válida.");
            }
        } while (true);

        ele.inicializa(capacidadeTota, andarTotal);

        do {
            int opcaoMenu = 0;

            do {
                try {
                    Main.desenhaMenu(ele.getCapacidadeAtual(), ele.getCapacidadeTotal(), ele.getAndarAtual(), ele.getAndarTotal());

                    opcaoMenu = Integer.parseInt(leitor.readLine());

                    break;
                } catch (Exception e) {
                    System.out.println("Por favor, digite valores válidos.");
                }
            } while (true);

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

    /**
     * Desenha o menu e as opções disponíveis para seleção
     *
     * @param capacidadeAtual capacidade atual do elevador, quantas pessoas estão nele
     * @param capacidadeTotal capacidade máxima suportada pelo elevador
     * @param andarAtual      andar atual em que o elevador se encontra
     * @param andarTotal      andar máximo do prédio
     */
    public static void desenhaMenu(int capacidadeAtual, int capacidadeTotal, int andarAtual, int andarTotal) {
        System.out.println("----------- Sistema Elevador ----------");
        System.out.println("Existem " + capacidadeAtual + " pessoa(s) no elevador (" + capacidadeAtual + "/" + capacidadeTotal + ")");
        System.out.println("Você está no andar " + andarAtual + " (" + andarAtual + "/" + andarTotal + ")");
        System.out.println("1. Entrar\n2. Sair\n3. Subir\n4. Descer\n0. Encerrar programa");
        System.out.print("Selecione a opção: ");
    }
}

