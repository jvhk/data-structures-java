import java.util.ArrayList;
import java.util.Scanner;

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

        vetor3.removeDaPosicao(1);

        System.out.println(vetor3);

        vetor3.removeElementoPorNome("F", vetor3);

        System.out.println(vetor3);


        //Vetor de multiplos tipos
        VetorDeObjetos vetorObj = new VetorDeObjetos(10);

        vetorObj.adiciona(5);
        vetorObj.adiciona("4");
        vetorObj.adiciona(6.2);


        System.out.println(vetorObj);

        ListaComGenerics<String> list = new ListaComGenerics<String>(3);
        list.adiciona("elemento1");
        list.adiciona("elemento2");

        System.out.println(list);

        //ArrayList <- estrutura de dados pronta
        ArrayList<String> array = new ArrayList<String>();
        array.add("A");
        array.add("B");
        array.add("C"); 
        array.add(2, "element");   

        System.out.println(array);

        boolean existe = array.contains("A");

        System.out.println(existe);

        int posicao = array.indexOf("C");

        System.out.println(posicao);

        String busca_por_pos = array.get(3);

        System.out.println(busca_por_pos);

        //Exercicios
        ListaComGenerics<String> newlist = new ListaComGenerics<String>(10);

        newlist.adiciona("elemento 1");
        newlist.adiciona("elemento 2");
        newlist.adiciona("elemento 3");
        newlist.adiciona("elemento 2");

        boolean status = newlist.contem("elemento 1");
        System.out.println("Var status: " + status);
        System.out.println(newlist.ultimoIndice("elemento 4"));
        System.out.println(newlist);
        newlist.removeElementoGenerico("elemento 2");
        System.out.println(newlist);
        System.out.println(newlist.obtem(2));
        newlist.removeTodosElementos();
        System.out.println("List esvaziada: " + newlist);
                
    }

    

    
}
