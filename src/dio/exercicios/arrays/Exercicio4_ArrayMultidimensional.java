package dio.exercicios.arrays;

/*
Gere e imprima uma matriz M 4x4 com valores aleatórios entre 0-9
 */


import java.util.Random;

public class Exercicio4_ArrayMultidimensional {
    public static void main(String[] args) {
        int[][] M = new int[4][4];
        Random aleatorio = new Random();

        for(int i = 0; i < M[0].length; i++){
                for(int j = 0; j < M[0].length; j++){
                    M[i][j] = aleatorio.nextInt(9);
                }
        }

        for(int i = 0; i < M[0].length; i++){
            for(int j = 0; j < M[0].length; j++){
                System.out.print(M[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
