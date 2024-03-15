
package javaapplication5;

public class PilhaDin {
    public No topo;
    
    public PilhaDin(){
        topo = null;
    }
    
    public boolean isEmpty(){
        return (topo == null);
    }
    
    public void push(char dd){
        No newNo = new No(dd);
        
        newNo.next = topo;
        topo = newNo;
    }
    
    public void pop(){
        if(!isEmpty()){
            topo = topo.next;
        }
    }
    public void display(){
        if (isEmpty()){
            System.out.println("Pilha Vazia");
        }else{
            No atual = topo;
            while(atual != null){
                atual.displayNo();
                atual = atual.next;
            }
        }
        System.out.println();
    }
}
