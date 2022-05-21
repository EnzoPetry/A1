import java.util.ArrayList;

/**
 * A classe Agenda gerencia e armazena pessoas
 * em uma agenda.
 *
 * @author Bernardo Moreira e Enzo Petry
 * @version 1.0
 * @since 21/05/2022
 */
public class Agenda {
    private int tamanhoAgenda;
    private ArrayList<Pessoa> pessoas;

    /**
     * Retorna o tamanho máximo de pessoas que
     * a agenda pode suportar
     *
     * @return o tamanho da agenda
     */
    public int getTamanhoAgenda() {
        return tamanhoAgenda;
    }

    /**
     * Altera o tamanho de pessoas que a agenda pode armazenar
     *
     * @param tamanhoAgenda novo tamanho da agenda
     */
    public void setTamanhoAgenda(int tamanhoAgenda) {
        this.tamanhoAgenda = tamanhoAgenda;
    }

    /**
     * Retorna a lista de pessoas
     *
     * @return o ArrayList de pessoas da agenda
     */
    public ArrayList<Pessoa> getPessoas() {
        return this.pessoas;
    }

    /**
     * Atualiza a lista inteira com o novo ArrayList informado
     *
     * @param pessoas ArrayList de Pessoas
     */
    public void setPessoas(ArrayList<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Agenda() {
        this.pessoas = new ArrayList<Pessoa>();
        this.tamanhoAgenda = 10;
    }

    /**
     * Adiciona uma nova pessoa a agenda.
     *
     * @param nome   nome da pessoa a ser adicionada
     * @param idade  idade da pessoa a ser adicionada
     * @param altura altura da pessoa a ser adicionada
     */
    public void armazenarPessoa(String nome, int idade, float altura) {
        // Valida se a agenda está cheia
        if (this.pessoas.size() < this.tamanhoAgenda) {
            Pessoa p1 = new Pessoa();

            p1.setNome(nome);
            p1.setIdade(idade);
            p1.setAltura(altura);

            this.pessoas.add(p1);
        }
    }

    /**
     * Busca a pessoa por nome. Se existe deleta ela e informa se deletou.
     * Se não existe, informa um erro no console
     *
     * @param nome nome da pessoa a ser deletada
     */
    public void removePessoa(String nome) {
        // Busca o índice da pessoa
        int pessoaIndice = this.buscaPessoa(nome);

        // Se encontrou então remove ela da lista
        if (pessoaIndice != -1) {
            this.pessoas.remove(pessoaIndice);
            System.out.println("Deletado com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }

    /**
     * Informa em que posição da agenda está a pessoa.
     * A busca é feita por nome
     *
     * @param nome nome da pessoa
     * @return índice da pessoa na agenda
     */
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

    /**
     * Informa os dados de todas as pessoas da agenda
     */
    public void imprimeAgenda() {
        System.out.print("Agenda atual: ");

        if (this.pessoas.isEmpty()) {
            System.out.println("está vazia!");
        } else {
            System.out.print("\n");
            for (int i = 0; i < this.pessoas.size(); i++) {
                String dadosPessoa = "#Índice " + (i + 1) + "\n" + this.pessoas.get(i).toString();
                System.out.println(dadosPessoa);
            }
        }
    }

    /**
     * Imprime os dados da pessoa que está na posição "i" da agenda.
     * Se não existe, alerta um erro no console.
     *
     * @param index índice da pessoa na agenda (1 - n)
     */
    public void imprimePessoa(int index) {
        try {
            index--;
            Pessoa pessoa = this.pessoas.get(index);
            String dadosPessoa = "#Índice " + (index + 1) + "\n" + pessoa.toString();

            System.out.println(dadosPessoa);
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("Índice inválido, tente novamente!");
        }
    }
}
