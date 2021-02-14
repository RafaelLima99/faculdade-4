
import java.util.Scanner;
public class If {
    public static void main(String args[]){
        Scanner s1 =new Scanner(System.in);
        System.out.println("DIGITE UM NÚMERO:");
        //armazena o valor digitado na variavel x
        int x = s1.nextInt();
        //se o resto da divisão for igual a zero
        if(x%2==0)
          System.out.println("O NÚMERO É PAR");
        else
          System.out.println("O NÚMERO É ÍMPAR");
     }
}

