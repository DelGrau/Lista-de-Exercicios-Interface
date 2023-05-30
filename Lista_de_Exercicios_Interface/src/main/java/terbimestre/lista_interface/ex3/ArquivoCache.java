package terbimestre.lista_interface.ex3;

/**
 *
 * @author Alan H
 */
public class ArquivoCache implements Armazenavel{
    String arquivo = "";
    public ArquivoCache(){
    }
    
    @Override
    public void salvar(String pArquivo){
        this.arquivo += pArquivo;
    }
    
    @Override
    public void carregar(){
        System.out.println(this.arquivo);
    }
}
