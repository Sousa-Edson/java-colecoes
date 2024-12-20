package list.vector;

import java.util.Vector;

public class MeuVector {
    public static void main(String[] args) {
        // Criando um Vector de Strings
        Vector<String> cores = new Vector<>();

        // 1. Adicionando elementos ao Vector
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");

        System.out.println("Cores iniciais: " + cores);

        // 2. Adicionando elementos em posições específicas
        cores.add(2, "Roxo"); // Adiciona "Roxo" no índice 2
        System.out.println("Após adicionar Roxo no índice 2: " + cores);

        // 3. Acessando elementos
        System.out.println("Primeira cor: " + cores.firstElement());
        System.out.println("Última cor: " + cores.lastElement());
        System.out.println("Cor no índice 3: " + cores.get(3));

        // 4. Atualizando elementos
        cores.set(1, "Laranja"); // Substitui o elemento no índice 1
        System.out.println("Após atualizar o índice 1: " + cores);

        // 5. Removendo elementos
        cores.remove("Verde"); // Remove "Verde" pelo valor
        cores.remove(0); // Remove o elemento no índice 0
        System.out.println("Após remoções: " + cores);

        // 6. Verificando se contém um elemento
        if (cores.contains("Amarelo")) {
            System.out.println("O Vector contém a cor Amarelo!");
        } else {
            System.out.println("O Vector não contém a cor Amarelo!");
        }

        // 7. Iterando sobre o Vector
        System.out.println("Iterando sobre o Vector:");
        for (String cor : cores) {
            System.out.println("- " + cor);
        }

        // 8. Obtendo capacidade e tamanho do Vector
        System.out.println("Capacidade atual do Vector: " + cores.capacity());
        System.out.println("Tamanho atual do Vector: " + cores.size());
    }
}
