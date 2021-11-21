package Algoritmos;

import java.util.Arrays;
import java.util.OptionalInt;

public class CountSort {
    /*
    Caracterísitcas:
    Serve para ordenar vetores de tipos inteiros não negativos

    Eficiência:
    O(n)

    Como funciona?
    RESUMINHO
    "Vetor auxiliar e original
    Vetor auxiliar é contador de frequencia
    "
    vetor principal 9 8 6 10 4 3 7
                    0 1 2 3  4 5 6 
    Qual o maior valor armazenado? 10

    vetor auxiliar m + 1 onde m = 10

    vetor auxiliar  
                    0 1 2 3 4 5 6 7 8 9 10 

    qual o primeiro elemento do vetor original? 9
    Então no índice 9 eu coloco o valor 1, ou seja, apareceu uma vez.
    qual o próximo elemento? 8
    Então no índice 8 eu coloco o valor 1, ou seja, apareceu uma vez.

    Ou seja, o vetor auxiliar serve como contador de frequência dos elementos do vetor original, onde cada índice corresponde a cada elemento do vetor original.

    Agora eu percorro o vetor auxiliar e vou colocando o índice de quem possui um, no vetor original

    veotr auxiliar  0 1 2 3 4 5 6 7 8 9 10
                          1 1   1 1 1 1  1
    vetor original  3 4 6 7 8 9 10
                    0 1 2 3 4 5 6
                    ]
    Obs: se um elemento tiver mais que um de frequencia, na hora de preencher o vetor original. acrescento o elemento com a qtd de vezes
    que me apareceu.


    */
    
    private int maiorElemento = 0;
    
    public void ordenar(int v[]){
        maiorElemento = encontrarMaiorElemento(v);
        int aux[] = new int[maiorElemento + 1];

        for(int i = 0; i < v.length; i++){
            aux[v[i]] ++;
        }
        int indice = 0;
        for(int i= 0; i< aux.length; i++){
            while(aux[i] > 0){
                v[indice] = i;
                indice++;
                aux[i]--;
            }
            
        }
    }

    public int encontrarMaiorElemento(int v[]){
        int maiorElemento = 0;
        for(int i =0; i < v.length; i++){
            if(v[i] > maiorElemento){
                maiorElemento = v[i];
            }
        }

        return maiorElemento;
    }

    public OptionalInt encontrarMaiorElementoComStream(int v[]){
        return Arrays.stream(v).max();
    }
}
