package terbimestre.lista_interface.ex4;

/**
 *
 * @author Alan H
 */
public class Circulo implements Redimensionavel{
    public double raio;
    public Circulo(double pRaio){
        this.raio = pRaio;
    }
    
    @Override
    public void redimensionar(double fator){
        System.out.println("Raio: "+this.raio);
        this.raio *= fator;
        System.out.println("New Raio: "+this.raio);
    }
}
