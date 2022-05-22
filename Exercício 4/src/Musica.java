public class Musica {
    private String nomeMusica;
    private float duracao;

    public String getNomeMusica() {
        return nomeMusica;
    }

    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    public float getDuracao() {
        return duracao;
    }

    public String getDuracaoString() {
        int minutos = (int) Math.floor(this.duracao / 60);
        int segundos = (int) this.duracao % 60;

        return "00".substring(String.valueOf(minutos).length())
                + minutos
                + ":"
                + "00".substring(String.valueOf(segundos).length())
                + segundos;
    }

    public void setDuracao(float duracao) {
        this.duracao = duracao;
    }

    public String toString(int indiceMuscia) {
        return "\t#"
                + indiceMuscia
                + " - "
                + this.getNomeMusica()
                + "\n\tDuração: "
                + this.getDuracaoString();
    }
}
