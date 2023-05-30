package terbimestre.lista_interface.ex3;

/**
 *
 * @author Alan H
 */
public class ex3 {
    public static void main(String[] args) {
    ArquivoCache cache = new ArquivoCache();
    
        cache.salvar("Gotta ");
        cache.salvar("catch");
        cache.salvar(" 'em ");
        cache.salvar("All!");
        
        cache.carregar();
    }
}
