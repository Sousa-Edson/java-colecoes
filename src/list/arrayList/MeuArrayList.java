package list.arrayList;

import java.util.ArrayList;

public class MeuArrayList {
    public static void main(String[] args) {
        // Criando um ArrayList de Strings
        ArrayList<String> frutas = new ArrayList<>();

        // 1. Adicionando elementos ao ArrayList
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Manga");

        System.out.println("Frutas inicial: " + frutas);

        // 2. Acessando elementos
        System.out.println("Primeira fruta: " + frutas.get(0)); // Acessa o primeiro elemento

        // 3. Atualizando elementos
        frutas.set(1, "Morango"); // Substitui "Banana" por "Morango"
        System.out.println("Após atualizar: " + frutas);

        // 4. Removendo elementos
        frutas.remove("Laranja"); // Remove "Laranja" pelo valor
        frutas.remove(2); // Remove o elemento no índice 2 (Manga, após remoção anterior)
        System.out.println("Após remover: " + frutas);

        // 5. Iterando sobre o ArrayList
        System.out.println("Iterando sobre a lista:");
        for (String fruta : frutas) {
            System.out.println("- " + fruta);
        }

        // 6. Verificando se contém um elemento
        if (frutas.contains("Maçã")) {
            System.out.println("A lista contém Maçã!");
        } else {
            System.out.println("A lista não contém Maçã!");
        }

        // 7. Obtendo o tamanho do ArrayList
        System.out.println("Tamanho da lista: " + frutas.size());
    }
}
