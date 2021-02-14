public class OperadoresLogicos {
    public static void main(String args[]){
        int a = 5, b = 32, c = 7;
        boolean x;
        x = a < b;
        System.out.println("PASSO 1: "+x);
        x = (b > a) && (c > b);
        System.out.println("PASSO 2: "+x);
        b /= a -= 1;
        c++;
        x = (b==c);
        System.out.println("PASSO 3: "+x);
    }
}
