import java.util.Stack;

public class App2 {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<Integer>();

        //está vazio
        System.out.println(stack.isEmpty());

        //empilha
        stack.push(1);
        stack.push(2);
        stack.push(3);

        //tamanho
        System.out.println(stack.size());

        //espiar
        System.out.println(stack.peek());

        //remover do topo
        System.out.println("Pop: " + stack.pop());

        System.out.println(stack);
    }
}
