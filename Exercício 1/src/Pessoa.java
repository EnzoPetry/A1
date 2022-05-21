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
    private float altura;

    /**
     * @return o nome da pessoa
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * @return a idade da pessoa
     */
    public int getIdade() {
        return this.idade;
    }

    /**
     * @return a altura da pessoa
     */
    public float getAltura() {
        return this.altura;
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
     * Altera a idade da pessoa
     *
     * @param idade idade da pessoa
     */
    public void setIdade(int idade) {
        this.idade = idade;
    }

    /**
     * Altera a altura da pessoa
     *
     * @param altura altura da pessoa
     */
    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nAltura: " + String.format("%.2f", this.getAltura()) + "m\n" + "---------------------";
    }
}
