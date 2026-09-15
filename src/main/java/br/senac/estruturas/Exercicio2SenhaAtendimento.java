package br.senac.estruturas;

/**
 * Exercicio 2: fila circular de senhas para um guiche.
 * A estrutura usada e uma fila estatica, com regra FIFO.
 */
public class Exercicio2SenhaAtendimento {
    // Array fixo que armazena as senhas ainda nao atendidas.
    private final String[] senhas;
    // Inicio indica a frente; fim indica a proxima vaga de entrada.
    private int inicio;
    private int fim;
    // Contador necessario para distinguir fila cheia de fila vazia.
    private int tamanho;

    /** Construtor que cria a fila com capacidade fixa. */
    public Exercicio2SenhaAtendimento(int capacidade) {
        // Cria o array que armazenara as senhas.
        senhas = new String[capacidade];
    }

    /** Insere uma nova senha no fim da fila. */
    public boolean emitirSenha(String senha) {
        // Verifica se nao existe espaco disponivel.
        if (estaCheia()) {
            // Informa a falha da operacao ao chamador.
            return false;
        }
        // A senha entra no fim logico, preservando a ordem de chegada.
        // Grava a senha na proxima posicao livre.
        senhas[fim] = senha;
        // O modulo retorna ao indice zero ao ultrapassar a ultima celula.
        // Avanca o fim para a proxima posicao circular.
        fim = (fim + 1) % senhas.length;
        // Registra que a fila ganhou mais uma senha.
        tamanho++;
        // Confirma que a senha foi inserida.
        return true;
    }

    /** Remove e devolve a senha que esta ha mais tempo aguardando. */
    public String chamarProxima() {
        // Verifica se nao existe senha para chamar.
        if (estaVazia()) {
            // Retorna nulo quando a fila esta vazia.
            return null;
        }
        // A senha atendida e sempre a que esta na frente da fila.
        // Copia a senha da frente antes de liberar sua posicao.
        String senha = senhas[inicio];
        // Limpa a celula que deixou de fazer parte da fila.
        senhas[inicio] = null;
        // Avanca a frente para a proxima senha, usando o formato circular.
        inicio = (inicio + 1) % senhas.length;
        // Registra que uma senha foi atendida.
        tamanho--;
        // Devolve a senha chamada.
        return senha;
    }

    /** Retorna verdadeiro quando nenhuma senha esta aguardando. */
    public boolean estaVazia() { return tamanho == 0; }
    /** Retorna verdadeiro quando todas as posicoes estao ocupadas. */
    public boolean estaCheia() { return tamanho == senhas.length; }

    /** Exibe as senhas na ordem logica da fila. */
    public void exibirFila() {
        // Imprime a identificacao do inicio da fila.
        System.out.print("Frente -> ");
        // Visita somente a quantidade de senhas realmente armazenadas.
        for (int posicao = 0; posicao < tamanho; posicao++) {
            // Converte a posicao logica em uma celula fisica do array circular.
            int indiceReal = (inicio + posicao) % senhas.length;
            // Imprime a senha encontrada na celula calculada.
            System.out.print(senhas[indiceReal] + " ");
        }
        // Imprime a identificacao do fim da fila.
        System.out.println("<- Fim");
    }

    /** Executa uma demonstracao do atendimento em ordem FIFO. */
    public static void main(String[] args) {
        // Cria uma fila com tres posicoes fixas.
        Exercicio2SenhaAtendimento fila = new Exercicio2SenhaAtendimento(3);
        // Emite a primeira senha.
        fila.emitirSenha("A001");
        // Emite a segunda senha.
        fila.emitirSenha("A002");
        // Emite a terceira senha e ocupa a fila.
        fila.emitirSenha("A003");
        // Chama a primeira senha emitida.
        System.out.println("Chamando: " + fila.chamarProxima());
        // Reaproveita a vaga liberada pela primeira senha.
        fila.emitirSenha("A004");
        // Exibe a ordem atual depois do movimento circular.
        fila.exibirFila();
    }
}