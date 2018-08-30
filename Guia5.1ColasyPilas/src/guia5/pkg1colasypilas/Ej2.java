package guia5.pkg1colasypilas;

import java.util.Stack;

public class Ej2 {
    private Stack<Character> brackets = new Stack();

    public Ej2() {
    }
    
    public boolean balancedBrackets(String expr){
        char []vectorexpr=expr.toCharArray();
        int cont=0;
        for (int x=0; x<vectorexpr.length;x++){
            if (vectorexpr[x]=='{' || vectorexpr[x]=='}' || vectorexpr[x]=='[' || vectorexpr[x]==']' || vectorexpr[x]=='(' || vectorexpr[x]==')'){
                cont++;
            }
        }
        char []vectorexprbra= new char[cont];
        int cont2=cont;
        cont=0;
        for (int x=0; x<vectorexpr.length && cont<cont2;x++){
            if (vectorexpr[x]=='{' || vectorexpr[x]=='}' || vectorexpr[x]=='[' || vectorexpr[x]==']' || vectorexpr[x]=='(' || vectorexpr[x]==')'){
                vectorexprbra[cont]=vectorexpr[x];
                cont++;
            }
        }
        boolean balanced=true, comprobar=true;
        int i=0;
        if (cont2==0){
            balanced=false;
        }
        while (balanced && i<vectorexprbra.length){
            char caracter=vectorexprbra[i];
            if (vectorexprbra[0]=='}' || vectorexprbra[0]=='[' || vectorexprbra[0]=='('){
                balanced=false;
                comprobar=false;
            }
                
            
            if (caracter=='{' || caracter=='[' || caracter=='('){
                brackets.push(caracter);
            }
            
            if (caracter=='}' && comprobar)
            {
                if(brackets.peek().equals('{')){
                    brackets.pop();
                }
                else{
                    balanced=false;
                }
            }
            else if (caracter==']' && comprobar){
                if(brackets.peek().equals('[')){
                    brackets.pop();
                    balanced=true;
                }
                else{
                    balanced=false;
                }
            }
            else if (caracter==')' && comprobar){
                if(brackets.peek().equals('(')){
                    brackets.pop();
                    balanced=true;
                }
                else{
                    balanced=false;
                }
            }
            
            i++;
        }
        if (!brackets.empty()){
            balanced=false;
        }
        return balanced;
    }
}
