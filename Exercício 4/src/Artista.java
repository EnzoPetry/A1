import java.util.ArrayList;
import java.util.Date;

public class Artista {
    private String nomeArtista;

    private ArrayList<Album> discografia;

    public Artista() {
        this.discografia = new ArrayList<>();
    }

    public String getNomeArtista() {
        return nomeArtista;
    }

    public void setNomeArtista(String nomeArtista) {
        this.nomeArtista = nomeArtista;
    }

    public ArrayList<Album> getDiscografia() {
        return discografia;
    }

    public void setDiscografia(ArrayList<Album> discografia) {
        this.discografia = discografia;
    }

    public void addAlbum(String nomeAlbum, Date dataLancamento) {
        Album album = new Album();

        album.setNomeAlbum(nomeAlbum);
        album.setDataLancamento(dataLancamento);

        this.discografia.add(album);
    }

    public void removeAlbum(int indice) {
        this.discografia.remove(indice);
    }

    public Album buscaAlbum(int indice) {
        if (this.discografia.size() < indice || indice < 0) {
            System.out.println("Erro");
            return null;
        } else {
            return this.discografia.get(indice);
        }
    }

    @Override
    public String toString() {
        String albumString = "";

        for (int i = 0; i < this.getDiscografia().size(); i++) {
            albumString += this.getDiscografia().get(i) + "\n";
        }

        return "Nome artista: "
                + this.getNomeArtista()
                + "\n"
                + albumString;
    }
}
