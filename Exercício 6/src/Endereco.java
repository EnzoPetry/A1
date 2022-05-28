import java.util.ArrayList;

public class Endereco {

    private String logradouro ;
    private String complemento;
    private int numero;
    private String cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void armazenarEndereco(String logradouro,int numero,String complemento,String cep) {

        this.setLogradouro(logradouro);
        this.setNumero(numero);
        this.setComplemento(complemento);
        this.setCep(cep);
    }

    @Override
    public String toString() {
        return  logradouro + " " + numero + ", " + complemento + " - " + cep + "\n";
    }
}
