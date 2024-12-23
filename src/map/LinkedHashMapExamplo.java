package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExamplo {
    public static void main(String[] args) {
        // Criando um LinkedHashMap

        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();

        // adicionando elementos
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(2, "Python");
        linkedHashMap.put(3, "C++");
        linkedHashMap.put(4, "JavaScript");

        // exibindo os elementos (orde de inserção é mantida)
        System.out.println("Elementos no LinkedHashMap: ");
        for (Map.Entry<Integer, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // acessando um elemento
        String value = linkedHashMap.get(2);
        System.out.println("Elemento acessado comm chave 2: " + value);

        // criando um linkedHashMap
        LinkedHashMap<Integer, String> accessOrderMap = new LinkedHashMap<>(16, 0.75f, true);
        accessOrderMap.put(1, "Java");
        accessOrderMap.put(2, "Python");
        accessOrderMap.put(3, "C++");
        accessOrderMap.put(4, "JavaScript");
        // Acessando alguns elementos
        accessOrderMap.get(2);
        accessOrderMap.get(4);

        // Exibindo os elementos (ordem de acesso é mantida)
        System.out.println("\nElementos no LinkedHashMap (ordem de acesso):");
        for (Map.Entry<Integer, String> entry : accessOrderMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}
