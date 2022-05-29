public class Editora {
    private long id;
    private String nome;
    private String email;

    /**
     * @return id da editora
     */
    public long getId() {
        return id;
    }

    /**
     * Altera o id da editora
     *
     * @param id id da editora
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return nome da editora
     */
    public String getNome() {
        return nome;
    }

    /**
     * Altera o nome da editora
     *
     * @param nome nome da editora
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return e-mail da editora
     */
    public String getEmail() {
        return email;
    }

    /**
     * Altera o e-mail da editora
     *
     * @param email e-mail da editora
     */
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Editora:\n" +
                "\tid: " + id + "\n" +
                "\tNome: " + nome + "\n" +
                "\tEmail: " + email;
    }
}
