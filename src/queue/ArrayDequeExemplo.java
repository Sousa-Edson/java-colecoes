package queue;

import java.util.ArrayDeque;

public class ArrayDequeExemplo {
    public static void main(String[] args) {
        //criando uma instancia 
        ArrayDeque<String> deque = new ArrayDeque<>();

        //usando como fila (FIFO)
        System.out.println("USando como fila");
        deque.add("Elemento 1");
        deque.add("Elemento 2");
        deque.add("Elemento 3");

        //removendo elementos da fila
        while (!deque.isEmpty()) {
            System.out.println("Removido: "+deque.poll());
        }

        //usando como pilha (LIFO)
        System.out.println("Usando como pilha:");
        deque.push("Elemento A");
        deque.push("Elemento B");
        deque.push("Elemento C");

        //removendo elementos da pilha
        while (!deque.isEmpty()) {
            System.out.println("Removido: "+deque.pop());
        }

    }
    
}
