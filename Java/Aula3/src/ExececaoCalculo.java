
// temos um construtor que recebe dois valores inteiros, e chama o construtor de
// Exception, com o uso de super, passando a mensagem correta.
public class ExececaoCalculo  extends Exception{
    
    public ExececaoCalculo(int a, int b){
    super("Erro com os numeros "+a+" e "+b);
    
  } 
}
