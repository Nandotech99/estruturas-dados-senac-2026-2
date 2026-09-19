
    public class Estacionamento{
        private  String [] placas;
        private int vagas;
        private int topo =-1;

        public Estacionamento(int vagas) {
            this.vagas = vagas;
            this.placas=new String[vagas];
        }
        public void estacionar(String placaNum){
            if(topo==vagas){
                System.out.println("SEM VAGAS!");
            }else{
                topo++;
                placas[topo]=placaNum;
            }
        }

        public void sair(){
            if (topo==-1){
                System.out.println("ESTACIONAMENTO VAZIO!");
            }  else{
                System.out.println("SAIDA DO CARRO "+placas[topo]);
                placas[topo]="______";
                topo--;
            }
        }
        public void exibir(){
            for (int i =0;i<placas.length;i++){
                System.out.println(placas[i]);
            }
        }
        public void vagasSTATUS(){
            if (topo==-1){
                System.out.println("ESTACIONAMENTO VAZIO!");
            } else if (topo>= placas.length) {
                System.out.println("ESTACIONAMENTO CHEIO!");
            }
        }



    }

