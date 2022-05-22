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

    public String getNomeAlbum() {
        return nomeAlbum;
    }

    public void setNomeAlbum(String nomeAlbum) {
        this.nomeAlbum = nomeAlbum;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public ArrayList<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<Musica> musicas) {
        this.musicas = musicas;
    }

    public void addMusica(String nomeMusica, float duracao) {
        Musica musica = new Musica();

        musica.setNomeMusica(nomeMusica);
        musica.setDuracao(duracao);

        this.musicas.add(musica);
    }

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
