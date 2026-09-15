package br.senac.estruturas;

/**
 * Exercicio 1: controle de vagas em uma rua sem manobra lateral.
 * A estrutura usada e uma pilha estatica, com regra LIFO.
 */
public class Exercicio1Estacionamento {
    // Array de capacidade fixa: representa as vagas da rua.
    private final String[] placas;
    // Indice do ultimo carro que entrou; -1 significa nenhuma vaga ocupada.
    private int topo;

    /** Construtor que cria o estacionamento com uma capacidade fixa. */
    public Exercicio1Estacionamento(int capacidade) {
        // Cria o array com a quantidade fixa de vagas recebida.
        placas = new String[capacidade];
        // Define -1 para indicar que nenhum carro esta estacionado.
        topo = -1;
    }

    /** Tenta colocar uma placa no topo da pilha de carros. */
    public boolean estacionar(String placa) {
        // Verifica se todas as vagas ja estao ocupadas.
        if (estaCheia()) {
            // Informa que a insercao nao foi realizada.
            System.out.println("Estacionamento cheio: " + placa + " nao entrou.");
            // Retorna falso para indicar falha na operacao.
            return false;
        }
        // O novo carro ocupa sempre a posicao imediatamente apos o topo atual.
        // Avanca o indice do topo para a nova vaga.
        topo++;
        // Guarda a placa na posicao indicada pelo topo.
        placas[topo] = placa;
        // Retorna verdadeiro para indicar que o carro entrou.
        return true;
    }

    /** Remove e devolve a placa do ultimo carro que entrou. */
    public String sair() {
        // Verifica se nao ha carros para retirar.
        if (estaVazia()) {
            // Retorna nulo porque a pilha esta vazia.
            return null;
        }
        // Apenas o carro do topo tem acesso direto a saida.
        // Copia a placa antes de alterar a pilha.
        String placa = placas[topo];
        // Limpa a referencia da vaga que acabou de ser liberada.
        placas[topo] = null;
        // Reposiciona o topo para o carro anterior.
        topo--;
        // Devolve a placa do carro que saiu.
        return placa;
    }

    /** Informa se nao existe nenhum carro na pilha. */
    public boolean estaVazia() { return topo == -1; }
    /** Informa se o topo chegou ao ultimo indice do array. */
    public boolean estaCheia() { return topo == placas.length - 1; }

    /** Mostra os carros atualmente ocupando as vagas. */
    public void exibir() {
        // Monta a mensagem usando somente as vagas ocupadas.
        System.out.println("Saida <- " + String.join(" | ", placasDisponiveis()) + " <- Entrada");
    }

    /** Copia somente o trecho ocupado do array original. */
    private String[] placasDisponiveis() {
        // Cria um array do tamanho logico para nao incluir vagas vazias.
        String[] emUso = new String[topo + 1];
        // Percorre todas as posicoes ocupadas, da base ate o topo.
        for (int indice = 0; indice <= topo; indice++) {
            // Copia a placa da vaga original para o array de exibicao.
            emUso[indice] = placas[indice];
        }
        // Devolve o array temporario com as placas validas.
        return emUso;
    }

    /** Executa uma demonstracao completa da pilha de estacionamento. */
    public static void main(String[] args) {
        // Uma capacidade pequena deixa visivel o limite da estrutura estatica.
        // Cria um estacionamento com tres vagas.
        Exercicio1Estacionamento estacionamento = new Exercicio1Estacionamento(3);
        // Estaciona o primeiro veiculo.
        estacionamento.estacionar("ABC-1234");
        // Estaciona o segundo veiculo.
        estacionamento.estacionar("DEF-5678");
        // Estaciona o terceiro veiculo.
        estacionamento.estacionar("GHI-9012");
        // Mostra os tres veiculos na pilha.
        estacionamento.exibir();
        // Remove e imprime o ultimo veiculo que entrou.
        System.out.println("Veiculo que saiu: " + estacionamento.sair());
        // Mostra o estado depois da remocao.
        estacionamento.exibir();
    }
}