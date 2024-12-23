package list.stack;

import java.util.Stack;

public class StackExemplo {

    public static void main(String[] args) {
        // criando uma pilha
        Stack<String> stack = new Stack<>();

        // adicionando elemento a pilha
        stack.push("Primeiro");
        stack.push("Segundo");
        stack.push("Terceiro");

        // exibindo a pilha
        System.out.println("Pilha: " + stack);

        // removendo o elemento do too da pilha
        String removeElemento = stack.pop();
        System.out.println("Elemento removido: " + removeElemento);

        // exibindo o elemento no topo sem remove-lo
        String topElemento = stack.peek();
        System.out.println("Elemento no topo: " + topElemento);

        // verificando se a pilha esta vazia
        boolean isEmpty = stack.isEmpty();
        System.out.println("A pilha esta vazia? " + isEmpty);

        // exibindo a pilha apos as operações
        System.out.println("Pilha atualizada " + stack);

    }
}