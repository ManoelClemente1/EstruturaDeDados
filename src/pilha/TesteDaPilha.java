package pilha;

import java.util.Stack;

public class TesteDaPilha {

    public static void main(String[] args) {
        Pilha pilha = new Pilha();

        pilha.push("Mauricio");
        System.out.println(pilha);

        pilha.push("Guilherme");
        System.out.println(pilha);

        String r1 = pilha.pop();
        System.out.println(r1);

        Stack<String> stack = new Stack<String>();
        stack.push("manoel");
        System.out.println(stack);
    }
}
