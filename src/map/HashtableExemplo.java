package map;

import java.util.Hashtable;

public class HashtableExemplo {
    public static void main(String[] args) {
        // Criando uma Hashtable
        Hashtable<String, Integer> tabela = new Hashtable<>();

        // Inserindo elementos na tabela
        tabela.put("um", 1);
        tabela.put("dois", 2);
        tabela.put("três", 3);

        // Acessando elementos usando as chaves
        System.out.println("Valor para 'um': " + tabela.get("um")); // Saída: 1
        System.out.println("Valor para 'dois': " + tabela.get("dois")); // Saída: 2

        // Verificando se a chave existe
        if (tabela.containsKey("três")) {
            System.out.println("A chave 'três' está presente.");
        }

        // Removendo um elemento
        tabela.remove("dois");
        System.out.println("Após remoção, valor para 'dois': " + tabela.get("dois")); // Saída: null
    }
}
