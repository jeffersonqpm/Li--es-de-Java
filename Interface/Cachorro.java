package Interface;

public class Cachorro implements Animal {

    @Override
    public void emitirSom() {
        System.out.println("Cachorro faz Au Au!");
    }

    @Override
    public void dormir() {
        System.out.println("Cachorro dorme no sofá");

    }

}
