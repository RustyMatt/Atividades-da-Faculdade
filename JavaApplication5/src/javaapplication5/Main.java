
package javaapplication5;

public class Main {

    public static void main(String[] args) {
        String a = "(a)b([c]d)";
        String b = "(a(b)";
        String c = "(a[c)d]";
        PilhaDin pilha = new PilhaDin();
        
        for(int i = 0;i < a.length(); i++){
            if((a.charAt(i) == '(')||(a.charAt(i) == '[')){
                pilha.push(a.charAt(i));
            }else if(a.charAt(i) == ')'){
                if(pilha.isEmpty()){
                    System.out.println("Não é válido");
                    break;
                }else if(pilha.topo.dado != '('){
                    System.out.println("Não é válido");
                    break;
                }else if(pilha.topo.dado == '('){
                    pilha.pop();
                }
            }
        }
        for(int i = 0;i < b.length(); i++){
            if((b.charAt(i) == '(')||(b.charAt(i) == '[')){
                pilha.push(b.charAt(i));
            }else if(b.charAt(i) == ')'){
                if(pilha.isEmpty()){
                    System.out.println("Não é válido");
                    break;
                }else if(pilha.topo.dado != '('){
                    System.out.println("Não é válido");
                    break;
                }else if(pilha.topo.dado == '('){
                    pilha.pop();
                }
            }
        }
        for(int i = 0;i < c.length(); i++){
            if((c.charAt(i) == '(')||(c.charAt(i) == '[')){
                pilha.push(c.charAt(i));
            }else if(c.charAt(i) == ')'){
                if(pilha.isEmpty()){
                    System.out.println("Não é válido");
                    break;
                }else if(pilha.topo.dado != '('){
                    System.out.println("Não é válido");
                    break;
                }else if(pilha.topo.dado == '('){
                    pilha.pop();
                }
            }
        }
    }
    
}
