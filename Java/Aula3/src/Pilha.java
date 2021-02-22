//classe genérica de Pilha podendo ser observada a presença da lacuna 
//definida pela letra K, pode atribuir qualquer letra ou nome
//A letra K representa algo genérico 
public class Pilha<K> {
    
    // inner class chamada NoPilha: uma classe utilitária interna, que 
    //só pode ser utilizada na programação da classe Pilhauma classe  utilitária 
    //interna, que só pode ser utilizada na programação da classe Pilha
    class NoPilha<K> {
        //atributo dado do tipo K 
        K dado;
        //atributo pilha do tipo NoPilha<K> que é a inner class 
        NoPilha<K> proximo;
    }
    
    //atribut topo de NoPilha recebe null
    private NoPilha<K> topo = null;
    
    
    public void empilhar(K dado){
        //instancia a class NoPilha
        NoPilha<K> novo = new NoPilha<>();
        
        //atribuição de dados nos atributos de NoPilha
        novo.dado = dado;
        novo.proximo = topo;
        topo = novo;        
    }
    
    public K desempilhar(){
        //verifica se a variavel topo é igual a null
        if(topo == null){
            return null;
        }
        
        //variavel antigo do tipo NoPilha é igual a topo(topo é igual a instacia
        // de NoPilha)
        NoPilha<K> antigo = topo;
        topo = topo.proximo;
        return antigo.dado;
    }
    
    public static void main(String args[]){
        //instacia a class Pilha
        Pilha pilha1 = new Pilha<>();
        //empliha
        pilha1.empilhar(5);
        pilha1.empilhar(7);
        pilha1.empilhar(9);
        
        Integer x;
        
        //enquanto x for diferente de null
        while((x = (Integer) pilha1.desempilhar())!= null){
            //imprime o valor que está em x
            System.out.println(x);
        }
    }
}
