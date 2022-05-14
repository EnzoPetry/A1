import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        Elevador ele = new Elevador();

        System.out.println("Sistema Elevador");
        ele.Inicializa();
        do {
            System.out.println("Atualmente existem " + ele.getLugares()  + " lugares ocupados");
            System.out.println("E se encontra no andar " + ele.getAndar());
            System.out.println(" 1. Entrar\n 2. Sair\n 3. Subir\n 4. Descer");
            int andar = sc.nextInt();
            switch (andar) {
                case 1:
                    ele.Entra();
                    break;
                case 2:
                    ele.Sai();

                    break;
                case 3:
                    System.out.println("Quantos andares quer subir?");
                    ele.setMudar(sc.nextInt());
                    ele.Sobe(ele.getMudar());

                    break;
                case 4:
                    System.out.println("Quantos andares quer descer?");
                    ele.setMudar(sc.nextInt());
                    ele.Desce(ele.getMudar());
                default:
                    throw new IllegalStateException("Unexpected value: " + andar);
            }
        }
        while (true);

        }
}

