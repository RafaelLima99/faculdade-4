public class ClasseInstaciada {
    public static void main(String args[]){
     // Instanciando os objetos c1 e c2
    Class c1 = new Class();
    Class c2 = new Class();

    // Preenchimento dos atributos dos objetos c1 e c2
    c1.nome = "Rafael";
    c1.telefone = "1111-1111";
    c2.nome = "Maria";
    c2.telefone = "2222-2222";

    // Chamada ao método exibir em c1 e c2
    c1.exibir();
    c2.exibir();
    }
}
