package set;

import java.util.LinkedHashSet;

public class LinkedHashSetExamplo {
    public static void main(String[] args) {
        // criando um LinkedHashSet
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        // adicionando elementos
        linkedHashSet.add("Banana");
        linkedHashSet.add("Maçã");
        linkedHashSet.add("Laranja");
        linkedHashSet.add("Uva");

        // tentando aicionar um elemento duplicado
        linkedHashSet.add("Banana");

        // mostrando os elementos
        System.out.println("Elementos do LinkdHashSet:");
        for (String fruta : linkedHashSet) {
            System.out.println(fruta);
        }

        // verificando a presença de um elemento
        if (linkedHashSet.contains("Maçã")) {
            System.out.println("A maçã está no LinkedHashSet");
        }

        // removendo um elemento
        linkedHashSet.remove("Uva");

        System.out.println("Apos remover 'Uva'");
        System.out.println(linkedHashSet);
    }
}
