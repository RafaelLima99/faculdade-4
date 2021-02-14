public class Operadores {
    public static void main(String args[]){
        //variaveis inteiras
        int a = 5, b = 32, c = 7;
        /*----- Parte do Println  ----------*/
        //%d receberá um valor inteiro em sequencia
        // \t para representar uma tabulação (simaula a tecla tab: 4 espaços)
        // \n é utilizado para pular de linha
        System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
        
        b = b - c;
        b /= a;
        
        System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
        
        b = a ^ c;
        
        System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
        
        b++;
        
        System.out.printf("A: %d\t B: %d\t C:%d\n",a,b,c);
    }
}
