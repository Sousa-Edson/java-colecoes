package list.linkedList;

import java.util.LinkedList;

public class MeuLinkedList {
    public static void main(String[] args) {
        // Criando uma LinkedList de inteiros
        LinkedList<String> animais = new LinkedList<>();

        // 1. Adicionando elementos à LinkedList
        animais.add("Gato");
        animais.add("Cachorro");
        animais.add("Elefante");
        animais.add("Leão");

        System.out.println("Lista inicial: " + animais);

        // 2. Adicionando elementos em posições específicas
        animais.addFirst("Tigre"); // Adiciona no início da lista
        animais.addLast("Panda"); // Adiciona no final da lista
        System.out.println("Após adicionar no início e no fim: " + animais);

        // 3. Acessando elementos
        System.out.println("Primeiro elemento: " + animais.getFirst());
        System.out.println("Último elemento: " + animais.getLast());
        System.out.println("Elemento no índice 2: " + animais.get(2));

        // 4. Atualizando elementos
        animais.set(2, "Cavalo"); // Substitui o elemento no índice 2
        System.out.println("Após atualizar o índice 2: " + animais);

        // 5. Removendo elementos
        animais.removeFirst(); // Remove o primeiro elemento
        animais.removeLast(); // Remove o último elemento
        animais.remove("Cachorro"); // Remove pelo valor
        System.out.println("Após remoções: " + animais);

        // 6. Verificando se contém um elemento
        if (animais.contains("Elefante")) {
            System.out.println("A lista contém Elefante!");
        } else {
            System.out.println("A lista não contém Elefante!");
        }

        // 7. Iterando sobre a LinkedList
        System.out.println("Iterando sobre a lista:");
        for (String animal : animais) {
            System.out.println("- " + animal);
        }

        // 8. Tamanho da LinkedList
        System.out.println("Tamanho da lista: " + animais.size());
    }
}
