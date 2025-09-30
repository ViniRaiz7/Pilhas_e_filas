// Questao 4

public class Pilha {
    private int[] elementos;
    private int topo;

    public Pilha(int capacidade) {
        elementos = new int[capacidade];
        topo = -1; // pilha vazia
    }

    public void push(int valor) {
        if (topo < elementos.length - 1) {
            topo++;
            elementos[topo] = valor;
        } else {
            System.out.println("Pilha cheia! Não é possível inserir o valor: " + valor);
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int valor = elementos[topo];
            topo--;
            return valor;
        } else {
            System.out.println("Pilha vazia! Não há elementos para remover.");
            return -1;
        }
    }

    public int peek() {
        if (!isEmpty()) {
            return elementos[topo];
        } else {
            System.out.println("Pilha vazia! Não há elementos para consultar.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);

        pilha.push(10);
        pilha.push(20);
        pilha.push(30);

        System.out.println("Elemento no topo: " + pilha.peek());

        System.out.println("Removendo elementos:");
        while (!pilha.isEmpty()) {
            System.out.println(pilha.pop());
        }
    }
}
