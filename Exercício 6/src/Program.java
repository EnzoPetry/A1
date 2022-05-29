import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * @author Bernardo Moreira e Enzo Petry
 * @version 1.0
 * @since 26/05/2022
 */
public class Program {
    public static void main(String[] args) throws Exception {

        BufferedReader leitor = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Pessoa> pessoas = new ArrayList<>();
        boolean finalizar = false;

        do {
            String nome, logradouro, complemento, cep;
            int idade, opcaoMenu, numero;
            boolean encontrouPessoa = false;
            char sexo;


            Program.desenhaMenu(pessoas.size());

            do {
                try {
                    opcaoMenu = Integer.parseInt(leitor.readLine());

                    break;
                } catch (Exception e) {
                    System.out.println("Por favor, digite valores válidos.");
                }
            } while (true);

            switch (opcaoMenu) {
                case 0:
                    finalizar = true;

                    break;

                case 1:
                    do {
                        try {
                            System.out.print("Nome: ");
                            nome = leitor.readLine();

                            if (nome.length() < 1) {
                                throw new Exception();
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um nome válido.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Idade: ");
                            idade = Integer.parseInt(leitor.readLine());

                            if (idade <= 0) {
                                throw new Exception();
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite uma idade válida.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Sexo (Ex: H ou M): ");
                            sexo = leitor.readLine().charAt(0);

                            if (sexo != 'H' && sexo != 'M') {
                                throw new Exception();
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite valores válidos.");
                        }
                    } while (true);

                    Pessoa p = new Pessoa(nome, idade, sexo);

                    do {
                        try {
                            System.out.print("Digite a sua rua: ");
                            logradouro = leitor.readLine();

                            if (logradouro.length() < 1) {
                                throw new Exception();
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um endereço válido.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite o numero: ");
                            numero = Integer.parseInt(leitor.readLine());

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um número válido.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite o complemento: ");
                            complemento = leitor.readLine();

                            if (complemento.length() < 1) {
                                throw new Exception();
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite valores válidos.");
                        }
                    } while (true);

                    do {
                        try {
                            System.out.print("Digite o CEP: ");
                            cep = leitor.readLine();

                            if (cep.length() < 1) {
                                throw new Exception();
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite valores válidos.");
                        }
                    } while (true);

                    Endereco end = new Endereco();

                    end.setLogradouro(logradouro);
                    end.setComplemento(complemento);
                    end.setNumero(numero);
                    end.setCep(cep);

                    p.setEnd(end);

                    pessoas.add(p);

                    break;

                case 2:
                    do {
                        try {
                            System.out.print("Digite o nome da pessoa a ser apagada: ");
                            nome = leitor.readLine();

                            if (nome.length() < 1) {
                                throw new Exception();
                            }

                            for (int i = 0; i < pessoas.size(); i++) {
                                if (pessoas.get(i).getNome().equals(nome)) {
                                    pessoas.remove(i);

                                    encontrouPessoa = true;

                                    System.out.println("Pessoa deletada com sucesso!");
                                }
                            }

                            if (!encontrouPessoa) {
                                System.out.println("Registro não encontrado.");
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um nome válido.");
                        }
                    } while (true);

                    break;

                case 3:
                    do {
                        try {
                            System.out.print("Digite o nome da pessoa a ser exibido: ");
                            nome = leitor.readLine();

                            if (nome.length() < 1) {
                                throw new Exception();
                            }

                            for (Pessoa pessoa : pessoas) {
                                if (pessoa.getNome().equals(nome)) {
                                    System.out.println(pessoa);
                                    encontrouPessoa = true;
                                }
                            }

                            if (!encontrouPessoa) {
                                System.out.println("Registro não encontrado.");
                            }

                            break;
                        } catch (Exception e) {
                            System.out.println("Por favor, digite um nome válido.");
                        }
                    } while (true);

                    break;

                case 4:
                    for (Pessoa pessoa : pessoas) {
                        System.out.println(pessoa);
                    }

                    break;

                default:
                    System.out.println("Opcao Invalida digite novamente");
                    break;
            }
        } while (!finalizar);
    }

    /**
     * Desenha o menu e as opções disponíveis para seleção
     *
     * @param cadastros informa a quantidade cadastros
     */
    public static void desenhaMenu(int cadastros) {
        System.out.println("----------- Cadastro de Usuário ----------");
        System.out.println("Você possui " + cadastros + " cadastros");
        System.out.println("Opções disponíveis: \n1. Novo cadastro\n2. Deletar cadastro\n3. Mostrar cadastro\n4. Mostrar todos cadastros\n0. Encerrar programa");
        System.out.print("Selecione a opção: ");
    }
}




