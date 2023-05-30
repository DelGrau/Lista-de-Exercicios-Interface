package terbimestre.lista_interface.ex1;

/**
 *
 * @author Alan H
 */
public class ex1 {
    public void main(String[] args){
        Desenhavel circulo = new Circulo();
        Desenhavel retangulo = new Retangulo();
        Desenhavel triangulo = new Triangulo();

        circulo.desenhar();
        retangulo.desenhar();
        triangulo.desenhar();
    }
}
