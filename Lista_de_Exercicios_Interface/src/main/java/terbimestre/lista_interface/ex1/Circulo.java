package terbimestre.lista_interface.ex1;

/**
 *
 * @author Alan H
 */
public class Circulo implements Desenhavel{
    public Circulo(){
    }

    @Override
    public void desenhar() {
        System.out.println("Densenhando um Círculo...");
    }
}
