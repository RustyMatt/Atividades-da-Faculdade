
package javaapplication5;

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
