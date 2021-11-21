import Algoritmos.CountSort;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        int[] vetor = new int[] {3, 12, 90,28, 3, 46, 77};

        new CountSort().ordenar(vetor);
        imprimir(vetor, " CountSort");
        

    }


    public static void imprimir(int v[], String ordenador){
        System.out.println("Algoritmo utilizado:" + ordenador);
        for(int i = 0; i < v.length; i++){
            System.out.print(v[i] + " ");
        }
    }


}
