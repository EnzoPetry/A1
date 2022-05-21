/**
 * A classe Elevador simula a gerencia um elevador de um prédio qualquer
 *
 * @author Bernardo Moreira e Enzo Petry
 * @version 1.0
 * @since 21/05/2022
 */
public class Elevador {
    private int andarAtual, capacidadeAtual, capacidadeTotal, andarTotal;

    /**
     * Retorna o andar atual em que o elevador se encontra
     *
     * @return andar atual
     */
    public int getAndarAtual() {
        return andarAtual;
    }

    /**
     * Altera o andar atual para o andar passado por parâmetro
     *
     * @param andarAtual andar atual do elevador
     */
    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    /**
     * Retorna a quantidade de pessoas no elevador
     *
     * @return capacidade atual
     */
    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    /**
     * Altera a capacidade atual do elevador para a
     * capacidade informada por parâmetro
     *
     * @param capacidadeAtual capacidade atual de pessoas no elevador
     */
    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    /**
     * Retorna o capacidade máxima de pessoas do elevador
     *
     * @return capacidade total
     */
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    /**
     * Altera a capacidade total do elevador para a
     * capacidade informada por parâmetro
     *
     * @param capacidadeTotal capacidade total de pessoas do elevador
     */
    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    /**
     * Retorna a quantidade de andares máxima do prédio
     *
     * @return andar máximo do prédio
     */
    public int getAndarTotal() {
        return andarTotal;
    }

    /**
     * Altera a quantidade máxima/total dos andares do prédio
     * para a quantidade passada por parâmetro
     *
     * @param andarTotal quantidade total de andares do prédio
     */
    public void setAndarTotal(int andarTotal) {
        this.andarTotal = andarTotal;
    }

    public Elevador() {
        this.andarAtual = 0;
        this.capacidadeAtual = 0;
        this.capacidadeTotal = 0;
        this.andarTotal = 0;
    }

    /**
     * Inicializa o elevador no térreo, com 0 pessoas nele,
     * configura a capacidade máxima de pessoas e o máximo de andares do prédio
     *
     * @param capacidadeTotal capacidade máxima suportada pelo elevador
     * @param andarTotal      andar máximo do prédio
     */
    public void inicializa(int capacidadeTotal, int andarTotal) {
        this.capacidadeTotal = capacidadeTotal;
        this.andarTotal = andarTotal;
        this.andarAtual = 0;
        this.capacidadeAtual = 0;
    }

    /**
     * Acrescentar uma pessoa no elevador (só acrescenta se ainda houver espaço)
     */
    public void entra() {
        if ((this.capacidadeAtual + 1) <= this.capacidadeTotal) {
            this.capacidadeAtual++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("Numero máximo alcançado!");
        }
    }

    /**
     * Remove uma pessoa do elevador (só remove se houver alguém dentro dele)
     */
    public void sai() {
        if ((this.capacidadeAtual - 1) >= 0) {
            this.capacidadeAtual--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador já está vazio.");
        }
    }

    /**
     * Sobe um andar (não sube se já estiver no último andar)
     */
    public void sobe() {
        if ((this.andarAtual + 1) <= this.andarTotal) {
            this.andarAtual++;
            System.out.println("O elevador subiu um andar.");
        } else {
            System.out.println("Você já está no topo do prédio!");
        }
    }

    /**
     * Desce um andar (não descee se já estiver no térreo)
     */
    public void desce() {
        if ((this.andarAtual - 1) >= 0) {
            this.andarAtual--;
            System.out.println("O elevador desceu um andar.");
        } else {
            System.out.println("Você já está no térreo.");
        }
    }
}
