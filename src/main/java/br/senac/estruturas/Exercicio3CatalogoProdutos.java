package br.senac.estruturas;

/**
 * Exercicio 3: lista sequencial estatica para catalogo reduzido.
 * A lista usa um array e um contador de elementos ocupados.
 */
public class Exercicio3CatalogoProdutos {
    // Array fixo; somente as posicoes de zero ate tamanho - 1 pertencem a lista.
    private final String[] produtos;
    private int tamanho;

    /** Construtor que define a capacidade fixa do catalogo. */
    public Exercicio3CatalogoProdutos(int capacidade) {
        // Cria o array que armazenara os produtos.
        produtos = new String[capacidade];
    }

    /** Adiciona um produto na primeira posicao livre do array. */
    public boolean adicionarNoFim(String produto) {
        // Verifica se todas as posicoes ja estao ocupadas.
        if (tamanho == produtos.length) {
            // Recusa a insercao quando o catalogo esta cheio.
            return false;
        }
        // tamanho tambem aponta para a primeira celula livre do array.
        // Armazena o produto na primeira posicao livre.
        produtos[tamanho] = produto;
        // Aumenta a quantidade logica de produtos.
        tamanho++;
        // Confirma que o produto foi adicionado.
        return true;
    }

    /** Insere um produto e desloca os posteriores uma posicao para a direita. */
    public boolean inserirNaPosicao(int indice, String produto) {
        // Valida simultaneamente a capacidade e o indice informado.
        if (tamanho == produtos.length || indice < 0 || indice > tamanho) {
            // Recusa indices invalidos ou uma lista sem espaco.
            return false;
        }
        // Desloca do fim para o inicio para nao sobrescrever produtos existentes.
        // Comeca na primeira celula livre e termina no indice de insercao.
        for (int posicao = tamanho; posicao > indice; posicao--) {
            // Move cada produto uma posicao para a direita.
            produtos[posicao] = produtos[posicao - 1];
        }
        // Coloca o novo produto no indice solicitado.
        produtos[indice] = produto;
        // Atualiza o tamanho logico depois da insercao.
        tamanho++;
        // Confirma que o produto foi inserido.
        return true;
    }

    /** Busca linearmente um produto e devolve seu indice. */
    public int buscar(String produto) {
        // Busca linear somente no trecho ocupado da lista estatica.
        // Percorre os indices validos da lista.
        for (int indice = 0; indice < tamanho; indice++) {
            // Compara o produto procurado com o produto atual.
            if (produtos[indice].equals(produto)) {
                // Retorna imediatamente o primeiro indice encontrado.
                return indice;
            }
        }
        // Usa -1 para representar que o produto nao foi encontrado.
        return -1;
    }

    /** Exibe cada produto acompanhado de seu indice. */
    public void exibir() {
        // Percorre somente as posicoes ocupadas.
        for (int indice = 0; indice < tamanho; indice++) {
            // Imprime o indice e o valor armazenado nele.
            System.out.println(indice + ": " + produtos[indice]);
        }
    }

    /** Executa uma demonstracao das operacoes da lista estatica. */
    public static void main(String[] args) {
        // Cria um catalogo com cinco posicoes fixas.
        Exercicio3CatalogoProdutos catalogo = new Exercicio3CatalogoProdutos(5);
        // Adiciona o primeiro produto ao final.
        catalogo.adicionarNoFim("Caderno");
        // Adiciona o segundo produto ao final.
        catalogo.adicionarNoFim("Caneta");
        // Insere a mochila no indice um, deslocando a caneta.
        catalogo.inserirNaPosicao(1, "Mochila");
        // Mostra a lista depois das insercoes.
        catalogo.exibir();
        // Busca a caneta e imprime o indice retornado.
        System.out.println("Caneta esta no indice: " + catalogo.buscar("Caneta"));
    }
}