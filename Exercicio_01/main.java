public class Main {
    public static void main(String[] args) {
        Estacionamento estacionamento=new Estacionamento(3);
        estacionamento.estacionar("XHW99");
        estacionamento.estacionar("AKD02");
        estacionamento.estacionar("LXY92");
        estacionamento.exibir();
        estacionamento.sair();
        estacionamento.exibir();
        estacionamento.vagasSTATUS();
    }
}
