package br.senac.estruturas;

/**
 * Exercicio 5: fila circular de documentos para uma impressora.
 * A fila respeita a ordem de chegada dos documentos.
 */
public class Exercicio5Impressora {
    // Array fixo que suporta uma quantidade maxima de documentos pendentes.
    private final String[] documentos;
    // Frente e fim logicos da fila circular, respectivamente.
    private int proximoParaImprimir;
    private int proximaPosicaoLivre;
    // Contador usado nas verificacoes de cheio e vazio.
    private int tamanho;

    /** Construtor que cria a fila com capacidade fixa. */
    public Exercicio5Impressora(int capacidade) {
        // Cria o array que armazenara os documentos pendentes.
        documentos = new String[capacidade];
    }

    /** Coloca um documento no fim da fila de impressao. */
    public boolean enviarDocumento(String documento) {
        // Verifica se nao ha nenhuma posicao livre.
        if (tamanho == documentos.length) {
            System.out.println("Fila de impressao cheia.");
            // Informa que o documento nao entrou na fila.
            return false;
        }
        // Todo documento novo entra depois dos que ja aguardam impressao.
        // Guarda o documento na proxima posicao livre.
        documentos[proximaPosicaoLivre] = documento;
        // Avanca o fim da fila e volta ao inicio quando necessario.
        proximaPosicaoLivre = (proximaPosicaoLivre + 1) % documentos.length;
        // Atualiza o total de documentos pendentes.
        tamanho++;
        // Confirma que o documento foi enviado.
        return true;
    }

    /** Remove e devolve o documento mais antigo da fila. */
    public String imprimirProximo() {
        // Verifica se nao existe documento aguardando.
        if (tamanho == 0) {
            // Retorna nulo porque a fila esta vazia.
            return null;
        }
        // A impressora atende o documento da frente, o mais antigo da fila.
        // Guarda o documento que sera impresso.
        String documento = documentos[proximoParaImprimir];
        // Libera a celula depois de retirar o documento.
        documentos[proximoParaImprimir] = null;
        // Avanca a frente da fila de forma circular.
        proximoParaImprimir = (proximoParaImprimir + 1) % documentos.length;
        // Diminui a quantidade de documentos pendentes.
        tamanho--;
        // Devolve o documento que foi impresso.
        return documento;
    }

    /** Retorna quantos documentos ainda aguardam impressao. */
    public int quantidadePendente() { return tamanho; }

    /** Executa uma demonstracao do envio e da impressao de documentos. */
    public static void main(String[] args) {
        // Cria uma fila de impressao com tres posicoes fixas.
        Exercicio5Impressora impressora = new Exercicio5Impressora(3);
        // Envia o primeiro documento.
        impressora.enviarDocumento("relatorio.pdf");
        // Envia o segundo documento.
        impressora.enviarDocumento("notas.txt");
        // Imprime o primeiro documento enviado.
        System.out.println("Imprimindo: " + impressora.imprimirProximo());
        // Envia outro documento para a vaga que foi liberada.
        impressora.enviarDocumento("contrato.pdf");
        // Consulta e imprime a quantidade restante na fila.
        System.out.println("Pendentes: " + impressora.quantidadePendente());
    }
}