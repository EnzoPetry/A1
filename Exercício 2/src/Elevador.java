public class Elevador {
    private int andar,lugares,mudar;

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public int getLugares() {
        return lugares;
    }

    public void setLugares(int lugares) {
        this.lugares = lugares;
    }

    public int getMudar() {
        return mudar;
    }

    public void setMudar(int mudar) {
        this.mudar = mudar;
    }

    public void Inicializa(){
        andar = 0;
        lugares = 0;
    }

    public void Entra(){
        if(lugares <= 9 && lugares >= 0) {
            lugares++;
        }else{
            System.out.println("Numero Máximo alcançado");
        }
    }

    public void Sai(){
        if(lugares <= 9 && lugares >= 0) {
           lugares--;
        }else{
            System.out.println("Elevador vazio");
        }
    }

    public int Sobe(int mudar) {
        if (mudar+andar <= 13 && mudar+andar >= 0) {
            return andar += mudar;
        } else {
            System.out.println("Topo prédio atingido");
            return andar = 13;

        }
    }

    public int Desce(int mudar) {
        if (mudar+andar < 13 && mudar+andar >= 0) {
            return andar -= mudar;
        } else{
            System.out.println("Térreo");
            return andar = 0;
        }
    }
}
