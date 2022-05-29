import java.util.ArrayList;

/**
 * A classe Agenda gerencia e armazena pessoas
 * em uma agenda.
 *
 * @author Bernardo Moreira e Enzo Petry
 * @version 1.0
 * @since 21/05/2022
 */

public class Pessoa {
    private String nome;
    private int idade;
    private char sexo;
    private Endereco end;

    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Pessoa() {
        this.end = new Endereco();
    }

    public Pessoa(String nome, int idade, char sexo) {

        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.end = new Endereco();
    }

    /**
     * @return o nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome da pessoa
     *
     * @param nome nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return a idade da pessoa
     */
    public int getIdade() {
        return idade;
    }

    /**
     * Altera a idade da pessoa
     *
     * @param idade idade da pessoa
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * @return a sexo da pessoa
     */
    public char getSexo() {
        return sexo;
    }

    /**
     * Altera o sexo da pessoa
     *
     * @param sexo sexo da pessoa
     */
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco getEnd() {
        return end;
    }

    /**
     * Altera o endereço da pessoa
     *
     * @param end endereço da pessoa
     */
    public void setEnd(Endereco end) {
        this.end = end;
    }

    /**
     * Cadastra uma nova pessoa.
     *
     * @param nome  nome da pessoa a ser adicionada
     * @param idade idade da pessoa a ser adicionada
     * @param sexo  altura da pessoa a ser adicionada
     */
    public void armazenarPessoa(String nome, int idade, char sexo, String logradouro, int numero, String complemento, String cep) {
        Pessoa p1 = new Pessoa();

        p1.setNome(nome);
        p1.setIdade(idade);
        p1.setSexo(sexo);
        p1.end.armazenarEndereco(logradouro, numero, complemento, cep);
        this.pessoas.add(p1);

    }

    /**
     * Busca a pessoa por nome. Se existe deleta ela e informa se deletou.
     * Se não existe, informa um erro no console
     *
     * @param nome nome da pessoa a ser deletada
     */
    public void removePessoa(String nome) {

        int pessoaIndice = this.buscaPessoa(nome);
        if (pessoaIndice != -1) {
            this.pessoas.remove(pessoaIndice);
            System.out.println("Deletado com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }

    /**
     * Informa em que posição do cadastro está a pessoa.
     * A busca é feita por nome
     *
     * @param nome nome da pessoa
     * @return índice da pessoa na agenda
     */
    public int buscaPessoa(String nome) {
        for (int i = 0; i < this.pessoas.size(); i++) {
            if (this.pessoas.get(i).getNome().equals(nome)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String toString() {
        return "*Nome: " + nome + "\n" +
                "*Idade: " + idade + "\n" +
                "*Sexo: " + sexo + "\n"
                + "*Endereço: " + end;
    }
}
