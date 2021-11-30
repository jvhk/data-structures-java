public class VetorDeObjetos {
    private Object[] elementos;
    private int tamanho;

    public VetorDeObjetos(int capacidade){ //constructor
        this.elementos = new Object[capacidade];
        this.tamanho = 0;
    }

    private void aumentaCapacidade(){
        if(this.tamanho == this.elementos.length){
            Object[] elementosNovos = new Object[this.elementos.length * 2];
            for(int i=0; i<this.elementos.length; i++){
                elementosNovos[i] = this.elementos[i];
            }
            this.elementos = elementosNovos;
        }
    }

    public boolean adiciona(Object elemento){
        this.aumentaCapacidade();
        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }else{
            //throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
            return false;
        }
    }

    public boolean adicionaNaPosicao(int posicao,Object elemento){
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }

        this.aumentaCapacidade();
        
        for(int i = this.tamanho-1; i >= posicao; i--){
            this.elementos[i+1] = this.elementos[i];
        }
        this.elementos[posicao] = elemento;
        this.tamanho++;
        
        return true;        
    }

    public Object busca(int posicao){
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

    public void removeDaPosicao(int pos){
        if(!(pos >= 0 && pos < tamanho)){
            throw new IllegalArgumentException("Posição inválida");
        }
        for (int i = pos; i < this.tamanho-1; i++) {
            this.elementos[i] = this.elementos[i+1];
        }
        this.tamanho--; //reorganiza o tamanho do vetor após remoção
    }

    public void removeElementoPorNome(String nome, Vetor vetor){
        int pos = vetor.buscaPosicao(nome);
        if(pos > -1){
            vetor.removeDaPosicao(pos);
        }else{
            System.out.println("Elemento inexistente neste vetor");
        }
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
