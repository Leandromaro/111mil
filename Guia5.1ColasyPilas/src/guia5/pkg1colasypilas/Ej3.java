package guia5.pkg1colasypilas;

import java.util.LinkedList;
import java.util.Queue;

public class Ej3 {

    public Ej3() {
    }
    
    public void cargaOrdenada(Queue<Integer> q){
        int limite=(int)(Math.random()*9+1);
        int numeros[] = new int [limite], aux;
        for(int x=0;x<limite;x++){
            numeros[x]=(int)(Math.random()*9+1);
        }
        for (int i=0;i<limite;i++){
            for(int j=0;j<limite;j++){
                if (numeros[i]<numeros[j]){
                    aux=numeros[i];
                    numeros[i]=numeros[j];
                    numeros[j]=aux;
                }
            }
        }
        for (int i=0;i<limite;i++){
            q.add(numeros[i]);
        }
    }
    
    public Queue merge(Queue <Integer> q1, Queue <Integer> q2){
        Queue<Integer> q3 = new LinkedList<>();
        boolean bandera=true, q1b=false;
         while (bandera && (q1.peek()!=null && q2.peek()!=null)){
             if (q1.peek()<=q2.peek()){
                 q3.add(q1.poll());
             }
             else{
                 q3.add(q2.poll());
             }
             if(q1.peek()==null){
                 bandera=false;
                 q1b=true;
             }
             else if(q1.peek()==null){
                 bandera=false;
             }
         }
         if(q1b){
             while(q2.peek()!=null){
                 q3.add(q2.poll());
             }
         }
         else{
             while(q1.peek()!=null){
                 q3.add(q1.poll());
             }
         }
        return q3;
    }
}
