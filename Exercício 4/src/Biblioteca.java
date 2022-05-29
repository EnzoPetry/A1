import java.util.ArrayList;
import java.util.Date;

public class Biblioteca {
    private ArrayList<Artista> listaArtista;

    public Biblioteca() {
        this.listaArtista = new ArrayList<>();
    }

    public ArrayList<Artista> getListaArtista() {
        return listaArtista;
    }

    public void setListaArtista(ArrayList<Artista> listaArtista) {
        this.listaArtista = listaArtista;
    }

    /**
     * Adiciona uma novo artista a biblioteca.
     *
     * @param nomeArtista nome do artista a ser adicionada
     */
    public void addArtista(String nomeArtista) {
        Artista artista = new Artista();
        artista.setNomeArtista(nomeArtista);

        this.listaArtista.add(artista);
    }

    /**
     * Busca por um artista na biblioteca.
     *
     * @param nomeArtista nome do artista a procurar
     */
    public int buscaArtista(String nomeArtista) {
        for (int i = 0; i < this.listaArtista.size(); i++) {
            if (this.listaArtista.get(i).getNomeArtista().equals(nomeArtista)) {
                return i;
            }
        }

        return -1;
    }

    /**
     * Busca por um album de um artista.
     *
     * @param nomeAlbum nome do album a procurar
     * @param indiceArtista indice do artista do album
     */
    public int buscaAlbum(String nomeAlbum, int indiceArtista) {
        if (indiceArtista < this.listaArtista.size() && indiceArtista >= 0) {
            ArrayList<Album> discografia = this.listaArtista.get(indiceArtista).getDiscografia();

            for (int i = 0; i < discografia.size(); i++) {
                if (discografia.get(i).getNomeAlbum().equals(nomeAlbum)) {
                    return i;
                }
            }
        }

        return -1;
    }

    /**
     * Adiciona um album do artista.
     *
     * @param nomeAlbum nome do album do artista
     * @param indiceArtista indice do artista do album
     * @param dataLancamento data de lançamento do album
     */
    public void addAlbum(int indiceArtista, String nomeAlbum, Date dataLancamento) {
        this.listaArtista.get(indiceArtista).addAlbum(nomeAlbum, dataLancamento);
    }

    /**
     * Adiciona uma musica a um album.
     *
     * @param indiceArtista indice do artista da musica
     * @param indiceAlbum indice do album da musica
     * @param nomeMusica nome da musica a ser adicionada
     * @param duracaoMusica duracao da musica a ser adicionada
     */
    public void addMusica(int indiceArtista, int indiceAlbum, String nomeMusica, float duracaoMusica) {
        this.listaArtista
                .get(indiceArtista)
                .getDiscografia()
                .get(indiceAlbum)
                .addMusica(nomeMusica, duracaoMusica);
    }

    //addMusica


    @Override
    public String toString() {
        String artistaString = "";

        for (int i = 0; i < this.getListaArtista().size(); i++) {
            artistaString += this.getListaArtista().get(i);
        }

        return "----------- Biblioteca de músicas ----------\n"
                + artistaString;
    }
}
