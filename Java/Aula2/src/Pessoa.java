public class Pessoa {
    String nome;
    String telefone;
    
    //contrutor recebe por paramento o nome e o telefone
    Pessoa(String nome, String telefone){
        //atributo nome recebe nome
        this.nome = nome;
        //atributo telefone recebe telefone
        this.telefone = telefone;
    }
    
    public void exibir(){
        System.out.println(nome);
        System.out.println(telefone);
    }
}
