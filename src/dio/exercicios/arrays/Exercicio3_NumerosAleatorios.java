package dio.exercicios.arrays;

/*
Faça um Programa que leia 20 números inteiros aleatórios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os números e seus sucessores.
*/

import java.util.Random;
import java.util.Scanner;

public class Exercicio3_NumerosAleatorios {
    public static void main(String[] args) {
        int[] vetor = new int[20];
        int vetorTamanho = vetor.length;
        int numero;
        Scanner input = new Scanner(System.in);
        Random aleatorio = new Random();

        for(int i = 0; i < vetorTamanho; i++){
            /* O trecho abaixo considerava que o enunciado queria numeros aleatórios inseridos pelo
            usuário

            while (true) {
                System.out.println("Insira um numero válido(0-100): ");
                numero = input.nextInt();
                if (numero >= 0 && numero <= 100) {
                    vetor[i] = numero;
                    System.out.println("Número " + numero + " inserido na posição " + i + " do vetor!");
                    break;
                }
            }
            */
            numero = aleatorio.nextInt(100);
            vetor[i] = numero;
        }

        System.out.print("Números: [ ");
        for(int j: vetor){
            System.out.print(j + " ");
        }
        System.out.println("]\n");

        System.out.print("Sucessores: [ ");
        for(int j: vetor){
            System.out.print((j + 1) + " ");
        }
        System.out.println("]");
    }
}
