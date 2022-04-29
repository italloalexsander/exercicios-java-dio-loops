package dio.exercicios.arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Exercicio2_Consoantes {
    public static void main(String[] args) {
        String[] vetor = new String[6];
        int[] vetorAuxiliar = new int[6]; //Vai manter os indices das consoantes
        int contador = 0, contadorConsoantes = 0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Insira a letra: ");
            vetor[contador] =  input.next();
            if(vetor[contador].equals("a")||
                    vetor[contador].equals("e")||
                    vetor[contador].equals("i")||
                    vetor[contador].equals("o")||
                    vetor[contador].equals("u")
            ){
                contador++;
            }else{
                vetorAuxiliar[contador] = 1;
                contador++;
                contadorConsoantes++;
            }
        }while(contador < 6);

        System.out.println("Número de consoantes: " + contadorConsoantes);

        for(int i = 0; i < contador; i++){
            if(vetorAuxiliar[i] == 1){
                System.out.print(vetor[i] + " ");
            }
        }
    }
}
