public class App {
    public static void main(String[] args) throws Exception {
        Vetor vetor = new Vetor(10);
        
        
        vetor.adiciona("elemento 1");
        vetor.adiciona("elemento 2");
        vetor.adiciona("elemento 3");
        
        System.out.println(vetor.tamanho());
        System.out.println(vetor.toString());
        System.out.println(vetor.busca(2));
        System.out.println(vetor.buscaPosicao("elemento 1"));
    }
}
