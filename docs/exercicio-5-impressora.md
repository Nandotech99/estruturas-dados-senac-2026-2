# Exercicio 5 - Fila de impressao

## Enunciado
Implemente a fila de uma impressora compartilhada com tres vagas. Documentos enviados devem ser impressos na ordem de envio e uma vaga liberada deve ser reutilizada pelo proximo documento.

## TAD e decisao
O TAD e uma **fila estatica circular**. Documentos de impressao obedecem FIFO, pois o primeiro enviado deve sair primeiro. A circularidade reaproveita as primeiras celulas ja impressas sem deslocamentos. Uma lista sequencial estatica poderia funcionar, mas remover a frente exigiria O(n), o que e pior para esse fluxo.

## Big O
`enviarDocumento`, `imprimirProximo` e `quantidadePendente` sao O(1). A memoria e O(capacidade). Nao existe exibicao neste exemplo; se houvesse, percorreria os pendentes em O(n).

## Leitura do codigo
1. `documentos` e o armazenamento fixo da fila.
2. `proximoParaImprimir` aponta para a frente e `proximaPosicaoLivre` para o fim logico.
3. `tamanho` registra a quantidade pendente e permite distinguir fila cheia de vazia.
4. O construtor cria o array; os tres contadores iniciam em zero.
5. `enviarDocumento` verifica capacidade, grava no fim, calcula o proximo indice com modulo e incrementa o tamanho.
6. `imprimirProximo` verifica vazio, recupera e limpa a frente, avanca circularmente e decrementa o tamanho.
7. `quantidadePendente` retorna diretamente o contador, sem percorrer o array.
8. `main` envia dois documentos, imprime o primeiro, envia outro e mostra os dois pendentes.