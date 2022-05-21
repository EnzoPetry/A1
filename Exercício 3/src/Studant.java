/**
 * A classe Studant armazena o nome de um aluno e as três notas
 * que ele obteve nos três trimestres do ano. Também calcula a nota final,
 * informa se o aluno foi aprovado (PASS) ou não (FAILED) e mostra quanto
 * faltou para aprovação
 *
 * @author Bernardo Moreira e Enzo Petry
 * @version 1.0
 * @since 21/05/2022
 */
public class Studant {
    private String nome;
    private float[] nota = new float[3];
    private float resultado = 0;

    /**
     * Retorna o nome do aluno
     *
     * @return nome do aluno
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome do aluno para o nome passado por parâmetro
     *
     * @param nome nome do aluno
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Retorna o array que armazena as três notas do aluno
     *
     * @return notas
     */
    public float[] getNota() {
        return nota;
    }

    /**
     * Altera as notas do aluno para as notas passadas por parâmetro
     *
     * @param nota notas do aluno
     */
    public void setNota(float[] nota) {
        this.nota = nota;
    }

    /**
     * Altera uma nota específicia baseado em um índice
     *
     * @param indice indice da nota
     * @param nota   valor da nota
     */
    public void setNota(int indice, float nota) {
        try {
            this.nota[indice] = nota;
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Índice inválido, tente novamente!");
        }
    }

    /**
     * Retorna o resultado da média final do aluno
     *
     * @return resultado
     */
    public float getResultado() {
        return resultado;
    }

    /**
     * Altera a média final do aluno
     *
     * @param resultado resultado da média final do aluno
     */
    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    /**
     * <p>Calcula a média final do aluno:</p>
     * <p>Primeiro trimestre vale 30</p>
     * <p>Segundo e o terceiro valem 35 cada</p>
     */
    public void calculaMediaFinal() {
        this.setResultado((float) ((this.nota[0] * 0.3) + (this.nota[1] * 0.35) + (this.nota[2] * 0.35)));
    }

    @Override
    public String toString() {
        float notaFaltando = (6 - this.getResultado());
        String textoReprovacao = "FAILED\nPontos faltando para obter o mínimo de aprovação: " + String.format("%.2f", notaFaltando);

        return "----------- Notas Escolares - Resultado ----------"
                + "\nAluno: "
                + this.getNome()
                + "\nMédia final: "
                + String.format("%.2f", this.getResultado())
                + "\nResultado: "
                + (this.getResultado() >= 6 ? "PASS" : textoReprovacao);
    }
}