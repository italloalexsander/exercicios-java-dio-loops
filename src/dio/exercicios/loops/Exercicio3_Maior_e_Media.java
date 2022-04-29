package dio.exercicios.loops;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/

import java.util.Scanner;

public class Exercicio3_Maior_e_Media {
    public static void main(String[] args) {
        double maior = 0d;
        double media = 0d;
        double notaAtual = 0d;
        int contador = 0;
        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Digite a nota " + (contador+1) + ": ");
            notaAtual = input.nextDouble();
            media += notaAtual;
            if(notaAtual > maior) {
                maior = notaAtual;
            }
             contador++;
        }while(contador < 5);

        media /= contador;

        System.out.println("A maior nota foi: " + maior);
        System.out.println("E a média foi: " + media);

    }
}
