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

    /**
     * Adiciona um novo endereço.
     *
     * @param logradouro logradouro do endereço a ser adicionado
     * @param numero  numero do endereço a ser adicionado
     * @param complemento complemento do endereço a ser adicionado
     * @param cep  cep do endereço a ser adicionado
     */
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
