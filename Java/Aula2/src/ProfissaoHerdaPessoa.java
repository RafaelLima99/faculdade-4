//classe ProfissaoHerdaPessoa herda todos os metodos e atributos da class Pessoa
public class ProfissaoHerdaPessoa extends Pessoa{
    String profissao;
    
    //contrutor recebe os dados
    ProfissaoHerdaPessoa(String nome, String telefone, String profissao){
        //o super acessa o contrutor da class Pessoa (a class herdada)
        //e envia para o construtor da class Pessoa os parametros nome e telefone
        super(nome, telefone);
        //o atributo profissao da class ProfissaoHerdaPessoa recebe profissao
        this.profissao = profissao;
    }
    //o @Override indica que é um metodo sobreescrito (Sobrecarga)
    //esta sobreescrevendo o metodo exibir da class Pessoa
    @Override
    public void exibir(){
        //o super chama o metodo exibir da class herdada Pessoa
        super.exibir();
        System.out.println("A profissão é:" +this.profissao);
    }
    
}
