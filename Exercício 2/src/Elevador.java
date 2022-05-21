public class Elevador {
    private int andarAtual, capacidadeAtual, capacidadeTotal, andarTotal;

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getCapacidadeAtual() {
        return capacidadeAtual;
    }

    public void setCapacidadeAtual(int capacidadeAtual) {
        this.capacidadeAtual = capacidadeAtual;
    }

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public int getAndarTotal() {
        return andarTotal;
    }

    public void setAndarTotal(int andarTotal) {
        this.andarTotal = andarTotal;
    }

    public Elevador() {
        this.andarAtual = 0;
        this.capacidadeAtual = 0;
        this.capacidadeTotal = 0;
        this.andarTotal = 0;
    }

    public void inicializa(int capacidadeTotal, int andarTotal) {
        this.capacidadeTotal = capacidadeTotal;
        this.andarTotal = andarTotal;
    }

    public void entra() {
        if ((this.capacidadeAtual + 1) <= this.capacidadeTotal) {
            this.capacidadeAtual++;
            System.out.println("Uma pessoa entrou no elevador.");
        } else {
            System.out.println("Numero máximo alcançado!");
        }
    }

    public void sai() {
        if ((this.capacidadeAtual - 1) >= 0) {
            this.capacidadeAtual--;
            System.out.println("Uma pessoa saiu do elevador.");
        } else {
            System.out.println("O elevador já está vazio.");
        }
    }

    public void sobe() {
        if ((this.andarAtual + 1) <= this.andarTotal) {
            this.andarAtual++;
            System.out.println("O elevador subiu um andar.");
        } else {
            System.out.println("Você já está no topo do prédio!");
        }
    }

    public void desce() {
        if ((this.andarAtual - 1) >= 0) {
            this.andarAtual--;
            System.out.println("O elevador desceu um andar.");
        } else {
            System.out.println("Você já está no térreo.");
        }
    }
}
