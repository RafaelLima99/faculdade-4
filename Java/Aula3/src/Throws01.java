
public class Throws01 {
    public int dividir(int a, int b) throws ExececaoCalculo{
        //caso a variavel b for igual a zero entra dentro do if
        //e gera um utilizando a class Excecao
        
        if(b==0){
            //ExececaoCalculo é uma class que esta nesse pacote atual
            throw new ExececaoCalculo(a, b);
        }
        return a/b;
    }
    
    public static void main(String args[]){
        Throws01 t = new Throws01();
        
        try {
            //verifica se existe erro
            //se existir erro cai no bloco catch
            //t.dividir(1, 0) tem que esta obrigatoriamente dentro de um try
            //pois dividir esta usando throws, que endica que esse metodo pode
            //ter algum possivel erro, caso essse metodo não esteja dentro de 
            //um try, ocasionará um erro.
            t.dividir(1, 0);
            
        } catch (ExececaoCalculo e) {
            //exibe o erro
            System.out.println(e.getMessage());
        }
    }
}
