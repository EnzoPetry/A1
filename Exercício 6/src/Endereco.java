import java.util.ArrayList;

public class Endereco {

    private String logradouro ;
    private String complemento;
    private int numero;
    private String cep;

    /**
     * @return o logradouro do endereço
     */
    public String getLogradouro() {
        return logradouro;
    }

    /**
     * Altera o logradouro do endereço
     *
     * @param logradouro logradouro do endereço
     */
    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    /**
     * @return o complemento do endereço
     */
    public String getComplemento() {
        return complemento;
    }

    /**
     * Altera o complemento do endereço
     *
     * @param complemento complemento do endereço
     */
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    /**
     * @return o número do endereço
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Altera o numero do endereço
     *
     * @param numero numero do endereço
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return o cep do endereço
     */
    public String getCep() {
        return cep;
    }

    /**
     * Altera o cep do endereço
     *
     * @param cep cep do endereço
     */
    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return  logradouro + " " + numero + ", " + complemento + " - " + cep + "\n";
    }
}
