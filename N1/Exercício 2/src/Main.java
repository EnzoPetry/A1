import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Elevador ele = new Elevador();
        ele.inicia();
        do {
            System.out.println("Tem " + ele.getPessoas().size() + " pessoas no Elevador");
            System.out.println("Voce esta no Andar: " + ele.getTotalAndar());

            int contador = sc.nextInt();
            switch (contador) {
                case 1 -> ele.entra();
                case 2 -> ele.sai();
            }
        }while(true);
    }
}