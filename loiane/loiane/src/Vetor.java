
public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

    public boolean adiciona(String elemento){
        
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }else{
            //throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
            return false;
        }
    }

    public String busca(int posicao) throws Exception{
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        return this.elementos[posicao];
    }

    public int buscaPosicao(String el){
        for (int i = 0; i < elementos.length; i++) { //busca sequencial
            if(this.elementos[i].equals(el)){
                return i;
            }
        }
        return -1; //posicao não existente
    }

    public int tamanho(){
        return this.tamanho;
    }

    @Override
    public String toString(){

        StringBuilder s = new StringBuilder();
        s.append("[ ");

        for (int i = 0; i < this.tamanho-1; i++) {
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho-1]);
        }

        s.append(" ]");

        return s.toString();
    }
}
