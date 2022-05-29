public class Musica {
    private String nomeMusica;
    private float duracao;

    /**
     * @return nome da musica
     */
    public String getNomeMusica() {
        return nomeMusica;
    }

    /**
     * Altera o nome da musica
     *
     * @param nomeMusica nome da musica
     */
    public void setNomeMusica(String nomeMusica) {
        this.nomeMusica = nomeMusica;
    }

    /**
     * @return duração da musica
     */
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

    /**
     * Altera a duracao da musica
     *
     * @param duracao duracao da musica
     */
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
