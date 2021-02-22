import java.util.HashMap;
import java.util.Scanner;

public class Colecao02 {
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        HashMap<Integer,String> produtos = new HashMap<>();
        
         int opcao;
      do{
         System.out.println("Digite 1 para incluir, "+
                           "2 para consultar, 0 para sair");
         opcao = teclado.nextInt();
         switch(opcao){
            case 1:
               System.out.println("Código do novo produto:");
               int codigoN = teclado.nextInt();
               System.out.println("Nome do novo produto:");
               String nomeN = teclado.next();
               //insere o codigo e o nome(o codigo e o nome ficam interligados 
               //como se ocodigoN fosse uma Key de um array e o nome fosse o dado)
               produtos.put(codigoN, nomeN);
               break;
            case 2:
               System.out.println("Digite o código:");
               int codigo = teclado.nextInt();
               //metodo get pega o nome que esta associado ao codigo
               String nome = produtos.get(codigo);
               if(nome!=null)
                  System.out.println(nome);
               break;
         }
      } while(opcao!=0);
        
        
    }
}   
