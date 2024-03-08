
package estrutura_de_dados_pilha;

public class No {
    public char dado;
    public No next;
    
    public No(char dd){
        dado = dd;
        next = null;
    }
    
    public void displayNo(){
        System.out.println(dado);
    }
}
