import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void main(String[] args) throws Exception {        
        //MENU

        Scanner sc = new Scanner(System.in);
        ListaComGenerics<Contato> listaContatos = new  ListaComGenerics<Contato>(20);
        criarContatosDinamicamente(5, listaContatos);

        int op = 1;

        while(op != 0){
            op = obterOpcaoMenu(sc);
            switch(op){
                case 1:
                    adicionarContatoFinal(sc, listaContatos);
                    break;
                case 2:
                    adicionarContatoPosicao(sc, listaContatos);
                    break;
            }
        }

        System.out.println("Fim do programa");
        
    }

    private static void adicionarContatoFinal(Scanner sc, ListaComGenerics<Contato> list){
        System.out.println("Criando contato, entre com as informações:");
        String nome = leInfo("Entre com o nome", sc);
        String tel = leInfo("Entre com o telefone", sc);
        String email = leInfo("Entre com o email", sc);

        Contato contato = new Contato(nome, tel, email);

        list.adiciona(contato);

        System.out.println("Contato adicionado com sucesso");
        System.out.println(contato);
    }

    private static void adicionarContatoPosicao(Scanner sc, ListaComGenerics<Contato> list){
        System.out.println("Criando contato, entre com as informações:");
        String nome = leInfo("Entre com o nome", sc);
        String tel = leInfo("Entre com o telefone", sc);
        String email = leInfo("Entre com o email", sc);

        Contato contato = new Contato(nome, tel, email);

        int pos = leInfoInt("Entre com a posição a adicionar o contato", sc);

        try {
            list.adicionaNaPosicao(pos, contato);
            System.out.println("Contato adicionado com sucesso");
            System.out.println(contato);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println("Contato não adicionado");
        }
        

        System.out.println("Contato adicionado com sucesso");
        System.out.println(contato);
    }

    private static String leInfo(String msg, Scanner sc){
        System.out.println(msg);
        String entrada = sc.nextLine();

        return entrada;
    }

    private static int leInfoInt(String msg, Scanner sc){
        boolean entradaValida = false;
        int num = 0;
        while(!entradaValida){
            
            try {
                System.out.println(msg);
                String entrada = sc.nextLine();
        
                num = Integer.parseInt(entrada);  
                
                entradaValida = true;
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Entrada inválida, digite novamente");
            }
            
        }        

        return num;
    }

    private static int obterOpcaoMenu(Scanner scan){

        boolean entradaValida = false;
        String entrada;
        int op = 0;

        while(!entradaValida){
            System.out.println("Digite a opção desejada: ");
            System.out.println("1: Adiciona contato no fim do vetor");
            System.out.println("2: Adiciona contato em uma posição específica");
            System.out.println("3: Consulta contato de uma posição específica");
            System.out.println("4: Consulta contato");
            System.out.println("5: Consulta último indice do contato");
            System.out.println("6: Verifica se o contato existe");
            System.out.println("7: Excluir por posição");
            System.out.println("8: Excluir contato");
            System.out.println("9: Verifica tamanho do vetor");
            System.out.println("10: Limpar lista");
            System.out.println("11: Imprime lista");
            System.out.println("0: Sair");

            try {
                entrada = scan.nextLine();
                op = Integer.parseInt(entrada);

                if(op >= 0 && op <= 11){
                    entradaValida = true;
                }else{
                    throw new Exception();
                }
            } catch (Exception e) {
                //TODO: handle exception
                System.out.println("Entrada inválida\n\n");
            }

            
        }
        return 0;
    }

    private static void criarContatosDinamicamente(int quantidade, ListaComGenerics<Contato> lista){
        Contato contato;
        for (int i = 0; i < quantidade; i++) {            
            contato = new Contato();
            contato.setNome("Contato "+ i);
            contato.setEmail("contato"+ i +"@email.com");
            contato.setTelefone("1111-111"+ i);

            lista.adiciona(contato);
        }
    }
}
