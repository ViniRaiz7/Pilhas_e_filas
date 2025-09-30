public class Main {
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
