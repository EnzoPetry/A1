import java.util.ArrayList;

public class Elevador {

    private ArrayList<Pessoa> pessoas;
    private int totalAndar = 0;

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public int getTotalAndar() {
        return totalAndar;
    }

    public void setTotalAndar(int totalAndar) {
        this.totalAndar = totalAndar;
    }

    public Elevador() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void inicia() {
        int totalAndar = 0;

    }

    public void entra() {
        if (this.pessoas.size() < 10) {
            this.pessoas.add(new Pessoa());
        }
    }

    public void sai() {
        if (this.pessoas.size() > 0) {
            this.pessoas.remove(pessoas.size() - 1);
        }
    }

    public void sobe(int totalAndar) {

    }

    public void desce(int totalAndar) {

    }
}
