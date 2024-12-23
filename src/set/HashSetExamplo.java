package set;

import java.util.HashSet;

public class HashSetExamplo {
    public static void main(String[] args) {

        // criando um HashSet
        HashSet<String> frutas = new HashSet<>();

        // adicionando elementos ao HashSet
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Laranja");
        frutas.add("Maçã");

        // exibindo os elementos do HashSet
        System.out.println("Frutas no HashSet: " + frutas);

        // verificando se um elemento existe
        if (frutas.contains("Banana")) {
            System.out.println("A banana existe no conjunto");
        }

        // removendo um elemento
        frutas.remove("Laranja");
        System.out.println("Frutas no HashSet após a remoção: " + frutas);

        // internado sobre os elementos
        System.out.println("Interando pelo HashSet:");
        for (String fruta : frutas) {
            System.out.println(fruta);
        }

        // tamanho do HashSet
        System.out.println("Tamanho do HashSet: " + frutas.size());

        // limpano o HashSet
        frutas.clear();
        System.out.println("Após limpar o HashSet: " + frutas);
    }
}
