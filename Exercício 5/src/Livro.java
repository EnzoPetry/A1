public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private final long idEditora;

    public Livro(long idEditora) {
        this.idEditora = idEditora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

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
