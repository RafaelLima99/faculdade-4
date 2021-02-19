public class CachorroHerdaMamifero extends MamiferoAbstract{
    
    public CachorroHerdaMamifero() {
        //atribui canide no atributo familia da class MamiferoAbstract
        familia = "Canidae";
    }
    
    //sobreescreve o metodo mamar da class MamiferoAbstract
    @Override
    public void mamar(){
        System.out.println("Cachorro mamando...");
    }
}
