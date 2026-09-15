package br.senac.estruturas;

/**
 * Exercicio 4: historico estatico para a funcao desfazer.
 * A pilha permite desfazer primeiro a acao mais recente.
 */
public class Exercicio4DesfazerTexto {
    // Array fixo que guarda as acoes na mesma ordem em que foram realizadas.
    private final String[] acoes;
    // A ultima acao registrada esta em topo; -1 representa historico vazio.
    private int topo;

    /** Construtor que cria o historico com capacidade fixa. */
    public Exercicio4DesfazerTexto(int capacidade) {
        // Cria o array para armazenar as acoes do usuario.
        acoes = new String[capacidade];
        // Define a pilha como vazia.
        topo = -1;
    }

    /** Registra uma nova acao no topo do historico. */
    public boolean registrarAcao(String acao) {
        // Verifica se o topo ja esta na ultima posicao do array.
        if (topo == acoes.length - 1) {
            // Recusa a nova acao porque a capacidade e fixa.
            return false;
        }
        // Registrar equivale a empilhar uma nova acao no topo.
        // Avanca o topo para a proxima posicao livre.
        topo++;
        // Armazena a acao na posicao do novo topo.
        acoes[topo] = acao;
        // Confirma que a acao foi registrada.
        return true;
    }

    /** Remove e devolve a acao mais recente do historico. */
    public String desfazer() {
        // Verifica se nao existem acoes para desfazer.
        if (topo == -1) {
            // Retorna nulo para informar que a pilha esta vazia.
            return null;
        }
        // Desfazer remove apenas a acao mais recente, respeitando LIFO.
        // Guarda a acao antes de retirar sua referencia do array.
        String ultimaAcao = acoes[topo];
        // Limpa a posicao que foi liberada.
        acoes[topo] = null;
        // Faz o topo voltar para a acao anterior.
        topo--;
        // Devolve a acao que foi removida.
        return ultimaAcao;
    }

    /** Consulta a acao mais recente sem removê-la. */
    public String ultimaAcao() {
        // Consulta o topo sem alterar a estrutura.
        // Retorna nulo se a pilha estiver vazia ou a acao do topo caso contrario.
        return topo == -1 ? null : acoes[topo];
    }

    /** Executa uma demonstracao de registro, desfazer e consulta. */
    public static void main(String[] args) {
        // Cria um historico com quatro posicoes fixas.
        Exercicio4DesfazerTexto historico = new Exercicio4DesfazerTexto(4);
        // Registra a primeira acao.
        historico.registrarAcao("Digitei titulo");
        // Registra a segunda acao.
        historico.registrarAcao("Apliquei negrito");
        // Registra a terceira acao, que ficara no topo.
        historico.registrarAcao("Apaguei paragrafo");
        // Desfaz e imprime a acao mais recente.
        System.out.println("Desfazer: " + historico.desfazer());
        // Consulta e imprime a acao que agora esta no topo.
        System.out.println("Acao atual no topo: " + historico.ultimaAcao());
    }
}