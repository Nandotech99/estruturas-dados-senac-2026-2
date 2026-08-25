package com;

/**
 * Classe didática que relembra as diferentes formas de declarar e criar
 * vetores (arrays) em Java.
 *
 * <p>Um vetor é um bloco de memória de tamanho fixo, onde todos os
 * elementos são do mesmo tipo e podem ser acessados por um índice
 * numérico começando em 0. Existem várias sintaxes diferentes para
 * declarar e inicializar um vetor, e este arquivo demonstra as mais
 * comuns.</p>
 *
 * <p>Documentação detalhada em
 * {@code demo/docs/vetores/01-declaracao-vetores.md}.</p>
 */
public class DeclaracaoVetores {

    /**
     * Demonstra a forma mais "separada" de criar um vetor: primeiro se
     * declara a variável (dizendo o tipo dela), depois se cria o vetor
     * de fato (reservando espaço na memória), em uma instrução diferente.
     */
    public void declaracaoEmDuasEtapas() {
        System.out.println("\n--- Declaração em duas etapas ---");

        // Linha 1: apenas DECLARA a variável "vetorA" como sendo do tipo
        // "vetor de inteiros" (int[]). Neste momento, vetorA ainda não
        // aponta para nenhum vetor na memória — se tentássemos usá-la
        // agora, o código não compilaria.
        int[] vetorA;

        // Linha 2: agora sim CRIAMOS o vetor com "new int[5]". Isso
        // reserva, na memória, espaço para 5 números inteiros (posições
        // de índice 0 a 4) e faz vetorA apontar para esse espaço. Como
        // não informamos valores, o Java preenche cada posição com o
        // valor padrão do tipo int, que é 0.
        vetorA = new int[5];

        // Percorremos o vetor apenas para mostrar que todas as posições
        // já existem e começam zeradas.
        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("vetorA[" + i + "] = " + vetorA[i]);
        }
    }

    /**
     * Demonstra a criação do vetor já na mesma linha da declaração,
     * mas ainda sem valores definidos — apenas informando o tamanho.
     */
    public void declaracaoComTamanho() {
        System.out.println("\n--- Declaração já com o tamanho definido ---");

        // "int[] vetorB" declara a variável, e "= new int[3]" já cria o
        // vetor na mesma linha, com espaço para 3 elementos. Os valores
        // continuam sendo o padrão do tipo (0 para int).
        int[] vetorB = new int[3];

        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("vetorB[" + i + "] = " + vetorB[i]);
        }
    }

    /**
     * Demonstra a criação do vetor já com os valores definidos, usando a
     * palavra-chave {@code new} explicitamente.
     */
    public void declaracaoComValoresUsandoNew() {
        System.out.println("\n--- Declaração com valores, usando 'new' ---");

        // Aqui não informamos o tamanho entre colchetes — o Java conta
        // quantos valores foram passados dentro das chaves {10, 20, 30}
        // e usa essa contagem (3) como o tamanho do vetor.
        int[] vetorC = new int[]{10, 20, 30};

        for (int i = 0; i < vetorC.length; i++) {
            System.out.println("vetorC[" + i + "] = " + vetorC[i]);
        }
    }

    /**
     * Demonstra a forma "resumida" (literal) de criar um vetor com
     * valores, disponível apenas no exato momento da declaração da
     * variável — não pode ser usada depois, em uma atribuição separada.
     */
    public void declaracaoComValoresFormaResumida() {
        System.out.println("\n--- Declaração com valores, forma resumida ---");

        // Forma resumida: sem a palavra "new" e sem o tipo repetido.
        // O Java já sabe, pelo tipo da variável (int[]), que os valores
        // entre chaves devem ser inteiros. Essa forma só é válida na
        // MESMA linha em que a variável é declarada.
        int[] vetorD = {100, 200, 300, 400};

        for (int i = 0; i < vetorD.length; i++) {
            System.out.println("vetorD[" + i + "] = " + vetorD[i]);
        }

        // Importante (comentário, não código executável):
        // Isso NÃO seria permitido, pois a forma resumida só vale na
        // declaração:
        //
        //     int[] vetorE;
        //     vetorE = {1, 2, 3}; // erro de compilação
        //
        // Nesse caso seria obrigatório usar "new int[]{1, 2, 3}".
    }

    /**
     * Executa, em sequência, todas as formas de declaração demonstradas
     * nesta classe.
     */
    public void demonstrarTodos() {
        declaracaoEmDuasEtapas();
        declaracaoComTamanho();
        declaracaoComValoresUsandoNew();
        declaracaoComValoresFormaResumida();
    }
}