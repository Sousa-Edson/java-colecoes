package map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExamplo {
    public static void main(String[] args) {
        // Criando um TreeMap
        TreeMap<Integer, String> map = new TreeMap<>();

        // Adicionando elementos ao TreeMap
        map.put(1, "Maçã");
        map.put(3, "Banana");
        map.put(2, "Laranja");

        // Exibindo o TreeMap
        System.out.println("Conteúdo do TreeMap: " + map);

        // Acessando um valor com chave específica
        String valor = map.get(2);
        System.out.println("Valor da chave 2: " + valor);

        // Removendo um elemento
        map.remove(1);
        System.out.println("Após remover chave 1: " + map);

        // Iterando sobre as chaves e valores
        System.out.println("Iterando sobre o TreeMap:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Chave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

        // Exibindo a primeira e última chave
        System.out.println("Primeira chave: " + map.firstKey());
        System.out.println("Última chave: " + map.lastKey());
    }
}
