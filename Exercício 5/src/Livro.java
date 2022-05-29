public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private final long idEditora;

    public Livro(long idEditora) {
        this.idEditora = idEditora;
    }

    /**
     * @return ano do livro
     */
    public int getAno() {
        return ano;
    }

    /**
     * Altera o ano do livro
     *
     * @param ano nome do livro
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return titulo do livro
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Altera o titulo do livro
     *
     * @param titulo titulo do livro
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return autor do livro
     */
    public String getAutor() {
        return autor;
    }

    /**
     * Altera o autor do livro
     *
     * @param autor autor do livro
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro:\n" +
                "\tTítulo: " + titulo + "\n" +
                "\tAutor: " + autor + "\n" +
                "\tidEditora: " + idEditora + "\n" +
                "\tAno: " + ano;
    }
}
