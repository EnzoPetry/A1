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

    @Override
    public String toString() {
        return "*Nome: " + nome + "\n" +
                "*Idade: " + idade + "\n" +
                "*Sexo: " + sexo + "\n"
                + "*Endereço: " + end;
    }
}
