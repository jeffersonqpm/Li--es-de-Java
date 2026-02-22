package Interface;

public class Main {

    public static void main(String[] args) {
        Animal meuGato = new Gato();
        Animal meuCachorro = new Cachorro();

        meuGato.emitirSom();
        meuGato.dormir();
        System.out.println("==============================================");

        meuCachorro.emitirSom();
        meuCachorro.dormir();

        
    }

    
}
