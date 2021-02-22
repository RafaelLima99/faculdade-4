
import java.lang.reflect.Field;
public class Reflexividade {
    public static void main(String[] args) throws Exception {
        Object objeto = Class.forName("ReflexividadePessoa").newInstance();
        Class classe = objeto.getClass();
        // Reconhecendo os atributos do objeto...
        for(Field f: classe.getFields())
            System.out.println(f.getName()+"::"+f.getType());
        // Alterando os valores e invocando o método...
        classe.getField("nome").set(objeto,"João");
        classe.getField("telefone").set(objeto,"1111-1111");
        classe.getMethod("exibir", int.class).invoke(objeto, 2);
     }
}
