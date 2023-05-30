package terbimestre.lista_interface.ex2;

/**
 *
 * @author Alan H
 */
public class BubbleSort implements Ordenavel{
    public BubbleSort(){
    }
    
    @Override
    public void ordenar(int[] array){
        int aux;
        for(int i = 0; i<array.length ; i++){
            for(int j = 1; j<array.length; j++){
                if(array[j-1]>=array[j]){
                    aux = array[j-1];
                    array[j-1] = array[j];
                    array[j] = aux;
                }
            }
            aux = 0;
        }
    }
    
    public void bubbleSort(int[] array){
        ordenar(array);
    }
}
