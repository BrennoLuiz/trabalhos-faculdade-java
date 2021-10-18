public class ListaVetor {
    
    private Pessoa[] pessoas = new Pessoa[6];
    private int total_de_pessoas = 0;
    
    public void adiciona(Pessoa pessoa){
        aumentaEspaco();
        this.pessoas[this.total_de_pessoas] = pessoa;
        this.total_de_pessoas++;
    }
    
    public void adiciona(int posicao, Pessoa pessoa){
        // implementação
    }
    
    public Pessoa pega(int posicao){
        // implementação
        return(null);
    }
    
    public void remove(int posicao){
        // implementação
    }
    
    public boolean contem(Pessoa pessoa){
        // implementação
        return(false);
    }
    
    public int tamanho(){
        // implementação
        return(0);
    }

    
    @Override
    public String toString() {
        String saida = "[]";
        if(this.total_de_pessoas != 0){
            saida = "[";
            for(int i = 0; i < this.total_de_pessoas - 1; i++){
                saida += this.pessoas[i] + ", ";
            }
            saida += this.pessoas[this.total_de_pessoas - 1] + "]";
        }
//        saida += "--> total de pessoas = " + this.total_de_pessoas + ", tamanho do vetor = " + this.pessoas.length;
        return(saida);
    }
    
    private void aumentaEspaco(){
        if(this.total_de_pessoas == this.pessoas.length){
            Pessoa[] novoVetor = new Pessoa[this.pessoas.length + 4];
            for(int i = 0; i < this.total_de_pessoas; i++)
                novoVetor[i] = this.pessoas[i];
            
            this.pessoas = novoVetor;
        }
    }
    
    
}
