public class Anotacoes{
    public static void main(String[] args) {
      Object[] objetos = {new Carro(), "XPTO" };
        for(Object obj: objetos){
           Class c1 = obj.getClass();
           if(c1.isAnnotationPresent(Autoria.class)){
              Autoria a1 =
                   (Autoria)c1.getAnnotation(Autoria.class);
              System.out.println("Classe " + c1.getName() +
                   " escrita por " + a1.autor() + " em " +
                   a1.ano());
           } else {
              System.out.println("Classe " + c1.getName() +
                 " sem autoria definida");
           }
        }
}   }