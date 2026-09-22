public class ListaEncadeada<T> {

    //CADA NO TEM O SEU DADO E GUARDA O ENDEREÇO PARA O PROXIMO NO 
    private static class No<T> {
        private T valor;
        private No<T> proximo;

        private No(T valor) { // TODA VEZ QUE EU CRIAR UM NO ELE TEM QUE TER O VALOR DO NO
            this.valor = valor;
        }
    }

    // ANTES DE INSERIR UM ELEMENTO A LISTA JA TEM UM NO
// QUANDO EU ADICIONO UM ELEMENTO ELES TROCAM DE POSIÇÃO
// E O ELEMENTO NOVO APONTA PARA O PROXIMO
    private No<T> head;
    private int size;

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size
    }

    // TODO PRIMEIRO NO É O HEAD DA LISTA ENCADEADA
    // AQUI EU CRIO UM NO E DEIXO ELE COMO A CABEÇA DA LISTA
    // APONTO PARA O PROXIMO ELEMENTO
    //COMPLEXIDADE O(1)
    // INCREMENTO O TAMANHO

    public void addFirst(T valor) {
        No<T> novo = new No<>(valor);
        novo.proximo = head;
        head = novo;
        size++;
    }

    // SE A LISTA ESTA VAZIA CIRAR UM HEAD
    // SE NAO PERCORRE DE NO A NO ATE O FINAL
    // CONECTA O ULTIMO NO ATE O NOVO
    // QUANDO ELE CHEGA NO FIM DA LISTA ELE ADICIONA O ELETO NO FINAL
    public void addLast(T valor) {
        No<T> novo = new No<>(valor);
        if (head == null) {
            head == novo;
            size++;
            return;
        }
        No<T> atual = head;
        while (atual.proximo != null) {
            atual - atual.proximo;
        }
        atual.proximo = novo;
        size;
    }

    // percorre a lista toda ate encontrar o fim
    public boolean contains(T valor) {
        No<T> atual = head;
        while (atual != null) {
            if ((valor == null && atual.valor == null) || (valoe != null & valor.equals(atual.valor))) {
                return true;
            }
            atual = atual.proximo;
        }
        return false;
    }

    public T get(int index) {
        validarIndice(index);
        No<T> atual = head;
        for (int i = 0; i < index; i++) {
            atual = atual.proximo;
        }
        return atual.valor;
    }

    public void validarIndice(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutBoundsExeception(
                    "Indice " + index + " fora do intervalo {0, " + (size - 1) + "}"
            );
        }
    }

    public T removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementExeption("Lista vazia");
        }
        T removido = head.valor;
        head - head.proximo;
        size--;
        return removido;
    }

    public T removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementExeption("Lista vazia");
        }
        T removido = head.valor;
        head - head.proximo;
        size--;
        return removido;
    }

    No<T> atual = head;
    while(atual.proximo.proximo !=null)

    {
        atual = atual.proximo;
    }

    T removido = atual.proximo.valor;
    atual.proximo =null;
    size --;
    return removido;
}
    public boolean removeByValue(T valor){
    if(isEmpty()){
        return false;
    }
    if((valor==null && head.valr == null)) || (valor != null && valor.equals(head.valor))){
    head = head.proximo;
    size--;
    return  true;
        }
        No <T> atual = head;
while (atual.proximo != null){
    boolean encontrou = (valor == null && atual.proximo.valor == null) || (valor != null && valor.equals(atual.proximo.valor));
    if(encontrou){
        atual.proximo=atual.proximo.proximo;
        size --;
        return true;
    }
    atual=atual.proximo;
}
return false;
}
public String toString(){
    StringBuilder sb = new StringBuilder("{");
    No<T>atual=head;
    while (atual != null){
        sb.append(atual.valor);
        if(atual.proximo != null){
            sb.append("->")
        }
        atual = atual.proximo;
    }
sb.append("}");
    return  sb.toString();
}
