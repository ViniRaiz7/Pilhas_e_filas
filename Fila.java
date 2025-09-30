// Questao 5

public class Fila {
    private int[] elementos;
    private int inicio;
    private int fim;
    private int tamanho;

    public Fila(int capacidade) {
        elementos = new int[capacidade];
        inicio = 0;
        fim = 0;
        tamanho = 0;
    }

    public void enqueue(int valor) {
        if (tamanho == elementos.length) {
            System.out.println("Fila cheia! Não é possível inserir o valor: " + valor);
            return;
        }
        elementos[fim] = valor;
        fim++;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Fila vazia! Não há elementos para remover.");
            return -1;
        }
        int valor = elementos[inicio];
        inicio++;
        tamanho--;
        return valor;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Fila vazia! Não há elementos para consultar.");
            return -1;
        }
        return elementos[inicio];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public static void main(String[] args) {
        Fila fila = new Fila(5);

        fila.enqueue(100);
        fila.enqueue(200);
        fila.enqueue(300);

        System.out.println("Primeiro elemento da fila: " + fila.peek());

        System.out.println("Removendo elementos:");
        while (!fila.isEmpty()) {
            System.out.println(fila.dequeue());
        }
    }
}
