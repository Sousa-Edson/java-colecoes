package set;

import java.util.TreeSet;

public class TreeSetExamplo {
    public static void main(String[] args) {
        // criando um TreeSet
        TreeSet<String> treeSet = new TreeSet<>();

        // adicionando elementos
        treeSet.add("Banana");
        treeSet.add("Maçã");
        treeSet.add("Laranja");
        treeSet.add("Uva");

        // tentando adicionar um elemento duplicado
        boolean isAdded = treeSet.add("Banana");
        System.out.println("Elemento 'Banana' adicioando novamente?" + isAdded);

        // exibindo os elementos (em ordem crescente)
        System.out.println("Elementos do TreeSet: " + treeSet);

        // operações adicionais
        System.out.println("Primeiro elemento: " + treeSet.first());
        System.out.println("Último elemento: " + treeSet.last());
        System.out.println("Elemento maior ou igual a 'M': " + treeSet.ceiling("M"));
        System.out.println("Elemento menor ou igual a 'L': " + treeSet.floor("L"));

        // removendo um elemento
        treeSet.remove("Uva");
        System.out.println("Elementos do TreeSet após remoção: " + treeSet);
    }

}
