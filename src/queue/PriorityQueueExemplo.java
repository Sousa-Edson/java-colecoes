package queue;

import java.util.PriorityQueue;

public class PriorityQueueExemplo {
    public static void main(String[] args) {
        // criando uma priorityQueue de inteiros ( min-heap por padrao)
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // adicionando elementos à priorityQueue
        pq.add(10);
        pq.add(5);
        pq.add(20);
        pq.add(1);

        // exibindo os elementos
        System.out.println("Elementos na priority queue (em orderm de prioridade): ");
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
        }

    }
}