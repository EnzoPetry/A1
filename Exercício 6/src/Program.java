import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Program {
    public static void main(String[] args) throws Exception {

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        Pessoa p1 = new Pessoa();



        do {
            String nome,logradouro,complemento,cep;
            int idade, opcaoMenu,numero;
            char sexo;

            Program.desenhaMenu(p1.pessoas.size());

            opcaoMenu = Integer.parseInt(leitor.readLine());
            switch (opcaoMenu) {
                case 1:
                    System.out.println("Nome: ");
                    nome = leitor.readLine();
                    System.out.println("Idade: ");
                    idade = Integer.parseInt(leitor.readLine());
                    System.out.println("Sexo (Ex: h ou m): ");
                    sexo = leitor.readLine().charAt(0);
                    System.out.println("Digite a sua rua:");
                    logradouro = leitor.readLine();
                    System.out.println("Digite o numero: ");
                    numero = Integer.parseInt(leitor.readLine());
                    System.out.println("Digite o complemento: ");
                    complemento = leitor.readLine();
                    System.out.println("Digite o CEP: ");
                    cep = leitor.readLine();
                    p1.armazenarPessoa(nome, idade, sexo, logradouro, numero, complemento, cep);

                    break;
                case 2:
                    System.out.println("Qual nome quer apagar: ");
                    nome = leitor.readLine();
                    p1.removePessoa(nome);
                    break;
                case 3:
                    System.out.println("Qual o usuário: ");
                    nome = leitor.readLine();
                    System.out.println(p1.pessoas.get(p1.buscaPessoa(nome)).toString());
                    break;
                case 4:
                    for (int x = 0; x < p1.pessoas.size(); x++) {
                        String dadosPessoa = "=> " + (x + 1) + "ºCadastro " + "\n" + p1.pessoas.get(x).toString();
                        System.out.println(dadosPessoa);
                    }
                    break;

            }
        } while (true);
    }

    public static void desenhaMenu(int cadastros) {
        System.out.println("----------- Cadastro de Usuário ----------");
        System.out.println("Você possui " + cadastros + " cadastros");
        System.out.println("Opções disponíveis: \n1. Novo cadastro\n2. Deletar cadastro\n3. Mostrar cadastro\n4. Mostrar todos cadastros\n0. Encerrar programa");
        System.out.print("Selecione a opção: ");
    }
}




