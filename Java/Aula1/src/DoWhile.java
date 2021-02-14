import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int soma = 0;
    int valor;
    do{
      System.out.print("Digite um numero (0 para sair):");
      valor = teclado.nextInt();
      soma += valor;
    } while(valor != 0);
    System.out.printf("\nA soma dos numeros "+
                      "digitados e: %d\n",soma);
  }
}
