package terbimestre.lista_interface.ex2;

/**
 *
 * @author Alan H
 */
public class ex2 {
    public static void main(String[] args) {
        int[] array = {50,99,15,2,36,0,99,21};
        BubbleSort bSort = new BubbleSort();
        bSort.ordenar(array);
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("array["+i+"] = "+array[i]);
            
        }
    }
}
