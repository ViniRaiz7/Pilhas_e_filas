import java.util.LinkedList;

class Pilha<T> {
    private LinkedList<T> lista = new LinkedList<>();

    public void empilhar(T elemento) {
        lista.addFirst(elemento);
    }

    public T desempilhar() {
        if (lista.isEmpty()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        return lista.removeFirst();
    }

    public T topo() {
        if (lista.isEmpty()) {
            System.out.println("Pilha vazia!");
            return null;
        }
        return lista.getFirst();
    }

    public void mostrar() {
        System.out.println("Pilha: " + lista);
    }
}

class Fila<T> {
    private LinkedList<T> lista = new LinkedList<>();

    public void enfileirar(T elemento) {
        lista.addLast(elemento);
    }

    public T desenfileirar() {
        if (lista.isEmpty()) {
            System.out.println("Fila vazia!");
            return null;
        }
        return lista.removeFirst();
    }

    public T inicio() {
        if (lista.isEmpty()) {
            System.out.println("Fila vazia!");
            return null;
        }
        return lista.getFirst();
    }

    public void mostrar() {
        System.out.println("Fila: " + lista);
    }
}

public class Pilha_fila {
    public static void main(String[] args) {

        Pilha<Integer> pilha = new Pilha<>();
        System.out.println("PILHA");
        pilha.empilhar(10);
        pilha.empilhar(20);
        pilha.empilhar(30);
        pilha.mostrar();

        System.out.println("Topo da pilha: " + pilha.topo());
        System.out.println("Desempilhando: " + pilha.desempilhar());
        pilha.mostrar();

        Fila<String> fila = new Fila<>();
        System.out.println("\nFILA");
        fila.enfileirar("ViniRaiz7");
        fila.enfileirar("Lis");
        fila.enfileirar("Goku");
        fila.mostrar();

        System.out.println("Início da fila: " + fila.inicio());
        System.out.println("Desenfileirando: " + fila.desenfileirar());
        fila.mostrar();
    }
}
