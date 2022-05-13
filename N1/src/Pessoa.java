public class Pessoa {
    private String nome;
    private int idade;
    private float altura;

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nIdade: " + this.getIdade() + "\nAltura: " + String.format("%.2f", this.getAltura()) + "m";
    }
}
