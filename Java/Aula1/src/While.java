public class While {
    public static void main(String[] args) {
        int[] x1 = {21, 32, 15, 27, 33, 17};
        int posicao = 0;
        int soma = 0;
        //length retorna o numero da quantidade de indecis
        while(posicao< x1.length){
          // Enquanto for menor que o tamanho do vetor
          soma += x1[posicao];
          posicao++;
        }
        System.out.println(soma);    
    }
}
