package map;

import java.util.HashMap;

public class HashMapExemplo {
    public static void main(String[] args) {
        // criar um HashMap
        HashMap<String, Integer> estoque = new HashMap<>();

        // adicionar itens ao HashMap
        estoque.put("Maças", 50);
        estoque.put("Laranjas", 30);
        estoque.put("Bananas", 20);
        estoque.put("Uvans", 15);

        // imprimir itens do HashMap
        System.out.println("Estoque inicial: " + estoque);

        // acessar um valor especifico
        String produto = "Bananas";
        if (estoque.containsKey(produto)) {
            System.out.println("Quantidade de " + produto + " : " + estoque.get(produto));
        } else {
            System.out.println(produto + " não esta disponivel nn estoque");
        }
        // Atualizar o valor de uma chave existente
        estoque.put("Maçãs", 45);
        System.out.println("Estoque atualizado: " + estoque);

        // Remover um item do HashMap
        estoque.remove("Uvas");
        System.out.println("Após remover Uvas: " + estoque);

        // Iterar sobre o HashMap
        System.out.println("Itens no estoque:");
        for (String chave : estoque.keySet()) {
            System.out.println(chave + ": " + estoque.get(chave));
        }
    }
}
