import java.util.ArrayList;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Endereco getEnd() {
        return end;
    }

    public void setEnd(Endereco end) {
        this.end = end;
    }


    public void armazenarPessoa(String nome, int idade, char sexo, String logradouro,int numero,String complemento,String cep) {
        Pessoa p1 = new Pessoa();

        p1.setNome(nome);
        p1.setIdade(idade);
        p1.setSexo(sexo);
        p1.end.setLogradouro(logradouro);
        p1.end.armazenarEndereco(logradouro,numero, complemento,cep);
        this.pessoas.add(p1);

    }

    public void removePessoa(String nome) {

        int pessoaIndice = this.buscaPessoa(nome);
        if (pessoaIndice != -1) {
            this.pessoas.remove(pessoaIndice);
            System.out.println("Deletado com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }
    }

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
