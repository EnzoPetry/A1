import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> pessoas;

    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }

    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Agenda() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void armazenarPessoa(String nome, int idade, float altura) {
        // Valida se a agenda está cheia
        if (this.pessoas.size() < 10) {
            Pessoa p1 = new Pessoa();

            p1.setNome(nome);
            p1.setIdade(idade);
            p1.setAltura(altura);

            this.pessoas.add(p1);
        }
    }

    public void removePessoa(String nome) {
        // Busca o índice da pessoa
        int pessoaIndice = this.buscaPessoa(nome);

        // Se encontrou então remove ela da lista
        if (pessoaIndice != -1) {
            this.pessoas.remove(pessoaIndice);
        }
    }

    public int buscaPessoa(String nome) {
        // Percorre o array de pessoas
        for (int i = 0; i < this.pessoas.size(); i++) {
            // Compara o nome, se for igual ao informado, retorna o índice
            if (this.pessoas.get(i).getNome().equals(nome)) {
                return i;
            }
        }

        // Se não encontrou, retorna -1 por padrão
        return -1;
    }

    public void imprimeAgenda() {
        // Percorre o array de pessoas
        for (int i = 0; i < this.pessoas.size(); i++) {
            // Imprime o índice
            System.out.println("Índice: " + i + "\n" + this.pessoas.get(i).toString());
        }
    }

    /**
     * @param index
     */
    public void imprimePessoa(int index) {
        System.out.println(this.pessoas.get(index).toString());
    }
}
