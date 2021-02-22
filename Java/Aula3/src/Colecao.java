
//importação
import java.util.ArrayList;

public class Colecao {
    public static void main(String args[]){
        ArrayList<String> lista = new ArrayList<>();
        
        lista.add("Primeiro");
        lista.add("Segundo");
        lista.add("Terceiro");
        
        //variável x receberá o primeiro valor da lista na primeira rodada, em
        //seguida, o segundo e finalmente o terceiro, imprimindo o valor 
        //recebido a cada rodada.
        for(String x: lista){
            System.out.println(x);
        }
        
    }
}
