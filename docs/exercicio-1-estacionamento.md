# Exercicio 1 - Estacionamento sem manobra lateral

## Enunciado
Implemente o controle de um estacionamento com uma unica rua. Um carro novo entra pela entrada e fica atras dos anteriores. Como nao existe manobra lateral, somente o ultimo carro que entrou pode sair. A capacidade e fixa.

## TAD e decisao
O TAD abordado e a **pilha estatica**: dados guardados em um array e acesso controlado pelo topo. A regra e LIFO: ultimo a entrar, primeiro a sair. Esta e a estrutura adequada porque a saida fisica ocorre pela mesma extremidade da entrada. Uma fila seria inadequada: exigiria retirar carros que estao na frente para liberar o ultimo.

## Big O
`estacionar`, `sair`, `estaVazia` e `estaCheia` acessam apenas uma posicao ou contador: O(1). `exibir` e `placasDisponiveis` percorrem os carros usados: O(n). A memoria e O(capacidade), fixa depois da criacao.

## Leitura do codigo
1. `placas` e o array fixo que armazena cada placa.
2. `topo` guarda o indice do ultimo carro; `-1` representa pilha vazia.
3. O construtor cria o array na capacidade informada e inicializa o topo.
4. `estacionar` testa se o array chegou ao limite; se houver vaga, incrementa `topo` e grava a placa.
5. `sair` verifica vazio, guarda a placa do topo, limpa a celula e decrementa o topo.
6. `estaVazia` e `estaCheia` verificam os dois limites da pilha.
7. `exibir` mostra os carros e usa `placasDisponiveis` para copiar somente as posicoes ocupadas.
8. `placasDisponiveis` percorre de zero ate `topo`; o indice e a variavel de controle do laço.
9. `main` cria um estacionamento de tres vagas, insere tres carros e demonstra a retirada do ultimo.