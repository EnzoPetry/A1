import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Album {
    private String nomeAlbum;
    private Date dataLancamento;

    private ArrayList<Musica> musicas;

    public Album() {
        this.musicas = new ArrayList<>();
    }

    /**
     * @return o nome do album
     */
    public String getNomeAlbum() {
        return nomeAlbum;
    }

    /**
     * Altera o nome do album
     *
     * @param nomeAlbum nome do album
     */
    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    /**
     * @return a data de lancamento do album
     */
    public Date getDataLancamento() {
        return dataLancamento;
    }

    /**
     * Altera a data de lançamento do album
     *
     * @param dataLancamento data de lançamento do album
     */
    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    /**
     * Adiciona uma nova musica ao album.
     *
     * @param nomeMusica nome da musica a ser adicionada no album
     * @param duracao    duracao da musica a ser adicionada no album
     */
    public void addMusica(String nomeMusica, float duracao) {
        Musica musica = new Musica();

        musica.setNomeMusica(nomeMusica);
        musica.setDuracao(duracao);

        this.musicas.add(musica);
    }

    /**
     * Remove uma musica do album.
     *
     * @param indice indice da musica a ser removida do album
     */
    public void removeMusica(int indice) {
        this.musicas.remove(indice);
    }

    @Override
    public String toString() {
        String musicaString = "";

        for (int i = 0; i < this.getMusicas().size(); i++) {
            musicaString += this.getMusicas().get(i).toString(i + 1) + "\n";
        }

        return "-> Álbum: "
                + this.getNomeAlbum()
                + " | Data de lançamento: "
                + new SimpleDateFormat("dd/MM/yyyy").format(this.getDataLancamento())
                + "\n"
                + musicaString;
    }
}
