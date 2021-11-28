public class App {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);
        Vetor vetor2 = new Vetor(10);
        
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
        System.out.println(vetor.busca(2));
        System.out.println(vetor.buscaPosicao("elemento 1"));


        vetor2.adiciona("B");
        vetor2.adiciona("C");
        vetor2.adiciona("E");
        vetor2.adiciona("F");
        vetor2.adiciona("G");
        

        System.out.println(vetor2);

        vetor2.adicionaNaPosicao(0, "A");

        System.out.println(vetor2);

        vetor2.adicionaNaPosicao(3, "D");

        System.out.println(vetor2);

        Vetor vetor3 = new Vetor(3);

        vetor3.adiciona("B");
        vetor3.adiciona("C");
        vetor3.adiciona("E");
        vetor3.adiciona("F");
        vetor3.adiciona("G");

        System.out.println(vetor3);
    }
}
